/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.coches;

/**
 *
 * @author manuel
 */
public enum Comprador {
      PARTICULAR("Particular"), EMPRESA("Empresa");

        private String descripcion;

        private Comprador(String descripcion) {
            this.descripcion = descripcion;
        }

        public String getDescripcion() {
            return descripcion;
        }
}
