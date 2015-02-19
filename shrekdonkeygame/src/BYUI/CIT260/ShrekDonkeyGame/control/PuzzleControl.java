package BYUI.CIT260.ShrekDonkeyGame.control;

public class PuzzleControl {
    
    public double calcJumpStrength(double distanceValue, double weightValue, double charactersValue){

	if (distanceValue <=0){
            return -56;
        }
	if (weightValue <=0){
            return -56;
        }
	double totalStrength = distanceValue*weightValue/charactersValue;
            return Math.round(totalStrength);
    }
    
}
