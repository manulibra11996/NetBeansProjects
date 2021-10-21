/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.a_trolmartesthurnder.facade;

import com.arelance.a_trolmartesthurnder.entity.Empleado;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Manuel
 */
public abstract class AbstractFacade<T> {

    private Class<T> entityClass;

    public AbstractFacade(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    protected abstract EntityManager getEntityManager();

    /**
     * 
     * @param entity recibe un entity para añadirlo en la base de datos
     */
    public void create(T entity) {
        getEntityManager().persist(entity);
    }

    /**
     * 
     * @param entity recibe un entity para modificarlo en la base de datos
     */
    public void edit(T entity) {
        getEntityManager().merge(entity);
    }

    /**
     * 
     * @param entity recibe un entity para eliminarlo en la base de datos
     */
    public void remove(T entity) {
        getEntityManager().remove(getEntityManager().merge(entity));
    }

    /**
     * 
     * @param id recibe el id del empleado
     * @return devuelve un empleado
     */
    public T find(Object id) {
        return getEntityManager().find(entityClass, id);
    }

    /**
     * 
     * @return devuelve todos los datos de la base de datos
     */
    public List<T> findAll() {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        return getEntityManager().createQuery(cq).getResultList();
    }

    /**
     * 
     * @param range recibe un rango de id de empleados
     * @return  devuelve los empleados que estan en el rango de id pasados
     */
    public List<T> findRange(int[] range) {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        javax.persistence.Query q = getEntityManager().createQuery(cq);
        q.setMaxResults(range[1] - range[0] + 1);
        q.setFirstResult(range[0]);
        return q.getResultList();
    }

    /**
     * 
     * @return devuelve el numero de empleados que estan en la base de datos
     */
    public int count() {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        javax.persistence.criteria.Root<T> rt = cq.from(entityClass);
        cq.select(getEntityManager().getCriteriaBuilder().count(rt));
        javax.persistence.Query q = getEntityManager().createQuery(cq);
        return ((Long) q.getSingleResult()).intValue();
    }

    /**
     * 
     * @param nombre recibe el nombre del departamento que se busca
     * @return devuelve los empleados de un departamento concreto
     */
    public List<T> findDep(String nombre) {
        CriteriaQuery<Empleado> criteriaQuery = getEntityManager().getCriteriaBuilder().createQuery(Empleado.class);
        Root<Empleado> from = criteriaQuery.from(Empleado.class);
        CriteriaQuery<Empleado> select = criteriaQuery.select(from);
        select.where(getEntityManager().getCriteriaBuilder().equal(from.get("empDep"), nombre));
        TypedQuery<Empleado> typedQuery = getEntityManager().createQuery(select);
        return (List<T>) typedQuery.getResultList();
    }
    
    /**
     * 
     * @return Devuelve el numero de departamentos con 2 o mas empleados
     */
    public  List<Long> DepartamentosMayores1() {
        CriteriaQuery<Long> criteriaQuery = getEntityManager().getCriteriaBuilder().createQuery(Long.class);
        CriteriaQuery select = criteriaQuery.select(getEntityManager().getCriteriaBuilder().count(
                        criteriaQuery.from(entityClass).get("empDep"))).
                groupBy(criteriaQuery.from(entityClass).get("empDep")).
                having(getEntityManager().getCriteriaBuilder().gt(getEntityManager().getCriteriaBuilder().count(
                        criteriaQuery.from(entityClass).get("empDep")), 1));
        TypedQuery<Long> typedQuery = getEntityManager().createQuery(select);
        return (List<Long>) typedQuery.getResultList();
    }
    
    /**
     * 
     * @return devuelve el listado de empleados ordenados de forma ascendente por el salario
     */
    public  List<T> OrdenAscendente() {
        CriteriaQuery<Empleado> criteriaQuery = getEntityManager().getCriteriaBuilder().createQuery(Empleado.class);
        Root<Empleado> from = criteriaQuery.from(Empleado.class);
        CriteriaQuery<Empleado> select = criteriaQuery.select(from);
        criteriaQuery.orderBy(getEntityManager().getCriteriaBuilder().asc(from.get("empSalary")));
        TypedQuery<Empleado> typedQuery = getEntityManager().createQuery(select);
        return (List<T>) typedQuery.getResultList();
    }
    
    /**
     * 
     * @return devuelve el listado de empleados ordenados de forma descendente por el salario
     */
    public  List<T> OrdenDescendente() {
        CriteriaQuery<Empleado> criteriaQuery = getEntityManager().getCriteriaBuilder().createQuery(Empleado.class);
        Root<Empleado> from = criteriaQuery.from(Empleado.class);
        CriteriaQuery<Empleado> select = criteriaQuery.select(from);
        criteriaQuery.orderBy(getEntityManager().getCriteriaBuilder().desc(from.get("empSalary")));
        TypedQuery<Empleado> typedQuery = getEntityManager().createQuery(select);
        return (List<T>) typedQuery.getResultList();
    }
}
