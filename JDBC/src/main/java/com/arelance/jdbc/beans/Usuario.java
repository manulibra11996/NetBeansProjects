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

    private Integer idUsuario;
    private String nick;
    private String contrasena;

    public Usuario(Integer idUsuario, String nick, String contrasena) {
        this.idUsuario = idUsuario;
        this.nick = nick;
        this.contrasena = contrasena;
    }

    public Usuario() {
    }

    public Usuario(String nick, String contrasena) throws UserIlegalExeption {
        if (nick == null || contrasena == null) {
            throw new UserIlegalExeption();
        }
        this.nick = nick;
        this.contrasena = contrasena;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

}
