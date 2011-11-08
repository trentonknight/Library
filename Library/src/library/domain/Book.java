/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package library.domain;
import java.util.*;
/**
 *
 * @author trentonknight
 */
public class Book extends Item{

  private String isbn;
  private List <String> bookAuthor = new LinkedList<String>();
  
  public Book(){
        isbn = null;
    }
  
  /*public void setIsbn(String isbn){
     this.isbn = isbn;
 }
  public String getIsbn(){
      return isbn;
  }
   * */
   
  public interface Collection<E> extends Iterable<E>{
      
  }
 
 
    @Override
  public boolean equals(Object obj){
            if (this == obj) return true;
            if (! (obj instanceof Book)) return false;
            Book book = (Book)obj;
            if (this.getId().equals(book.isbn)) return false;
            if (! this.isbn.equals(book.isbn)) return false;
            return true;
        }


   
    @Override
        public boolean validate(){
            if (isbn == null || isbn.equals("")) return false;
            return true;
        }
}
