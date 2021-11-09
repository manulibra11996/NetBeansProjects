/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cdidemo2;

import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author manuel
 */
@Named
@RequestScoped
public class ItemProcessor {
     @Inject 
    private ItemDao itemDao;

    @Inject
    private ItemValidator itemValidator;

    public void execute() {
      List<Item>  items = itemDao.fetchItems();
      for (Item item : items) {
          System.out.println(*"Item = " + item + " valid = " + itemValidator.isValid(item)*);
      }
    }
}
