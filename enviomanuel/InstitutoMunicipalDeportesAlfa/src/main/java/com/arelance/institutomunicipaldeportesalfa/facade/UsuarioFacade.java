/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.institutomunicipaldeportesalfa.facade;

import com.arelance.institutomunicipaldeportesalfa.facade.AbstractFacade;
import com.arelance.institutomunicipaldeportesalfa.domain.Usuario;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

/**
 *
 * @author usuario
 */
@Stateless
public class UsuarioFacade extends AbstractFacade<Usuario> implements UsuarioFacadeLocal {

    @PersistenceContext(unitName = "IMDBGabriel")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsuarioFacade() {
        super(Usuario.class);
    }

    @Override
    public Usuario findEmail(Usuario email) {
        CriteriaQuery<Usuario> criteriaQuery = getEntityManager().getCriteriaBuilder().createQuery(Usuario.class);
        Root<Usuario> from = criteriaQuery.from(Usuario.class);
        CriteriaQuery<Usuario> select = criteriaQuery.select(from);
        Predicate predicate = getEntityManager().getCriteriaBuilder().in(from.get("emailUsuario"));
        select.where(predicate);
        return email;
    }
    
}
