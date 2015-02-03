package BYUI.CIT260.ShrekDonkeyGame.model;

import java.io.Serializable;

public class Map implements Serializable {
    
    private int RowCount;
    private int ColumnCount;

    public Map() {
    }

    public int getRowCount() {
        return RowCount;
    }

    public void setRowCount(int RowCount) {
        this.RowCount = RowCount;
    }

    public int getColumnCount() {
        return ColumnCount;
    }

    public void setColumnCount(int ColumnCount) {
        this.ColumnCount = ColumnCount;
    }

    @Override
    public String toString() {
        return "Map{" + "RowCount=" + RowCount + ", ColumnCount=" + ColumnCount + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + this.RowCount;
        hash = 73 * hash + this.ColumnCount;
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
        final Map other = (Map) obj;
        if (this.RowCount != other.RowCount) {
            return false;
        }
        if (this.ColumnCount != other.ColumnCount) {
            return false;
        }
        return true;
    }

   
}
