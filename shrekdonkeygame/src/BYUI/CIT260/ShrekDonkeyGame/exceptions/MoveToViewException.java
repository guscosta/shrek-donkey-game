/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BYUI.CIT260.ShrekDonkeyGame.exceptions;

public class MoveToViewException extends Exception{

    public MoveToViewException() {
    }

    public MoveToViewException(String message) {
        super(message);
    }

    public MoveToViewException(String message, Throwable cause) {
        super(message, cause);
    }

    public MoveToViewException(Throwable cause) {
        super(cause);
    }

    public MoveToViewException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
}
