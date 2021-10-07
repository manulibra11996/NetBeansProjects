/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this tEmplate file, choose Tools | TEmplates
 * and open the tEmplate in the editor.
 */
package com.arelance.aaa_juevesinfinito.service.impl;

import com.arelance.aaa_juevesinfinito.DAO.EmpDAO;
import com.arelance.aaa_juevesinfinito.domains.Emp;
import com.arelance.aaa_juevesinfinito.service.EmpService;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author lenovo
 */
public class EmpServiceImpl implements EmpService {

    @Inject
    private EmpDAO empDAO;

    @Override
    public List<Emp> ListarEmp() {
        return empDAO.ListarEmp();
    }

    @Override
    public void AñadirEmp(Emp emp) {
       empDAO.AñadirEmp(emp);
    }

    @Override
    public void ModificarEmp(Emp emp) {
        empDAO.ModificarEmp(emp);
    }

    @Override
    public void RemoverEmp(Emp emp) {
        empDAO.RemoverEmp(emp);
    }

}
