/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.aaa_brutalzonejpatutorialpoint_normal.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Manuel
 */
@Entity
@Table(name = "student")
public class StudentEntityAsig {

    @Id
    @Column(name = "s_id")
    private int id;
    @Column(name = "s_name")
    private String name;
    @Column(name = "s_edad")
    private int age;

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private Asignatura asig;

    public StudentEntityAsig(int id, String name, int age, Asignatura asig) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.asig = asig;
    }

    public StudentEntityAsig() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Asignatura getAsig() {
        return asig;
    }

    public void setAsig(Asignatura asig) {
        this.asig = asig;
    }

}
