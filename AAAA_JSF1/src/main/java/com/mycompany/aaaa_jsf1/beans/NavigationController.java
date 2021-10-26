/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aaaa_jsf1.beans;

import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

/**
 *
 * @author manuel
 */
@ManagedBean(name = "navigationController")
@RequestScoped
public class NavigationController {

//    @ManagedProperty(value = "#{param.pageId}")
//    private String pageId;

    /**
     * Creates a new instance of NavigationController
     */
    public NavigationController() {
        super();
    }

//    public String showPage() {
//        if (pageId == null) {
//            return "inicio";
//        }
//        if (pageId.equals("1")) {
//            return "destino";
//        } else if (pageId.equals("2")) {
//            return "diferente";
//        } else {
//            return "inicio";
//        }
//    }

    public String processPage1() {
        return "page";
    }

    public String processPage2() {
        return "page";
    }
}
