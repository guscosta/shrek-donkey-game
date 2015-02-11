/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BYUI.CIT260.ShrekDonkeyGame.control;

public class ShrekStateControl {
    
    public double calcShrekState(char phraseType, double phraseValue, double happinessValue, double angerValue){
        
        if (phraseValue <= 0){ 
		// “Phrase value is zero or a negative number”
		return -1;
        }
        if (angerValue <= 0){
		//Display “Anger value is zero or a negative number”
		return -1;
        }
        if (happinessValue <= 0){
		//Display “Happiness value is zero or a negative number”
		return -1;
        }                        
	if (phraseType == 'a'){
            angerValue = angerValue + phraseValue;
        }
	if (phraseType == 'h'){
            happinessValue = happinessValue + phraseValue;
        }
	
        double shrekMood = happinessValue/angerValue;
        return shrekMood;
    }
} 
