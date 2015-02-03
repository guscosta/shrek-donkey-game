package BYUI.CIT260.ShrekDonkeyGame.model;

import java.io.Serializable;
import java.util.Objects;

public class EnemyScene implements Serializable {
     private String Name;

    public EnemyScene() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    @Override
    public String toString() {
        return "EnemyScene{" + "Name=" + Name + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.Name);
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
        final EnemyScene other = (EnemyScene) obj;
        if (!Objects.equals(this.Name, other.Name)) {
            return false;
        }
        return true;
    }

     
}
