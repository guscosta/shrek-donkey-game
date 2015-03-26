/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BYUI.CIT260.ShrekDonkeyGame.control;

import BYUI.CIT260.ShrekDonkeyGame.exceptions.DonkeyKickControlException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hecto_000
 */
public class DonkeyKickControlTest {
    
    public DonkeyKickControlTest() {
    }

    /**
     * Test of calcKick method, of class DonkeyKickControl.
     */
    @Test
    public void testCalcKick() throws DonkeyKickControlException {
        System.out.println("calcKick");
        /*******************
         * Test Case 1
         *******************/
        // Input values for test case 1
        double enemyWeight = 60;
        double kickSpeed = 30;
        DonkeyKickControl instance = new DonkeyKickControl();
        double expResult = 36000; // expected output returned value
        // Call function to run test 
        double result = instance.calcKick(enemyWeight, kickSpeed);
        
        // Compare expected return value with value returned
        assertEquals(expResult, result, 0.0);
        
        /*******************
         * Test Case 2
         *******************/
        // Input values for test case 2
        enemyWeight = 0;
        kickSpeed = 30;
        expResult = -1; // expected output returned value
        // Call function to run test 
        result = instance.calcKick(enemyWeight, kickSpeed);
        
        // Compare expected return value with value returned
        assertEquals(expResult, result, 0.0);
        
        /*******************
         * Test Case 3
         *******************/
        // Input values for test case 3
        enemyWeight = 60;
        kickSpeed = 0;
        expResult = -1; // expected output returned value
        // Call function to run test 
        result = instance.calcKick(enemyWeight, kickSpeed);
        
        // Compare expected return value with value returned
        assertEquals(expResult, result, 0.0);
        
         /*******************
         * Test Case 4
         *******************/
        // Input values for test case 4
        enemyWeight = 60;
        kickSpeed = 34;
        expResult = -1; // expected output returned value
        // Call function to run test 
        result = instance.calcKick(enemyWeight, kickSpeed);
        
        // Compare expected return value with value returned
        assertEquals(expResult, result, 0.0);
        
        /*******************
         * Test Case 5
         *******************/
        // Input values for test case 5
        enemyWeight = 1;
        kickSpeed = 30;
        expResult = 600; // expected output returned value
        // Call function to run test 
        result = instance.calcKick(enemyWeight, kickSpeed);
        
        // Compare expected return value with value returned
        assertEquals(expResult, result, 0.0);
        
        /*******************
         * Test Case 6
         *******************/
        // Input values for test case 6
        enemyWeight = 60;
        kickSpeed = 1;
        expResult = 1200; // expected output returned value
        // Call function to run test 
        result = instance.calcKick(enemyWeight, kickSpeed);
        
        // Compare expected return value with value returned
        assertEquals(expResult, result, 0.0);
        
        /*******************
         * Test Case 7
         *******************/
        // Input values for test case 7
        enemyWeight = 60;
        kickSpeed = 33;
        expResult = 39600; // expected output returned value
        // Call function to run test 
        result = instance.calcKick(enemyWeight, kickSpeed);
        
        // Compare expected return value with value returned
        assertEquals(expResult, result, 0.0);
    }
    
}
