/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.bbblunesinfernalwed.metodo1.service.implementacion;

import com.arelance.bbblunesinfernalwed.metodo1.DAO.implementacion.*;
import com.arelance.bbblunesinfernalwed.metodo1.domains.Staff;
import com.arelance.bbblunesinfernalwed.metodo1.service.staff;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author Manuel
 */
public class staffService implements staff {

    @Inject
    private staffDAO dao;

    @Override
    public List<Staff> obtener() {
        return dao.obtener();
    }

}
