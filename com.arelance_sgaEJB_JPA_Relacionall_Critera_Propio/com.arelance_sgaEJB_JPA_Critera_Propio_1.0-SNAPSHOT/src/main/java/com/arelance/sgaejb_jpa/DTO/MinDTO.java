/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.sgaejb_jpa.DTO;

/**
 *
 * @author Manuel
 */
public class MinDTO {

    private int min;

    public MinDTO() {
    }

    public MinDTO(int min) {
        this.min = min;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + this.min;
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
        final MinDTO other = (MinDTO) obj;
        if (this.min != other.min) {
            return false;
        }
        return true;
    }

}
