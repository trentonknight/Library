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
public class Book extends Item{
    
private String name;
  
  public Book(){
        name = null;
    }
    
List<String> author = new ArrayList<String>();
    


public void addAuthor(String name){
        boolean add = author.add(name);
}


}
