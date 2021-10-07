/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.aaa_juevesinfinito.DAO.impl;

import com.arelance.aaa_juevesinfinito.DAO.DeptDAO;
import com.arelance.aaa_juevesinfinito.domains.Dept;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author lenovo
 */
@Stateless
public class DeptDAOImpl implements DeptDAO {

    @PersistenceContext(unitName = "JavaAFondo")
    EntityManager em;

    @Override
    public List<Dept> ListarDept() {
        return em.createNamedQuery("Dept.findAll").getResultList();
    }

    @Override
    public void AñadirDept(Dept dept) {
        em.persist(dept);
    }

    @Override
    public void ModificarDept(Dept dept) {
        em.merge(dept);
    }

    @Override
    public void RemoverDept(Dept dept) {
        em.remove(em.merge(dept));
    }

}
