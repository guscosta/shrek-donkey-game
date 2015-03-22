/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BYUI.CIT260.ShrekDonkeyGame.exceptions;

/**
 *
 * @author hecto_000
 */
public class GameMenuViewException extends Exception{

    public GameMenuViewException() {
    }

    public GameMenuViewException(String message) {
        super(message);
    }

    public GameMenuViewException(String message, Throwable cause) {
        super(message, cause);
    }

    public GameMenuViewException(Throwable cause) {
        super(cause);
    }

    public GameMenuViewException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
