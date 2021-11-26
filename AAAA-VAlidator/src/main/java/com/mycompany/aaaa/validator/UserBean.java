/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aaaa.validator;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import javax.inject.Named;

/**
 *
 * @author manuel
 */
@Named(value = "user")
@SessionScoped
public class UserBean implements Serializable{
  
  String username;

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public void nombreValidator(FacesContext fc, UIComponent uic, Object t) throws ValidatorException {
        String nombre = (String) t;
        if (nombre.length() < 4 || nombre.length() > 8) {
            throw new ValidatorException(new FacesMessage("No es ok la lonjitud", "has bien las cosas"));
        }
    }
}
