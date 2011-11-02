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
public class ItemTest {
    
    public ItemTest() {
    }

    

    /**
     * Test of getId method, of class Item.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Item instance = new Item();
        String expResult = null;
        String result = instance.getId();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setId method, of class Item.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        String id = null;
        Item instance = new Item();
        instance.setId(id);
       
    }

    /**
     * Test of getTitle method, of class Item.
     */
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        Item instance = new Item();
        String expResult = null;
        String result = instance.getTitle();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setTitle method, of class Item.
     */
    @Test
    public void testSetTitle() {
        System.out.println("setTitle");
        String title = null;
        Item instance = new Item();
        instance.setTitle(title);
        
    }

    /**
     * Test of equals method, of class Item.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Item instance = new Item();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of validate method, of class Item.
     */
    @Test
    public void testValidate() {
        System.out.println("validate");
        Item instance = new Item();
        boolean expResult = false;
        boolean result = instance.validate();
        assertEquals(expResult, result);
       
    }
}
