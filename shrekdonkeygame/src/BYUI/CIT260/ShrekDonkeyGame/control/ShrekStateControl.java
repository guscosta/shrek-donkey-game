/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BYUI.CIT260.ShrekDonkeyGame.control;

import BYUI.CIT260.ShrekDonkeyGame.model.Phrase;

public class ShrekStateControl {

    public static double calcShrekState(Phrase phrase) {

        if (phrase.getPhraseValue() <= 0) {
            // “Phrase value is zero or a negative number”
            return -1;
        } else if (phrase.getAngerValue() <= 0) {
            //Display “Anger value is zero or a negative number”
            return -1;
        } else if (phrase.getHappinessValue() <= 0) {
            //Display “Happiness value is zero or a negative number”
            return -1;
        } else if (phrase.getPhraseType() == 'a') {
            phrase.setAngerValue(phrase.getAngerValue() + phrase.getPhraseValue());
        } else if (phrase.getPhraseType() == 'h') {
            phrase.setHappinessValue(phrase.getHappinessValue() + phrase.getPhraseValue());
        }

        double shrekMood = Math.round(phrase.getHappinessValue() / phrase.getAngerValue());
        return shrekMood;
    }
}
