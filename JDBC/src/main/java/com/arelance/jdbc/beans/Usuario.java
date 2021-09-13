/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.jdbc.beans;

/**
 *
 * @author Manuel
 */
public class Usuario {
    
    private Integer id_usuario;
    private String nick;
    private String contraseña;

    public Usuario(Integer id_usuario, String nick, String contraseña) {
        this.id_usuario = id_usuario;
        this.nick = nick;
        this.contraseña = contraseña;
    }

    public Usuario() {
    }

    public Usuario(String nick, String contraseña) throws UserIlegalExeption{
        if (nick == null || contraseña == null) {
            throw new UserIlegalExeption();
        }
        this.nick = nick;
        this.contraseña = contraseña;
    }

    public Integer getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    
}
