/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BYUI.CIT260.ShrekDonkeyGame.model;

import java.io.Serializable;

/**
 *
 * @author hecto_000
 */
public class Donkey implements Serializable{
    
    //Class instance variables
    private double kick;

    public Donkey() {
    }

    public double getKick() {
        return kick;
    }

    public void setKick(double kick) {
        this.kick = kick;
    }

    @Override
    public String toString() {
        return "Donkey{" + "kick=" + kick + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.kick) ^ (Double.doubleToLongBits(this.kick) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Donkey other = (Donkey) obj;
        if (Double.doubleToLongBits(this.kick) != Double.doubleToLongBits(other.kick)) {
            return false;
        }
        return true;
    }
    
}
