/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.jpa_asistido.dao.persona;


import com.arelance.jpa_asistido.domain.Persona;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author salvador
 */
@Local
public interface PersonaDAO {
    public List<Persona> listarPersonas();
    public Persona findPersonaByEmail(Persona persona);
    public Persona findPersonaByID(Persona persona);
    public void addPersona(Persona persona);
    public void updatePersona(Persona persona);
    public void removePersona(Persona persona);
}
