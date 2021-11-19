/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.institutomunicipaldeportesalfa.facade;

import com.arelance.institutomunicipaldeportesalfa.domain.Paypal;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author usuario
 */
@Local
public interface PaypalFacadeLocal {

    void create(Paypal paypal);

    void edit(Paypal paypal);

    void remove(Paypal paypal);

    Paypal find(Object id);

    List<Paypal> findAll();

    List<Paypal> findRange(int[] range);

    int count();
    
}
