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
public class MaxDTO {

    private int max;

    public MaxDTO() {
    }

    public MaxDTO(int max) {
        this.max = max;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + this.max;
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
        final MaxDTO other = (MaxDTO) obj;
        if (this.max != other.max) {
            return false;
        }
        return true;
    }

}
