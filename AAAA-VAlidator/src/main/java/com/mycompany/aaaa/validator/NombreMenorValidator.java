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
@FacesValidator("com.mycompany.aaaa.validator.NombreMenorValidator")
public class NombreMenorValidator implements Validator {

    @Override
    public void validate(FacesContext fc, UIComponent uic, Object t) throws ValidatorException {
        String nombre = (String) t;
        if (nombre.length() < 4 ) {
            throw new ValidatorException(new FacesMessage("No es ok es menor que 4", "has bien las cosas"));
        }
    }

}
