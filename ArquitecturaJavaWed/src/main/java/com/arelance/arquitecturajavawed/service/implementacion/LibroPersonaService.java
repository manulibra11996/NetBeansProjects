/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.arquitecturajavawed.service.implementacion;

import com.arelance.arquitecturajavawed.DAO.implementacion.*;
import com.arelance.arquitecturajavawed.DTO.LibroPersonaDTO;
import com.arelance.arquitecturajavawed.service.ILibroPersonaService;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author Manuel
 */
public class LibroPersonaService implements ILibroPersonaService{

    @Inject
    private LibroPersonaDAO libroPersonaDAO;
    
    @Override
    public List<LibroPersonaDTO> obtener() {
       return libroPersonaDAO.obtener();
    }
    
}
