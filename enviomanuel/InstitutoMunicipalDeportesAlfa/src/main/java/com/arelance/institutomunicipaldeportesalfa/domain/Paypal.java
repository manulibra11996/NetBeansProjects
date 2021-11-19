/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.institutomunicipaldeportesalfa.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author usuario
 */
@Entity
@Table(name = "paypal")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Paypal.findAll", query = "SELECT p FROM Paypal p"),
    @NamedQuery(name = "Paypal.findByIdpaypal", query = "SELECT p FROM Paypal p WHERE p.idpaypal = :idpaypal"),
    @NamedQuery(name = "Paypal.findByEmailPaypal", query = "SELECT p FROM Paypal p WHERE p.emailPaypal = :emailPaypal")})
public class Paypal implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idpaypal")
    private Integer idpaypal;
    @Size(max = 45)
    @Column(name = "email_paypal")
    private String emailPaypal;

    public Paypal() {
    }

    public Paypal(Integer idpaypal) {
        this.idpaypal = idpaypal;
    }

    public Integer getIdpaypal() {
        return idpaypal;
    }

    public void setIdpaypal(Integer idpaypal) {
        this.idpaypal = idpaypal;
    }

    public String getEmailPaypal() {
        return emailPaypal;
    }

    public void setEmailPaypal(String emailPaypal) {
        this.emailPaypal = emailPaypal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpaypal != null ? idpaypal.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Paypal)) {
            return false;
        }
        Paypal other = (Paypal) object;
        if ((this.idpaypal == null && other.idpaypal != null) || (this.idpaypal != null && !this.idpaypal.equals(other.idpaypal))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.arelance.institutomunicipaldeportesalfa.domain.Paypal[ idpaypal=" + idpaypal + " ]";
    }
    
}
