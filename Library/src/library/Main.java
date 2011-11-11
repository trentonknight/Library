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

    public static void main(String[] args) throws IOException {

        Book book = new Book();

        
        System.out.println("Enter User ID");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String text = in.readLine();
        book.setId(text);
         
        System.out.println("Enter Book ISBN");
        BufferedReader isbn = new BufferedReader(new InputStreamReader(System.in));
        String newtext = isbn.readLine();
        book.setISBN(newtext);
        System.out.println("The Book ISBN is " + book.getISBN()); 
        
        System.out.println("Enter Authors Name");
        BufferedReader author = new BufferedReader(new InputStreamReader(System.in));
        String name = author.readLine();
        book.addAuthor(name);

        boolean validate = book.validate();
    }
}
