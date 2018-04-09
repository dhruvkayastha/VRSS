/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videorentalsoftware;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dhruv
 */
public class CustomerLoginFormTest {
    
    public CustomerLoginFormTest() {
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
     * Test of quotate method, of class CustomerLoginForm.
     */
//    @Test
//    public void testQuotate() {
//        System.out.println("quotate");
//        String s = "";
//        CustomerLoginForm instance = new CustomerLoginForm();
//        String expResult = "";
//        String result = instance.quotate(s);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of main method, of class CustomerLoginForm.
//     */
//    @Test
//    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        CustomerLoginForm.main(args);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of getPassword method, of class CustomerLoginForm.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        assertEquals("password", new CustomerLoginForm().getPassword("dhruv"));
        assertEquals("password", new CustomerLoginForm().getPassword("arpitk"));
        assertEquals("password", new CustomerLoginForm().getPassword("john"));
        assertEquals(null, new CustomerLoginForm().getPassword("manadm"));
        assertEquals("password", new CustomerLoginForm().getPassword("jane"));

        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
