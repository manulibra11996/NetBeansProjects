/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.libreriafinal.beans;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Admin
 */
public class Usuario implements Comparable<Usuario>, Serializable {

    private final String nick;
    private final String password;

    public Usuario(String nick, String password) {
        this.nick = nick;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getNick() {
        return nick;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.nick);
        hash = 89 * hash + Objects.hashCode(this.password);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.nick, other.nick)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Usuario{nick=").append(nick);
        sb.append(", password=").append(password);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Usuario u) {
        int retorno = nick.compareTo(u.nick);
        if (retorno == 0) {
            retorno = password.compareTo(u.password);
            if (retorno != 0) {
                System.out.println("password erronea");
            }
        }
        return retorno;
    }

}
