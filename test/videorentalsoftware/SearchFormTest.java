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
public class SearchFormTest {
    
    public SearchFormTest() {
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
     * Test of searchResult method, of class SearchForm.
     */
    @Test
    public void testSearchResult() {
        System.out.println("searchResult");
        
        assertEquals(true, new SearchForm().searchResult("Queen"));
        assertEquals(false, new SearchForm().searchResult("greenday"));
        assertEquals(true, new SearchForm().searchResult("DDLj"));
        assertEquals(false, new SearchForm().searchResult("titanic"));
        assertEquals(true, new SearchForm().searchResult("David"));

    }

    
}
