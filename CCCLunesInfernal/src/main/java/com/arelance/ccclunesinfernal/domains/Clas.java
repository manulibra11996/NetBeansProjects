/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.ccclunesinfernal.domains;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 *
 * @author Manuel
 */
@Entity
public class Clas {

   @Id
   @GeneratedValue( strategy = GenerationType.AUTO )
   
   private int cid;
   private String cname;

  

   public Clas(){
      super();
   }
   
   public Clas(int cid, String cname) {
      super();
      this.cid = cid;
      this.cname = cname;
   }
   
   public int getCid(){
      return cid;
   }
   
   public void setCid(int cid) {
      this.cid = cid;
   }
   
   public String getCname() {
      return cname;
   }
   
   public void setCname(String cname) {
      this.cname = cname;
   }
   
  
}
