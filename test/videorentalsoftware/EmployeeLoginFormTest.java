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
public class EmployeeLoginFormTest {
    
    public EmployeeLoginFormTest() {
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
     * Test of quotate method, of class EmployeeLoginForm.
     */
//    @Test
//    public void testQuotate() {
//        System.out.println("quotate");
//        String s = "";
//        EmployeeLoginForm instance = new EmployeeLoginForm();
//        String expResult = "";
//        String result = instance.quotate(s);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }

    /**
     * Test of getPassword method, of class EmployeeLoginForm.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        assertEquals("passq", new EmployeeLoginForm().getPassword("manadm"));
        assertEquals("983e", new EmployeeLoginForm().getPassword("arsad"));
        assertEquals("passeeshan", new EmployeeLoginForm().getPassword("eeshang"));
        assertEquals("passkru", new EmployeeLoginForm().getPassword("krutarths"));
        assertEquals(null, new EmployeeLoginForm().getPassword("dhruv"));

        
    }

    /**
     * Test of main method, of class EmployeeLoginForm.
     */
//    @Test
//    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        EmployeeLoginForm.main(args);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
