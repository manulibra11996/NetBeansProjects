/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.aaa_brutalzonejpatutorialpoint_normal.entity;

import java.util.Map;
import java.util.HashMap;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Manuel
 */
@Entity
@Table(name = "student")
public class StudentEntityMaps {

    @Id
    @Column(name = "s_id")
    private int id;
    @Column(name = "s_name")
    private String name;
    @Column(name = "s_edad")
    private int age;

    @ElementCollection
    private Map<Integer, Address> map = new HashMap<Integer, Address>();

    public StudentEntityMaps(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public StudentEntityMaps(int id) {
        this.id = id;
    }

    public StudentEntityMaps() {
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

    public Map<Integer, Address> getMap() {
        return map;
    }

    public void setMap(Map<Integer, Address> map) {
        this.map = map;
    }

}
