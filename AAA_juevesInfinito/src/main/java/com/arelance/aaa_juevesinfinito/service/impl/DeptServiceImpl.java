/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.aaa_juevesinfinito.service.impl;

import com.arelance.aaa_juevesinfinito.DAO.DeptDAO;
import com.arelance.aaa_juevesinfinito.domains.Dept;
import com.arelance.aaa_juevesinfinito.service.DeptService;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author lenovo
 */
public class DeptServiceImpl implements DeptService {

    @Inject
    private DeptDAO deptDAO;

    @Override
    public List<Dept> ListarDept() {
        return deptDAO.ListarDept();
    }

    @Override
    public void AñadirDept(Dept dept) {
       deptDAO.AñadirDept(dept);
    }

    @Override
    public void ModificarDept(Dept dept) {
        deptDAO.ModificarDept(dept);
    }

    @Override
    public void RemoverDept(Dept dept) {
        deptDAO.RemoverDept(dept);
    }

}
