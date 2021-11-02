package com.mycompany.validacion.formularios;




import java.math.BigDecimal;
import java.util.Date;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Cuenta {
    private static final String EMAIL_PATTERN
            = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    @NotEmpty
    @Size(min = 4, max = 12)
    private String nombre;

    @NotNull(message = "El saldo no puede ser nulo")
    private BigDecimal saldo;

    @NotNull
    @DecimalMax(value = "1.00")
    @DecimalMin(value = "0.00")
    @Digits(fraction = 2, integer = 1)
    private BigDecimal nivelEndeudamiento;
    
    //@NotBlank 
    @NotEmpty(message = "no puede estar vacío")
    @Email (message = "Email debe ser válido")
    //@Pattern(regexp = EMAIL_PATTERN, message = "El formato del email es inválido")
    private String email;

    @Future
    private Date fechaRenovacion;


    public Cuenta() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public BigDecimal getNivelEndeudamiento() {
        return nivelEndeudamiento;
    }

    public void setNivelEndeudamiento(BigDecimal nivelEndeudamiento) {
        this.nivelEndeudamiento = nivelEndeudamiento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFechaRenovacion() {
        return fechaRenovacion;
    }

    public void setFechaRenovacion(Date fechaRenovacion) {
        this.fechaRenovacion = fechaRenovacion;
    }
  


   
    
}
