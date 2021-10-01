/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.arquitecturajavawed.DAO;

import com.arelance.arquitecturajavawed.DTO.LibroPersonaDTO;
import java.util.List;

/**
 *
 * @author Manuel
 */
public interface ILibroPersonaDAO {

    public List<LibroPersonaDTO> obtener();
}
