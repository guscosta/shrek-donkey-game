package BYUI.CIT260.ShrekDonkeyGame.model;

import java.io.Serializable;
import java.util.Objects;

public class PuzzleScene implements Serializable {

    private String PuzzleName;
    private int Answer;

    public PuzzleScene() {
    }

    public String getPuzzleName() {
        return PuzzleName;
    }

    public void setPuzzleName(String PuzzleName) {
        this.PuzzleName = PuzzleName;
    }

    public int getAnswer() {
        return Answer;
    }

    public void setAnswer(int Answer) {
        this.Answer = Answer;
    }

    @Override
    public String toString() {
        return "PuzzleScene{" + "PuzzleName=" + PuzzleName + ", Answer=" + Answer + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.PuzzleName);
        hash = 83 * hash + this.Answer;
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
        final PuzzleScene other = (PuzzleScene) obj;
        if (!Objects.equals(this.PuzzleName, other.PuzzleName)) {
            return false;
        }
        if (this.Answer != other.Answer) {
            return false;
        }
        return true;
    }

}
