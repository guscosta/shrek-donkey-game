package BYUI.CIT260.ShrekDonkeyGame.model;

import java.io.Serializable;
import java.util.Objects;

public class PuzzleScene implements Serializable {
    
    public static PuzzleScene[] createPuzzleList() {
        PuzzleScene[] puzzleScene = new PuzzleScene[10];
        
        PuzzleScene jump = new PuzzleScene();
        jump.setPuzzleName("walking towards a bridge you see that it is broken"
                + "Shrek and Donkey both weigh 300 pounds together"
                + "the distance seems to be about 15 feet. Calculate the amount of force"
                + "needed to get across. (weight times distance divided by 4");
        jump.setAnswer(15);
        puzzleScene[0] = jump;
        
        PuzzleScene conundrum = new PuzzleScene();
        conundrum.setPuzzleName("if a fairy were to conjure a spell of vanishing,"
                + "she would need to figure the mass and density between said characters"
                + "once that would be done she would need to divide the magic among"
                + "the number of characters: what is the magic power needed to vanish"
                + "3 characters with weight of 250 with density of 6 (remember"
                + "weight times distance/density divided by 3 to the power of itself");
        conundrum.setAnswer(0);
        puzzleScene[1] = jump;
        
        return puzzleScene;
    }

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
