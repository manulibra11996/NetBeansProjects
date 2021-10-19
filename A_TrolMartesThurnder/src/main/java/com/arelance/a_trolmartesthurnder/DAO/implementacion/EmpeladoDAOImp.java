/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.a_trolmartesthurnder.DAO.implementacion;

import com.arelance.a_trolmartesthurnder.DAO.EmpleadoDAO;
import com.arelance.a_trolmartesthurnder.entity.Empleado;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaDelete;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.criteria.Root;

/**
 *
 * @author lenovo
 */
@Stateless
public class EmpeladoDAOImp implements EmpleadoDAO {

    @PersistenceContext(unitName = "criteria")
    EntityManager em;

    CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();

    @Override
    public List<Empleado> ListarEmpleados() {
        CriteriaQuery<Empleado> criteriaQuery = criteriaBuilder.createQuery(Empleado.class);
        Root<Empleado> from = criteriaQuery.from(Empleado.class);
        CriteriaQuery<Empleado> select = criteriaQuery.select(from);
        TypedQuery<Empleado> typedQuery = em.createQuery(select);
        return typedQuery.getResultList();
    }

    @Override
    public void AñadirEmpleado(Empleado empleado) {
        em.persist(empleado);
    }

    @Override
    public void ModificarEmpleado(Empleado empleado) {
        CriteriaUpdate<Empleado> criteriaUpdate = criteriaBuilder.createCriteriaUpdate(Empleado.class);
        Root<Empleado> root = criteriaUpdate.from(Empleado.class);
        criteriaUpdate.set("empName", empleado.getEmpName());
        criteriaUpdate.set("empLastName", empleado.getEmpLastName());
        criteriaUpdate.set("empSalary", empleado.getEmpSalary());
        criteriaUpdate.where(criteriaBuilder.equal(root.get("idempleado"), empleado.getIdempleado()));
        em.getTransaction().begin();
        em.createQuery(criteriaUpdate).executeUpdate();
        em.getTransaction().commit();
    }

    @Override
    public void RemoverEmpleado(Empleado empleado) {
        CriteriaDelete<Empleado> criteriaDelete = criteriaBuilder.createCriteriaDelete(Empleado.class);
        Root<Empleado> root = criteriaDelete.from(Empleado.class);
        criteriaDelete.where(criteriaBuilder.greaterThan(root.get("empName"), empleado.getEmpName()));

        em.getTransaction().begin();
        em.createQuery(criteriaDelete).executeUpdate();
        em.getTransaction().commit();
    }

    @Override
    public Empleado BuscarId(int id) {
        CriteriaQuery<Empleado> criteriaQuery = criteriaBuilder.createQuery(Empleado.class);
        Root<Empleado> from = criteriaQuery.from(Empleado.class);
        CriteriaQuery<Empleado> select = criteriaQuery.select(from);
        select.where(criteriaBuilder.greaterThan(from.get("idempleado"), id));
        TypedQuery<Empleado> typedQuery = em.createQuery(select);
        return typedQuery.getSingleResult();
    }

}
