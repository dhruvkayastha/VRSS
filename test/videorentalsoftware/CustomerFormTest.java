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
public class CustomerFormTest {
    
    public CustomerFormTest() {
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
     * Test of canDelete method, of class CustomerForm.
     */
    @Test
    public void testCanDelete() {
        System.out.println("canDelete");
        
        assertEquals(false, new CustomerForm().canDelete(1));
        assertEquals(false, new CustomerForm().canDelete(2));
        assertEquals(true, new CustomerForm().canDelete(3));
        assertEquals(true, new CustomerForm().canDelete(4));
        assertEquals(true, new CustomerForm().canDelete(5));

    }
    
}
