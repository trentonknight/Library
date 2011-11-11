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

    public Item() {
        id = null;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Item)) {
            return false;
        }
        Item item = (Item) obj;
        if (this.getId().equals(item.getId())) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + (this.id != null ? this.id.hashCode() : 0);
        return hash;
    }

    public boolean validate() {
        if (id == null || id.equals("")) {
            return false;
        }
        return true;
    }
}
