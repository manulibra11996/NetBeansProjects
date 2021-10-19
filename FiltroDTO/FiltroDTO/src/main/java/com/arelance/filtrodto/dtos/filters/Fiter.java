/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.filtrodto.dtos.filters;

import java.util.List;

/**
 *
 * @author Admin
 */
public interface Fiter {

    public static String getSqlSentecnce(List<Fiter> fiters) {
        String sqlSentecnce = "";
        for (Fiter fiter : fiters) {
            sqlSentecnce = sqlSentecnce.concat(fiter.execute()).concat(" ");
        }
        return sqlSentecnce.trim();
    }

    public abstract String execute();
}
