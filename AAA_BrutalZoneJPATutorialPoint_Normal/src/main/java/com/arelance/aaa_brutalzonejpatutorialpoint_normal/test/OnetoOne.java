/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.aaa_brutalzonejpatutorialpoint_normal.test;

import com.arelance.aaa_brutalzonejpatutorialpoint_normal.entity.Department;
import com.arelance.aaa_brutalzonejpatutorialpoint_normal.entity.Employee;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Manuel
 */
public class OnetoOne {
    
    public static void main(String[] args) 
   {
      EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "Student_details" );
      EntityManager entitymanager = emfactory.createEntityManager( );
      
      entitymanager.getTransaction( ).begin( );

      //Create Department Entity
      Department department = new Department();
      department.setName("Development");

      //Store Department
      entitymanager.persist(department);

      //Create Employee Entity
      Employee employee = new Employee();
      employee.setEname("Satish");
      employee.setSalary(45000.0);
      employee.setDeg("Technical Writer");
      employee.setDepartment(department);

      //Store Employee
      entitymanager.persist(employee);

      entitymanager.getTransaction().commit();
      
      entitymanager.close();
      emfactory.close();
   }
}
