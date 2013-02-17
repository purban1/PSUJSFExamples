package models;

/**
 *
 * @author Patrick Urban
 */
public class Consumable {
    
    public String item;
    public String price;
    
    public Consumable(String item, String price){
        this.setItem(item);
        this.setPrice(price);
    }

    /**
     * @return the item
     */
    public String getItem() {
        return item;
    }

    /**
     * @return the price
     */
    public String getPrice() {
        return price;
    }

    /**
     * @param item the item to set
     */
    public void setItem(String item) {
        this.item = item;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Consumable{" + "item=" + item + ", price=" + price + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + (this.item != null ? this.item.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Consumable other = (Consumable) obj;
        if ((this.item == null) ? (other.item != null) : !this.item.equals(other.item)) {
            return false;
        }
        return true;
    }
    
    
}
