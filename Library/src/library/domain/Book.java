/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package library.domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author trentonknight
 */
public class Book extends Item {
    private String name;
    private String title;
    private String isbn;
    private int num;
    
    List<String> author = new ArrayList<String>();
   

    public Book() {
        name = null;
        title = null;
        isbn = null;
        num = 0;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setISBN(String isbn) {
        this.isbn = isbn;
    }

    public String getISBN() {
        return isbn;
    }

    public void addAuthor(String name) {
        boolean add = author.add(name);
    }
    public String getAuthor(int num){
       return author.get(num);
    }
    //*begin testing equivalence**//
     @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Item)) {
            return false;
        }
        Book book = (Book) obj;
        if (this.getId().equals(book.getId())) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 43 * hash + (this.title != null ? this.title.hashCode() : 0);
        hash = 43 * hash + (this.isbn != null ? this.isbn.hashCode() : 0);
        hash = 43 * hash + (this.author != null ? this.author.hashCode() : 0);
        return hash;
    }
    //*validate*//
    @Override
     public boolean validate() {
        if (isbn == null || isbn.equals("")) {
            return false;
        }
         if (title == null || title.equals("")) {
            return false;
        }
         if (name == null || name.equals("")) {
            return false;
        }
        if(author.get(num)== null || author.get(num).equals("")){
            return false;
        }
        return true;
    }
}
