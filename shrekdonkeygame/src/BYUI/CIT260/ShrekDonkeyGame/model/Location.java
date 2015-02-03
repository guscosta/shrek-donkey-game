package BYUI.CIT260.ShrekDonkeyGame.model;

import java.io.Serializable;

public class Location implements Serializable {
    
    private int Row;
    private int Column;
    private boolean Visited;
    private int AmountRemaining;

    public Location() {
    }

    public int getRow() {
        return Row;
    }

    public void setRow(int Row) {
        this.Row = Row;
    }

    public int getColumn() {
        return Column;
    }

    public void setColumn(int Column) {
        this.Column = Column;
    }

    public boolean isVisited() {
        return Visited;
    }

    public void setVisited(boolean Visited) {
        this.Visited = Visited;
    }

    public int getAmountRemaining() {
        return AmountRemaining;
    }

    public void setAmountRemaining(int AmountRemaining) {
        this.AmountRemaining = AmountRemaining;
    }

    @Override
    public String toString() {
        return "Location{" + "Row=" + Row + ", Column=" + Column + ", Visited=" + Visited + ", AmountRemaining=" + AmountRemaining + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + this.Row;
        hash = 37 * hash + this.Column;
        hash = 37 * hash + (this.Visited ? 1 : 0);
        hash = 37 * hash + this.AmountRemaining;
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
        final Location other = (Location) obj;
        if (this.Row != other.Row) {
            return false;
        }
        if (this.Column != other.Column) {
            return false;
        }
        if (this.Visited != other.Visited) {
            return false;
        }
        if (this.AmountRemaining != other.AmountRemaining) {
            return false;
        }
        return true;
    }

    
}