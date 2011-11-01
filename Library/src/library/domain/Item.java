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
    
    public Item(String id, String title){
        this.id = id;
        this.title = title;
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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 17 * hash + (this.title != null ? this.title.hashCode() : 0);
        return hash;
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
