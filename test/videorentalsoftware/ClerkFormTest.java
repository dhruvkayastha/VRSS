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
public class ClerkFormTest {
    
    public ClerkFormTest() {
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
     * Test of getRent method, of class ClerkForm.
     */
    @Test
    public void testGetRent() {
        System.out.println("getRent");
        
        assertEquals(1000, new ClerkForm().getRent(1));
        assertEquals(1000, new ClerkForm().getRent(3));
        assertEquals(100, new ClerkForm().getRent(5));
        assertEquals(230, new ClerkForm().getRent(6));
        assertEquals(0, new ClerkForm().getRent(2));

    }

    /**
     * Test of getName method, of class ClerkForm.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        assertEquals("Queen", new ClerkForm().getName(1));
        assertEquals("David Bowie", new ClerkForm().getName(3));
        assertEquals("DDLJ", new ClerkForm().getName(5));
        assertEquals("Coldplay", new ClerkForm().getName(6));
        assertEquals("", new ClerkForm().getName(2));
    }

    /**
     * Test of getType method, of class ClerkForm.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        
        assertEquals("Music", new ClerkForm().getType(1));
        assertEquals("Music", new ClerkForm().getType(3));
        assertEquals("Video", new ClerkForm().getType(5));
        assertEquals("Music", new ClerkForm().getType(6));
        assertEquals("", new ClerkForm().getType(2));
        
    }

    /**
     * Test of main method, of class ClerkForm.
     */
//    @Test
//    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        ClerkForm.main(args);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
