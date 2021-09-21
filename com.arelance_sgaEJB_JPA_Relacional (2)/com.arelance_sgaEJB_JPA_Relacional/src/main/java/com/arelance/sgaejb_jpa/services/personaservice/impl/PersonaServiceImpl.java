/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.sgaejb_jpa.services.personaservice.impl;

import com.arelance.sgaejb_jpa.DTO.MaxDTO;
import com.arelance.sgaejb_jpa.DTO.MinDTO;
import com.arelance.sgaejb_jpa.dao.persona.PersonaDAO;
import com.arelance.sgaejb_jpa.services.personaservice.PersonaService;
import com.arelance.sgajpa.domain.Persona;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author salvador
 */
public class PersonaServiceImpl implements PersonaService {

    @Inject
    private PersonaDAO personaDAO;

    @Override
    public List<Persona> listarPersonas() {
        return personaDAO.listarPersonas();
    }

    @Override
    public Persona findPersonaByEmail(Persona persona) {
        return personaDAO.findPersonaByEmail(persona);
    }

    @Override
    public void addPersona(Persona persona) {
        personaDAO.addPersona(persona);
    }

    @Override
    public void updatePersona(Persona persona) {
        personaDAO.updatePersona(persona);
    }

    @Override
    public void removePersona(Persona persona) {
        personaDAO.removePersona(persona);
    }

    @Override
    public Persona findPersonaById(Persona persona) {
        return personaDAO.findPersonaByID(persona);

    }

    @Override
    public Persona findPersonaById(Integer id) {
        return personaDAO.findPersonaByID(id);
    }

    @Override
    public Iterator<Object> datosResumenPersona() {
        return personaDAO.datosResumenPersona();
    }

    @Override
    public List<Persona> listarFiltroPersonas(String nombreParametro) {
       return  personaDAO.listarFiltroPersonas(nombreParametro);
    }

    @Override
    public Iterator<Object> listarFiltroPersonas(MinDTO min, MaxDTO max) {
       return personaDAO.listarFiltroPersonas(min, max);
    }

    @Override
    public Iterator<Object> listarFiltroPersonas(MinDTO min) {
        return personaDAO.listarFiltroPersonas(min);
    }

    @Override
    public Iterator<Object> listarFiltroPersonas(MaxDTO max) {
        return personaDAO.listarFiltroPersonas(max);
    }

    @Override
    public Iterator<Object> listarFiltroPersonas(MinDTO min, MaxDTO max, String nombreParametro) {
       return personaDAO.listarFiltroPersonas(min, max, nombreParametro);
    }

    @Override
    public Iterator<Object> listarFiltroPersonas(MinDTO min, String nombreParametro) {
        return personaDAO.listarFiltroPersonas(min, nombreParametro);
    }

    @Override
    public Iterator<Object> listarFiltroPersonas(MaxDTO max, String nombreParametro) {
        return personaDAO.listarFiltroPersonas(max, nombreParametro);
    }

}
