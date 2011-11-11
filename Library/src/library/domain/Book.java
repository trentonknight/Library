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

    List<String> author = new ArrayList<String>();
    private String name;
    private String title;
    private String isbn;

    public Book() {
        name = null;
        title = null;
        isbn = null;
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
}
