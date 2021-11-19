/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.institutomunicipaldeportesalfa.modelo.usuarioDAO.impl;

import com.arelance.institutomunicipaldeportesalfa.domain.Usuario;
import com.arelance.institutomunicipaldeportesalfa.modelo.usuarioDAO.UsuarioDAO;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author usuario
 */
@Stateless
public class UsuarioDAOImpl implements UsuarioDAO {
    
    @PersistenceContext(unitName = "IMDBGabriel")
    EntityManager em;
    @Override
    public Usuario findUserByID(Usuario usuario) {
       return em.find(Usuario.class, usuario.getIdusuario());
    }

    @Override
    public Usuario findUserByEmail(Usuario usuario) {
        
        Query query = em.createQuery("from Usuario u where u.emailUsuario= :emailUsuario");
        query.setParameter("emailUsuario", usuario.getEmailUsuario());
        try{
        return (Usuario) query.getSingleResult();
        }catch(Exception e){
            return null;
        }
        }

    @Override
    public boolean alta(Usuario usuario) {
        em.persist(usuario);
        return true;
    }

    @Override
    public boolean modificar(Usuario usuario) {
       em.merge(usuario);
       return true;
    }
    
}
