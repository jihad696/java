/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap6;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gehad
 */
public class Lap6Test {
    
    public Lap6Test() {
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

    /**
     * Test of main method, of class Lap6.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Lap6.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Add method, of class Lap6.
     */
    @Test
    public void testAdd() {
        System.out.println("Add");
        int num1 = 10;
        int num2 = 2 ;
        int expResult = 12;
        int result = Lap6.Add(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
     @Test
    public void testAdd1() {
        System.out.println("Add");
        int num1 = -10;
        int num2 = -9 ;
        int expResult = -19;
        int result = Lap6.Add(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
    @Test
    public void testAdd2() {
        System.out.println("Add");
        int num1 = -10;
        int num2 = -9 ;
        int expResult = -1;
        int result = Lap6.Add(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
