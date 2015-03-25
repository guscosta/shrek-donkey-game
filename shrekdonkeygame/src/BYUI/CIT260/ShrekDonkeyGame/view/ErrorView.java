/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BYUI.CIT260.ShrekDonkeyGame.view;

import java.io.PrintWriter;
import shrekdonkeygame.Shrekdonkeygame;

public class ErrorView {
    
    private static final PrintWriter errorFile = Shrekdonkeygame.getOutFile();
    private static final PrintWriter logFile = Shrekdonkeygame.getLogFile();
    
    public static void display(String className, String errorMessage) {
        
        errorFile.println(
                    "----------------------------------------------------"
                  + "\n- ERROR - " + errorMessage
                  + "\n--------------------------------------------------");
        
        // log error
        logFile.println(className + " - " + errorMessage);
    }
    
}
