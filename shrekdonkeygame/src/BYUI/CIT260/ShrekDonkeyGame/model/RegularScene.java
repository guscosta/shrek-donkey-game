package BYUI.CIT260.ShrekDonkeyGame.model;

import java.io.Serializable;
import java.util.Objects;

public class RegularScene implements Serializable {
    private String Description;

    public RegularScene() {
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    @Override
    public String toString() {
        return "RegularScene{" + "Description=" + Description + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.Description);
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
        final RegularScene other = (RegularScene) obj;
        if (!Objects.equals(this.Description, other.Description)) {
            return false;
        }
        return true;
    }

    
}
