/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BYUI.CIT260.ShrekDonkeyGame.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author hecto_000
 */

// Allows that all of the data stored in class instance variables in a class
// to be translated into a format so that it can be stored on disk or sent
// across the network
public class Actor implements Serializable{
    
    //Class instance variables
    private String name;

    public Actor() {
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Actor{" + "name=" + name + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.name);
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
        final Actor other = (Actor) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    
}
