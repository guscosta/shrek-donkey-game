/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BYUI.CIT260.ShrekDonkeyGame.control;

import BYUI.CIT260.ShrekDonkeyGame.exceptions.GameControlException;
import BYUI.CIT260.ShrekDonkeyGame.model.Actor;
import BYUI.CIT260.ShrekDonkeyGame.model.Phrase;
import java.io.IOException;
import java.io.PrintWriter;

public class PhraseControl {

    public static void displayPhrases(Phrase[] values) {
        for (Phrase phrases : values) {
            System.out.println(phrases.getMessage());
        }
    }

}
