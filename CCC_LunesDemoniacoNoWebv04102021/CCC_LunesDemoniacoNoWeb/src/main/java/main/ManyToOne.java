/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import controller1.DepartmentJpaController;
import controller1.EmployeeJpaController;
import entities.Department;
import entities.Employee;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author George_Fullstack
 */
public class ManyToOne {

    public static void main(String[] args) {

        //CON JOINED, SE CREAN 3 TABLAS SIN NULOS
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("lunesinfernalpersistence");
        EntityManager em = emf.createEntityManager();
//        controller1.EmployeeJpaController econtroller1 = new EmployeeJpaController(emf);
//        controller1.DepartmentJpaController dcontroller1 = new DepartmentJpaController(emf);
        DepartmentJpaController dpController1 = new DepartmentJpaController(emf);
        EmployeeJpaController eController1 = new EmployeeJpaController(emf);

        em.getTransaction().begin();
        Department department = new Department();
        department.setName("Development");
        em.persist(department);
        //storing all entities
        //Create Employee1 Entity
        Employee employee1 = new Employee();
        employee1.setEname("Satish");
        employee1.setSalary(45000.0);
        employee1.setDeg("Technical Writer");
        employee1.setDepartment(department);

        //Create Employee2 Entity
        Employee employee2 = new Employee();
        employee2.setEname("Krishna");
        employee2.setSalary(45000.0);
        employee2.setDeg("Technical Writer");
        employee2.setDepartment(department);

        //Create Employee3 Entity
        Employee employee3 = new Employee();
        employee3.setEname("Masthanvali");
        employee3.setSalary(50000.0);
        employee3.setDeg("Technical Writer");
        employee3.setDepartment(department);

        //Store Employees
        em.persist(employee1);
        em.persist(employee2);
        em.persist(employee3);

        //System.out.println(Econtroller.findEmployeeEntities());
        em.getTransaction().commit();
        em.close();

        System.out.println("-----------");
        System.out.println(dpController1.findDepartment(1L).getEmployee().size());
        List<Employee> aux = dpController1.findDepartment(1L).getEmployee();
        for (Employee arg : aux) {
            System.out.println(arg.getDepartment().getName());
        }

        System.out.println("-----");
        //   System.out.println(eController1.findEmployeeEntities());
//        System.out.println("Cantidad de departamentos: " + dcontroller1.findDepartmentEntities());
//          System.out.println("AAAAAAAAAAAAAAAAAAAAAAA");
        emf.close();

    }

}
