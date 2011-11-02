/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package library;
import library.domain.*;
import java.io.*;


/**
 *
 * @author trentonknight
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String newone;
           
        Item b = new Item();
        Book book = new Book();
        
        System.out.println("Enter ID");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String text = in.readLine();
        b.setId(text);
        boolean validate = b.validate();
        System.out.println(b.getId());
        book.getIsbn();
        
    }

}
