/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.bbblunesinfernalwed.metodo1.service;

import com.arelance.bbblunesinfernalwed.metodo1.DAO.*;
import com.arelance.bbblunesinfernalwed.metodo1.domains.Staff;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Manuel
 */
@Local
public interface staff {
    
    public List<Staff> obtener();
    
}
