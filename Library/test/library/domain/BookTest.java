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
     * Test of setTitle method, of class Book.
     */
    @Test
    public void testSetTitle() {
        System.out.println("setTitle");
        String title = "";
        Book instance = new Book();
        instance.setTitle(title);
       
    }

    /**
     * Test of getTitle method, of class Book.
     */
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        Book instance = new Book();
        String expResult = "";
        String result = instance.getTitle();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setISBN method, of class Book.
     */
    @Test
    public void testSetISBN() {
        System.out.println("setISBN");
        String isbn = "";
        Book instance = new Book();
        instance.setISBN(isbn);
       
    }

    /**
     * Test of getISBN method, of class Book.
     */
    @Test
    public void testGetISBN() {
        System.out.println("getISBN");
        Book instance = new Book();
        String expResult = "";
        String result = instance.getISBN();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of addAuthor method, of class Book.
     */
    @Test
    public void testAddAuthor() {
        System.out.println("addAuthor");
        String name = "";
        Book instance = new Book();
        instance.addAuthor(name);
        
    }

    /**
     * Test of getAuthor method, of class Book.
     */
    @Test
    public void testGetAuthor() {
        System.out.println("getAuthor");
        Book instance = new Book();
        String expResult = "";
        String result = instance.getAuthor();
        assertEquals(expResult, result);
       
    }
}
