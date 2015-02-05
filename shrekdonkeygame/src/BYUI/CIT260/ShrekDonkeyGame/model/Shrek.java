package BYUI.CIT260.ShrekDonkeyGame.model;

import java.io.Serializable;

public class Shrek implements Serializable {
    private double ShrekMood;

    public Shrek() {
    }

    public double getShrekMood() {
        return ShrekMood;
    }

    public void setShrekMood(double ShrekMood) {
        this.ShrekMood = ShrekMood;
    }

    @Override
    public String toString() {
        return "Shrek{" + "ShrekMood=" + ShrekMood + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.ShrekMood) ^ (Double.doubleToLongBits(this.ShrekMood) >>> 32));
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
        final Shrek other = (Shrek) obj;
        if (Double.doubleToLongBits(this.ShrekMood) != Double.doubleToLongBits(other.ShrekMood)) {
            return false;
        }
        return true;
    }
    
    

   

}
