/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cdidemo2;

import javax.enterprise.inject.Alternative;

/**
 *
 * @author manuel
 */
@Alternative
public class RelaxedItemValidator implements ItemValidator{
    
    @Override
    public boolean isValid(Item item) {
        return item.getValue() < (item.getLimit() * 2);
    }
}
