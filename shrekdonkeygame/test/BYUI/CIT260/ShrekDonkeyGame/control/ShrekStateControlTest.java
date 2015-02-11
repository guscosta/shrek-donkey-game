/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BYUI.CIT260.ShrekDonkeyGame.control;

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
        char phraseType = 'h';
        double phraseValue = 20;
        double happinessValue = 10;
        double angerValue = 30;
        //Creates instance of ShrekStateControl class
        ShrekStateControl instance = new ShrekStateControl();
        double expResult = 1; //Expected output returned value
       //Call the function to run the test.
        double result = instance.calcShrekState(phraseType, phraseValue, happinessValue, angerValue);
        //Compare expected value with actual value.
        assertEquals(expResult, result, 0.0);
        
        /*******************
         * Test Case 2
         *******************/
        System.out.println("calcShrekState 2");
        //Input values for test case 2
        phraseType = 'h';
        phraseValue = -1;
        happinessValue = 10;
        angerValue = 30;
        //Creates instance of ShrekStateControl class
        expResult = -1; //Expected output returned value
        //Call the function to run the test.
        result = instance.calcShrekState(phraseType, phraseValue, happinessValue, angerValue);
        //Compare expected value with actual value.
        assertEquals(expResult, result, 0.0);
        
        /*******************
         * Test Case 3
         *******************/
        System.out.println("calcShrekState 3");
        //Input values for test case 3
        phraseType = 'a';
        phraseValue = 20;
        happinessValue = 10;
        angerValue = -30;
        //Creates instance of ShrekStateControl class
        expResult = -1; //Expected output returned value
        //Call the function to run the test.
        result = instance.calcShrekState(phraseType, phraseValue, happinessValue, angerValue);
        //Compare expected value with actual value.
        assertEquals(expResult, result, 0.0);
        
        /*******************
         * Test Case 4
         *******************/
        System.out.println("calcShrekState 4");
        //Input values for test case 4
        phraseType = 'a';
        phraseValue = 20;
        happinessValue = -10;
        angerValue = 30;
        //Creates instance of ShrekStateControl class
        expResult = -1; //Expected output returned value
        //Call the function to run the test.
        result = instance.calcShrekState(phraseType, phraseValue, happinessValue, angerValue);
        //Compare expected value with actual value.
        assertEquals(expResult, result, 0.0);
        
        /*******************
         * Test Case 5
         *******************/
        System.out.println("calcShrekState 5");
        //Input values for test case 5
        phraseType = 'h';
        phraseValue = 1;
        happinessValue = 10;
        angerValue = 5;
        //Creates instance of ShrekStateControl class
        expResult = 2.2; //Expected output returned value
        //Call the function to run the test.
        result = instance.calcShrekState(phraseType, phraseValue, happinessValue, angerValue);
        //Compare expected value with actual value.
        assertEquals(expResult, result, 0.0);
        
         /*******************
         * Test Case 6
         *******************/
        System.out.println("calcShrekState 6");
        //Input values for test case 6
        phraseType = 'h';
        phraseValue = 5;
        happinessValue = 1;
        angerValue = 10;
        //Creates instance of ShrekStateControl class
        expResult = 0.6; //Expected output returned value
        //Call the function to run the test.
        result = instance.calcShrekState(phraseType, phraseValue, happinessValue, angerValue);
        //Compare expected value with actual value.
        assertEquals(expResult, result, 0.0);

        /*******************
         * Test Case 7
         *******************/
        System.out.println("calcShrekState 7");
        //Input values for test case 7
        phraseType = 'h';
        phraseValue = 10;
        happinessValue = 5;
        angerValue = 1;
        //Creates instance of ShrekStateControl class
        expResult = 15; //Expected output returned value
        //Call the function to run the test.
        result = instance.calcShrekState(phraseType, phraseValue, happinessValue, angerValue);
        //Compare expected value with actual value.
        assertEquals(expResult, result, 0.0);
    }
    
}
