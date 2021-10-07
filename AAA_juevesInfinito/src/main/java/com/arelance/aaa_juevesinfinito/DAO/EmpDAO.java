/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.aaa_juevesinfinito.DAO;

import com.arelance.aaa_juevesinfinito.domains.Emp;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Manuel
 */
@Local
public interface EmpDAO {

    public List<Emp> ListarEmp();
    
    public void AñadirEmp(Emp emp);

    public void ModificarEmp(Emp emp);

    public void RemoverEmp(Emp emp);

}
