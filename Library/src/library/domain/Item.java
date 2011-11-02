/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package library.domain;

/**
 *
 * @author trentonknight
 */
public class Item {
    private String id;
    private String title;
    
    public Item(){
        id = null;
        title = null;
    }
 public String getId(){
        return id;
    }
 public void setId(String id){
     this.id = id;
 }
 public String getTitle(){
     return title;
 }
 public void setTitle(String title){
     this.title = title;
 }
        public boolean equals(Object obj){
            if (this == obj) return true;
            if (! (obj instanceof Item)) return false;
            Item item = (Item)obj;
            if (this.getId().equals(item.getId())) return false;
            if (! this.title.equals(item.title)) return false;
            return true;
        }
        public boolean validate(){
            if (id == null || id.equals("")) return false;
            if (title == null || title.equals(" ")) return false;
            return true;
        }
}
