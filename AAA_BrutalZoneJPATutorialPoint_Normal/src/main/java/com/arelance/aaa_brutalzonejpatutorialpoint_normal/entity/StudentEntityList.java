/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.aaa_brutalzonejpatutorialpoint_normal.entity;

import java.util.ArrayList;
import java.util.List;
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
@Table(name="student")  
public class StudentEntityList {  
  
    @Id 
    @Column(name = "s_id")
    private int id;
    @Column(name = "s_name")
    private String name;
    @Column(name = "s_edad")
    private int age;
    
    @ElementCollection  
    private List<Address> address=new ArrayList<Address>();  

    public StudentEntityList(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    
    public StudentEntityList(int id) {
        this.id = id;
    }
    
    public StudentEntityList() {  
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

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }
      
}
