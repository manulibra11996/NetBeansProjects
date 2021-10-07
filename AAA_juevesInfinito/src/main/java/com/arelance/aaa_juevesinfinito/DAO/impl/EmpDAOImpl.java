/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.aaa_juevesinfinito.DAO.impl;

import com.arelance.aaa_juevesinfinito.DAO.EmpDAO;
import com.arelance.aaa_juevesinfinito.domains.Emp;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author lenovo
 */
@Stateless
public class EmpDAOImpl implements EmpDAO {

    @PersistenceContext(unitName = "JavaAFondo")
    EntityManager em;

    @Override
    public List<Emp> ListarEmp() {
        return em.createNamedQuery("Emp.findAll").getResultList();
    }

    @Override
    public void AñadirEmp(Emp emp) {
        em.persist(emp);
    }

    @Override
    public void ModificarEmp(Emp emp) {
        em.merge(emp);
    }

    @Override
    public void RemoverEmp(Emp emp) {
        em.remove(em.merge(emp));
    }

   

}
