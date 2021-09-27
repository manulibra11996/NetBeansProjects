package com.arelance.aaa_brutalzonejpatutorialpoint_normal;

import com.arelance.aaa_brutalzonejpatutorialpoint_normal.entity.StudentEntity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Manuel
 */
public class PersistStudent {
    
    public static void main(String args[])  
    {  
          
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("Student_details");  
        EntityManager em=emf.createEntityManager();  
          
        em.getTransaction().begin();  
          
       StudentEntity s1 = new  StudentEntity ();  
        s1.setId ( 101 );  
        s1.setName ( "Gaurav" );  
        s1.setAge ( 24 );  
          
        StudentEntity s2 = new  StudentEntity ();  
        s2.setId ( 102 );  
        s2.setName ( "Ronit" );  
        s2.setAge ( 22 );  
          
        StudentEntity s3 = new  StudentEntity ();  
        s3.setId ( 103 );  
        s3.setName ( "Rahul" );  
        s3.setAge ( 26 );
        
        em.persist(s1);  
        em.persist(s2);  
        em.persist(s3);       
  
        em.getTransaction().commit();  
          
        emf.close();  
        em.close();  
          
    }  
  
}
