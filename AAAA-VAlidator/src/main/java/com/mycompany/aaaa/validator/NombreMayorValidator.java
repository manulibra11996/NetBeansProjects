/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aaaa.validator;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author manuel
 */
@FacesValidator("com.mycompany.aaaa.validator.NombreMayorValidator")
public class NombreMayorValidator implements Validator {

    @Override
    public void validate(FacesContext fc, UIComponent uic, Object t) throws ValidatorException {
        String nombre = (String) t;
        if (nombre.length() > 8) {
            throw new ValidatorException(new FacesMessage("No vale es mayor que 8", "has bien las cosas"));
        }
    }

}
