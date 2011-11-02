/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package library.domain;

/**
 *
 * @author trentonknight
 */
public class Book extends Item{

  private String isbn;
  
  public Book(){
        isbn = null;
    }
  
  public void setIsbn(String isbn){
     this.isbn = isbn;
 }
  public String getIsbn(){
      return isbn;
  }
  public boolean equals(Object obj){
            if (this == obj) return true;
            if (! (obj instanceof Book)) return false;
            Book book = (Book)obj;
            if (this.getId().equals(book.isbn)) return false;
            if (! this.isbn.equals(book.isbn)) return false;
            return true;
        }
        public boolean validate(){
            if (isbn == null || isbn.equals("")) return false;
            return true;
        }
}
