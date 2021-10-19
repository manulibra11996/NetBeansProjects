/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.a_trolllunesthurnder.controler;

import com.arelance.a_trolllunesthurnder.domains.ContadorPrecioDTO;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Manuel
 */
public class jpqlDTO {

    public static void main(String[] args) {
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("criteria_samples");
        EntityManager entitymanager = emfactory.createEntityManager();

        //Scalar function
        Query query = entitymanager.createQuery("select new com.arelance.a_trolllunesthurnder.domains.ContadorPrecioDTO(count(i.itemPrice),i.itemPrice) "
                + "from Item i group by i.itemPrice having count(i.itemPrice) > 1",
                ContadorPrecioDTO.class);
        List<ContadorPrecioDTO> list = query.getResultList();

        for (ContadorPrecioDTO contadorPrecioDTO : list) {
            System.out.println(contadorPrecioDTO.getContador());
        }

        entitymanager.close();
        emfactory.close();
    }
}
