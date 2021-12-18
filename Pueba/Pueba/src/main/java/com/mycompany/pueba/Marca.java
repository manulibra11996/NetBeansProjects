/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pueba;

import javax.annotation.ManagedBean;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author lenovo
 */
@ManagedBean
@Named(value = "marca")
@RequestScoped
public class Marca {

    private String mlabel;
    private String mvalue;
    private String[] mtlf;
    public Marca() {
    }

    public Marca(String mlabel, String mvalue) {
        this.mlabel = mlabel;
        this.mvalue = mvalue;
    }

    public String getMlabel() {
        return mlabel;
    }

    public void setMlabel(String mlabel) {
        this.mlabel = mlabel;
    }

    public String getMvalue() {
        return mvalue;
    }

    public void setMvalue(String mvalue) {
        this.mvalue = mvalue;
    }

    public String[] getMtlf() {
        return mtlf;
    }

    public void setMtlf(String[] mtlf) {
        this.mtlf = mtlf;
    }

  
    private Marca[] m1;

    public Marca[] getM1() {
        return m1;
    }

    public void setM1(Marca[] m1) {
        this.m1 = m1;
    }

	public Marca[] getMobValue() {

		m1 = new Marca[4];
		m1[0] = new Marca("Sony", "Sony");
		m1[1] = new Marca("Nokia", "Nokia");
		m1[2] = new Marca("Huawei", "Huawei");
		m1[3] = new Marca("Iphone", "Iphone");
		return m1;
	}
}
