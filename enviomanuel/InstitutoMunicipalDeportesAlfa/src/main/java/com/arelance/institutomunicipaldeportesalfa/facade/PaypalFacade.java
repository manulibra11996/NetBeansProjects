/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.institutomunicipaldeportesalfa.facade;

import com.arelance.institutomunicipaldeportesalfa.facade.AbstractFacade;
import com.arelance.institutomunicipaldeportesalfa.domain.Paypal;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author usuario
 */
@Stateless
public class PaypalFacade extends AbstractFacade<Paypal> implements PaypalFacadeLocal {

    @PersistenceContext(unitName = "IMDBGabriel")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PaypalFacade() {
        super(Paypal.class);
    }
    
}
