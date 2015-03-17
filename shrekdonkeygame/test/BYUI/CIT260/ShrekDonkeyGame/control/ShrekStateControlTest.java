/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BYUI.CIT260.ShrekDonkeyGame.control;

import BYUI.CIT260.ShrekDonkeyGame.model.Phrase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hecto_000
 */
public class ShrekStateControlTest {
    
    public ShrekStateControlTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcShrekState method, of class ShrekStateControl.
     */
    @Test
    public void testCalcShrekState() {
        /*******************
         * Test Case 1
         *******************/
        System.out.println("calcShrekState");
        //Input values for test case 1
        Phrase phrase = new Phrase();
        phrase.setPhraseType('h');
        phrase.setPhraseValue(20);
        phrase.setHappinessValue(10);
        phrase.setAngerValue(30);
        //Creates instance of ShrekStateControl class
        ShrekStateControl instance = new ShrekStateControl();
        double expResult = 1; //Expected output returned value
       //Call the function to run the test.
        double result = instance.calcShrekState(phrase);
        //Compare expected value with actual value.
        assertEquals(expResult, result, 0.0);
        
        /*******************
         * Test Case 2
         *******************/
        System.out.println("calcShrekState");
        //Input values for test case 1
        phrase.setPhraseType('h');
        phrase.setPhraseValue(-1);
        phrase.setHappinessValue(10);
        phrase.setAngerValue(30);
        //Creates instance of ShrekStateControl class
        expResult = -1; //Expected output returned value
       //Call the function to run the test.
        result = instance.calcShrekState(phrase);
        //Compare expected value with actual value.
        assertEquals(expResult, result, 0.0);
        
        /*******************
         * Test Case 3
         *******************/
        System.out.println("calcShrekState");
        //Input values for test case 1
        phrase.setPhraseType('a');
        phrase.setPhraseValue(20);
        phrase.setHappinessValue(10);
        phrase.setAngerValue(-30);
        //Creates instance of ShrekStateControl class
        expResult = -1; //Expected output returned value
       //Call the function to run the test.
        result = instance.calcShrekState(phrase);
        //Compare expected value with actual value.
        assertEquals(expResult, result, 0.0);
        
        /*******************
         * Test Case 4
         *******************/
        System.out.println("calcShrekState");
        //Input values for test case 1
        phrase.setPhraseType('a');
        phrase.setPhraseValue(20);
        phrase.setHappinessValue(-10);
        phrase.setAngerValue(30);
        //Creates instance of ShrekStateControl class
        expResult = -1; //Expected output returned value
       //Call the function to run the test.
        result = instance.calcShrekState(phrase);
        //Compare expected value with actual value.
        assertEquals(expResult, result, 0.0);
        
        /*******************
         * Test Case 5
         *******************/
        System.out.println("calcShrekState");
        //Input values for test case 1
        phrase.setPhraseType('a');
        phrase.setPhraseValue(20);
        phrase.setHappinessValue(-10);
        phrase.setAngerValue(30);
        //Creates instance of ShrekStateControl class
        expResult = -1; //Expected output returned value
       //Call the function to run the test.
        result = instance.calcShrekState(phrase);
        //Compare expected value with actual value.
        assertEquals(expResult, result, 0.0);
        
         /*******************
         * Test Case 6
         *******************/
        System.out.println("calcShrekState");
        //Input values for test case 1
        phrase.setPhraseType('h');
        phrase.setPhraseValue(5);
        phrase.setHappinessValue(1);
        phrase.setAngerValue(10);
        //Creates instance of ShrekStateControl class
        expResult = 0.6; //Expected output returned value
       //Call the function to run the test.
        result = instance.calcShrekState(phrase);
        //Compare expected value with actual value.
        assertEquals(expResult, result, 0.0);

        /*******************
         * Test Case 7
         *******************/
        System.out.println("calcShrekState");
        //Input values for test case 1
        phrase.setPhraseType('h');
        phrase.setPhraseValue(10);
        phrase.setHappinessValue(5);
        phrase.setAngerValue(1);
        //Creates instance of ShrekStateControl class
        expResult = 15; //Expected output returned value
       //Call the function to run the test.
        result = instance.calcShrekState(phrase);
        //Compare expected value with actual value.
        assertEquals(expResult, result, 0.0);
    }
    
}
