package BYUI.CIT260.ShrekDonkeyGame.control;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PuzzleControlTest {
    
    public PuzzleControlTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
    @Test
    public void testCalcJumpStrength() {
        /****************
         Test 1
         ***************/
        System.out.println("calcJumpStrength");
        double distanceValue = 5;
        double weightValue = 300;
        double charactersValue = 9;
        PuzzleControl instance = new PuzzleControl();
        double expResult = 56;
        double result = instance.calcJumpStrength(distanceValue, weightValue, charactersValue);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
          /****************
         Test 2
         ***************/
        System.out.println("calcJumpStrength 2");
        distanceValue = 0;
        weightValue = 300;
        charactersValue = 9;
        expResult = 0;
        result = instance.calcJumpStrength(distanceValue, weightValue, charactersValue);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
        /**************
         Test 3
        ***************/
        System.out.println("calcJumpStrength 3");
        distanceValue = 5;
        weightValue = -300;
        charactersValue = 9;
        expResult = -56;
        result = instance.calcJumpStrength(distanceValue, weightValue, charactersValue);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
        /**************
         Test 4
        ***************/
        System.out.println("calcJumpStrength 4");
        distanceValue = 5;
        weightValue = 0;
        charactersValue = 9;
        expResult = 0;
        result = instance.calcJumpStrength(distanceValue, weightValue, charactersValue);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
        /**************
         Test 5
        ***************/
        System.out.println("calcJumpStrength 5");
        distanceValue = 1;
        weightValue = 500;
        charactersValue = 9;
        expResult = 19;
        result = instance.calcJumpStrength(distanceValue, weightValue, charactersValue);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
        /**************
         Test 6
        ***************/
        System.out.println("calcJumpStrength 6");
        distanceValue = 15;
        weightValue = 100;
        charactersValue = 9;
        expResult = 56;
        result = instance.calcJumpStrength(distanceValue, weightValue, charactersValue);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
        /**************
         Test 7
        ***************/
        System.out.println("calcJumpStrength 7");
        distanceValue = 5;
        weightValue = 300;
        charactersValue = 4;
        expResult = 375;
        result = instance.calcJumpStrength(distanceValue, weightValue, charactersValue);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
