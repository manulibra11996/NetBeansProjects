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
@PrimaryKeyJoinColumn(referencedColumnName="sid")

public class NonTeachingStaff extends Staff {
   private String areaexpertise;

   public NonTeachingStaff(int sid, String sname, String areaexpertise) {
      super(sid, sname);
      this.areaexpertise = areaexpertise;
   }

   public NonTeachingStaff() {
      super();
   }

   public String getAreaexpertise() {
      return areaexpertise;
   }

   public void setAreaexpertise(String areaexpertise) {
      this.areaexpertise = areaexpertise;
   }
}