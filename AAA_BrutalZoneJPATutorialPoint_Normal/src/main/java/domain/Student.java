/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Manuel
 */
@Entity 
public class Student {
    
    @Id  
    private int id;
    private String name;
    private long fees;

    public Student() {
    }

    public Student(int id, String name, long fees) {
        this.id = id;
        this.name = name;
        this.fees = fees;
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

    public long getFees() {
        return fees;
    }

    public void setFees(long fees) {
        this.fees = fees;
    }
    
    
}
