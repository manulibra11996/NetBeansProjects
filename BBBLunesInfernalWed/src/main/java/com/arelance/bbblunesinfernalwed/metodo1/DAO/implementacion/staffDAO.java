/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.bbblunesinfernalwed.metodo1.DAO.implementacion;

import com.arelance.bbblunesinfernalwed.metodo1.DAO.staff;
import com.arelance.bbblunesinfernalwed.metodo1.domains.Staff;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Manuel
 */
public class staffDAO implements staff{

    @PersistenceContext(unitName = "Eclipselink_JPA")
    EntityManager em;

    @Override
    public List<Staff> obtener() {
        return em.createNamedQuery("Staff.findAll").getResultList();
    }
    
}
