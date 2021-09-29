package com.arelance.aaa_brutalzonejpatutorialpoint_normal.test;

import com.arelance.aaa_brutalzonejpatutorialpoint_normal.*;
import com.arelance.aaa_brutalzonejpatutorialpoint_normal.entity.StudentEntityList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Manuel
 */
public class buscar {
    
     public static void  main (String args []){
         
        EntityManagerFactory emf = Persistence.createEntityManagerFactory ( "Student_details" );  
        EntityManager em = emf.createEntityManager ();  

        em.getTransaction().begin();  
          
        StudentEntityList s1 = new StudentEntityList ();  
        s1.setId(1 );  
        s1.setName("Fran");
        s1.setAge(25);
          
        StudentEntityList s2 = new StudentEntityList ();  
        s2.setId(2 );  
        s2.setName("Isi");
        s2.setAge(30);
          
        StudentEntityList s3 = new StudentEntityList ();  
        s3.setId(3 );  
        s3.setName("Ruben");
        s3.setAge(40);
        
        em.persist(s1);  
        em.persist(s2);  
        em.persist(s3);       
  
        em.getTransaction().commit();  
        
        //Metodo 1
        for (int i = 1; i < 4; i++) {
            StudentEntityList s = em.find(StudentEntityList.class , i);  
            
            System.out.println ( "Id. De estudiante = " + s.getId());  
            System.out.println ( "Nombre del estudiante = " + s.getName());
            System.out.println ("Edad del estudiante = " + s.getAge());
        }
        
        //Metodo 2
        String jpql = "Select * from student";
        Query q = em.createQuery(jpql);
         System.out.println(q.getResultList());
                
        em.close(); 
        emf.close();  
        
          
    }  
  
}
