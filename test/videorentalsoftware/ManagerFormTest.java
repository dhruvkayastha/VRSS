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
public class ManagerFormTest {
    
    public ManagerFormTest() {
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
     * Test of getItemId method, of class ManagerForm.
     */
    @Test
    public void testGetItemId() {
        System.out.println("getItemId");
        
        assertEquals(3, new ManagerForm().getItemId(1));
        assertEquals(4, new ManagerForm().getItemId(2));
        assertEquals(5, new ManagerForm().getItemId(3));
        assertEquals(1, new ManagerForm().getItemId(4));
        assertEquals(6, new ManagerForm().getItemId(5));

    }

    /**
     * Test of getCustId method, of class ManagerForm.
     */
    @Test
    public void testGetCustId() {
        System.out.println("getCustId");
        
        assertEquals(1, new ManagerForm().getCustId(2));
        assertEquals(1, new ManagerForm().getCustId(3));
        assertEquals(2, new ManagerForm().getCustId(4));
        assertEquals(2, new ManagerForm().getCustId(5));
        assertEquals(3, new ManagerForm().getCustId(6));

    }

    /**
     * Test of getCost method, of class ManagerForm.
     */
    @Test
    public void testGetCost() {
        System.out.println("getCost");
        
        assertEquals(0, new ManagerForm().getCost(1));
        assertEquals(1000, new ManagerForm().getCost(2));
        assertEquals(0, new ManagerForm().getCost(3));
        assertEquals(1000, new ManagerForm().getCost(4));
        assertEquals(230, new ManagerForm().getCost(5));
    }

    
}
