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
        String name = null;
        int count = 0;

        
        System.out.println("Enter User ID");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String text = in.readLine();
        book.setId(text);
         
        System.out.println("Enter Book ISBN");
        BufferedReader isbn = new BufferedReader(new InputStreamReader(System.in));
        String newtext = isbn.readLine();
        book.setISBN(newtext);
        System.out.println("The Book ISBN is " + book.getISBN());

        do{
        System.out.println("Enter authors name or exit to finish list");
        BufferedReader author = new BufferedReader(new InputStreamReader(System.in));
        name = author.readLine();
        book.addAuthor(name);
        count++;
        }while(!(name.equals("exit")));
       
        count = count - 2;
        System.out.println("The first authors name entered was " + book.getAuthor(0));
        System.out.println("The last authors name entered was " + book.getAuthor(count));

        boolean validate = book.validate();
    }
}
