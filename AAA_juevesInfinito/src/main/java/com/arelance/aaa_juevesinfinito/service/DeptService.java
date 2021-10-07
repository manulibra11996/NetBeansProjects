/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this tdeptlate file, choose Tools | Tdeptlates
 * and open the tdeptlate in the editor.
 */
package com.arelance.aaa_juevesinfinito.service;

import com.arelance.aaa_juevesinfinito.domains.Dept;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Manuel
 */
@Local
public interface DeptService {

    public List<Dept> ListarDept();
    
    public void AñadirDept(Dept dept);

    public void ModificarDept(Dept dept);

    public void RemoverDept(Dept dept);

}
