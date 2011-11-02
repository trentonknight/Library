/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package library.domain;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author trentonknight
 */
public class BookTest {
    
    public BookTest() {
    }

    
    /**
     * Test of getIsbn method, of class Book.
     */
    @Test
    public void testGetIsbn() {
        System.out.println("getIsbn");
        Book instance = new Book();
        String expResult = null;
        String result = instance.getIsbn();
        assertEquals(expResult, result);
        
    }
}
