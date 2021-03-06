/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.estrategiademesaunica.metodo2.domains;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 *
 * @author Manuel
 */
@Entity
@PrimaryKeyJoinColumn(referencedColumnName = "sid")

public class TeachingStaff2 extends Staff2 {

    private String qualification;
    private String subjectexpertise;

    public TeachingStaff2(int sid, String sname, String qualification, String subjectexpertise) {
        super(sid, sname);
        this.qualification = qualification;
        this.subjectexpertise = subjectexpertise;
    }

    public TeachingStaff2() {
        super();
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getSubjectexpertise() {
        return subjectexpertise;
    }

    public void setSubjectexpertise(String subjectexpertise) {
        this.subjectexpertise = subjectexpertise;
    }

}
