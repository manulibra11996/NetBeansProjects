/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.aaa_brutalzonejpatutorialpoint_normal.test;

import com.arelance.aaa_brutalzonejpatutorialpoint_normal.entity.StudentEntity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Manuel
 */
public class update {
    
    public static void  main (String args []){
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory ( "Student_details" );  
        EntityManager em = emf.createEntityManager ();  
          
      
        em.getTransaction().begin(); 
        
        StudentEntity s = em.find (StudentEntity.class, 102 );  
        System.out.println ( "Antes de la actualización" );  
        System.out.println ( "Id. De estudiante =" + s.getId ());  
        System.out.println ( "Nombre del estudiante =" + s.getName ());  
        System.out.println ( "Edad del estudiante =" + s.getAge());  
          
        s.setAge(30 );  
          
        System.out.println ( "Después de la actualización" );  
        System.out.println ( "Id. De estudiante =" + s.getId ());  
        System.out.println ( "Nombre del estudiante =" + s.getName ());  
        System.out.println ( "Edad del estudiante =" + s.getAge());  
        
        em.getTransaction().commit();  
          
          
    }  
}
