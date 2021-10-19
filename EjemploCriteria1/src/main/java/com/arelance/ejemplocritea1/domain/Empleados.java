/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.ejemplocritea1.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Manuel
 */
@Entity
@Table(name = "empleados")
@NamedQueries({
    @NamedQuery(name = "Empleados.findAll", query = "SELECT e FROM Empleados e"),
    @NamedQuery(name = "Empleados.findByEid", query = "SELECT e FROM Empleados e WHERE e.eid = :eid"),
    @NamedQuery(name = "Empleados.findByEname", query = "SELECT e FROM Empleados e WHERE e.ename = :ename"),
    @NamedQuery(name = "Empleados.findBySalary", query = "SELECT e FROM Empleados e WHERE e.salary = :salary"),
    @NamedQuery(name = "Empleados.findByDeg", query = "SELECT e FROM Empleados e WHERE e.deg = :deg")})
public class Empleados implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "Eid")
    private Integer eid;
    @Column(name = "Ename")
    private String ename;
    @Basic(optional = false)
    @Column(name = "Salary")
    private double salary;
    @Column(name = "Deg")
    private String deg;
    @JoinColumn(name = "Did", referencedColumnName = "Did")
    @ManyToOne
    private Departamentos did;

    public Empleados() {
    }

    public Empleados(Integer eid) {
        this.eid = eid;
    }

    public Empleados(Integer eid, double salary) {
        this.eid = eid;
        this.salary = salary;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDeg() {
        return deg;
    }

    public void setDeg(String deg) {
        this.deg = deg;
    }

    public Departamentos getDid() {
        return did;
    }

    public void setDid(Departamentos did) {
        this.did = did;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eid != null ? eid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empleados)) {
            return false;
        }
        Empleados other = (Empleados) object;
        if ((this.eid == null && other.eid != null) || (this.eid != null && !this.eid.equals(other.eid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.arelance.jpacriteriaejemplo1.domain.Empleados[ eid=" + eid + " ]";
    }

}
