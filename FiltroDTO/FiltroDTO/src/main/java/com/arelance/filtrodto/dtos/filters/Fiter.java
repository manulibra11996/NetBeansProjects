/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.filtrodto.dtos.filters;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public abstract class Fiter {
    
    protected  String sqlSentecnce="";
    
    protected static final List<Fiter> fiters=new ArrayList<>();

    

    public Fiter buiderFiter(Fiter fiter) {
     fiters.add(fiter);
     return  fiter;
    }
    
    
    public abstract String execute();

    public String getSqlSentecnce() {
        return sqlSentecnce;
    }

    public void setSqlSentecnce(String sqlSentecnce) {
        this.sqlSentecnce = sqlSentecnce;
    }
    
    
}
