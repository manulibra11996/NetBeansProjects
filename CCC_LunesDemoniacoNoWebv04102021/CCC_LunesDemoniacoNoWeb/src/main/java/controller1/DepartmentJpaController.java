/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller1;

import com.arelance.bbb_lunesinfernalnoweb.exceptions.exceptions.NonexistentEntityException;
import entities.Department;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import entities.Employee;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author George_Fullstack
 */
public class DepartmentJpaController implements Serializable {

    public DepartmentJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Department department) {
        if (department.getEmployee() == null) {
            department.setEmployee(new ArrayList<Employee>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Employee> attachedEmployee = new ArrayList<Employee>();
            for (Employee employeeEmployeeToAttach : department.getEmployee()) {
                employeeEmployeeToAttach = em.getReference(employeeEmployeeToAttach.getClass(), employeeEmployeeToAttach.getId());
                attachedEmployee.add(employeeEmployeeToAttach);
            }
            department.setEmployee(attachedEmployee);
            em.persist(department);
            for (Employee employeeEmployee : department.getEmployee()) {
                Department oldDepartmentOfEmployeeEmployee = employeeEmployee.getDepartment();
                employeeEmployee.setDepartment(department);
                employeeEmployee = em.merge(employeeEmployee);
                if (oldDepartmentOfEmployeeEmployee != null) {
                    oldDepartmentOfEmployeeEmployee.getEmployee().remove(employeeEmployee);
                    oldDepartmentOfEmployeeEmployee = em.merge(oldDepartmentOfEmployeeEmployee);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Department department) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Department persistentDepartment = em.find(Department.class, department.getId());
            List<Employee> employeeOld = persistentDepartment.getEmployee();
            List<Employee> employeeNew = department.getEmployee();
            List<Employee> attachedEmployeeNew = new ArrayList<Employee>();
            for (Employee employeeNewEmployeeToAttach : employeeNew) {
                employeeNewEmployeeToAttach = em.getReference(employeeNewEmployeeToAttach.getClass(), employeeNewEmployeeToAttach.getId());
                attachedEmployeeNew.add(employeeNewEmployeeToAttach);
            }
            employeeNew = attachedEmployeeNew;
            department.setEmployee(employeeNew);
            department = em.merge(department);
            for (Employee employeeOldEmployee : employeeOld) {
                if (!employeeNew.contains(employeeOldEmployee)) {
                    employeeOldEmployee.setDepartment(null);
                    employeeOldEmployee = em.merge(employeeOldEmployee);
                }
            }
            for (Employee employeeNewEmployee : employeeNew) {
                if (!employeeOld.contains(employeeNewEmployee)) {
                    Department oldDepartmentOfEmployeeNewEmployee = employeeNewEmployee.getDepartment();
                    employeeNewEmployee.setDepartment(department);
                    employeeNewEmployee = em.merge(employeeNewEmployee);
                    if (oldDepartmentOfEmployeeNewEmployee != null && !oldDepartmentOfEmployeeNewEmployee.equals(department)) {
                        oldDepartmentOfEmployeeNewEmployee.getEmployee().remove(employeeNewEmployee);
                        oldDepartmentOfEmployeeNewEmployee = em.merge(oldDepartmentOfEmployeeNewEmployee);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = department.getId();
                if (findDepartment(id) == null) {
                    throw new NonexistentEntityException("The department with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Long id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Department department;
            try {
                department = em.getReference(Department.class, id);
                department.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The department with id " + id + " no longer exists.", enfe);
            }
            List<Employee> employee = department.getEmployee();
            for (Employee employeeEmployee : employee) {
                employeeEmployee.setDepartment(null);
                employeeEmployee = em.merge(employeeEmployee);
            }
            em.remove(department);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Department> findDepartmentEntities() {
        return findDepartmentEntities(true, -1, -1);
    }

    public List<Department> findDepartmentEntities(int maxResults, int firstResult) {
        return findDepartmentEntities(false, maxResults, firstResult);
    }

    private List<Department> findDepartmentEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Department.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    //findDepartment(1L).getEmployee();
    public Department findDepartment(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Department.class, id);
        } finally {
            em.close();
        }
    }

    public int getDepartmentCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Department> rt = cq.from(Department.class);
            cq.select(em.getCriteriaBuilder().count(rt));

            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

}
