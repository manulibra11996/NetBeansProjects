/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.aaa_juevesinfinito.domains;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

/**
 *
 * @author Manuel
 */
@Entity(name = "PROYECTO")
public class Proyecto implements Serializable{

    @Id
    @Column(name = "id_proyecto")
    private int idProyecto;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "max_horas")
    private int maxHoras;
    @ManyToMany
    @JoinTable(
            name = "TAREA",
            joinColumns = {@JoinColumn(name = "id_proyecto")},
            inverseJoinColumns = {@JoinColumn(name = "id_emp")})
    private List<Emp> emps;

    public int getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMaxHoras() {
        return maxHoras;
    }

    public void setMaxHoras(int maxHoras) {
        this.maxHoras = maxHoras;
    }

    public List<Emp> getEmps() {
        return emps;
    }

    public void setEmps(List<Emp> emps) {
        this.emps = emps;
    }

}
