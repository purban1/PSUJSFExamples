package beans;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import models.Consumable;

/**
 *
 * @author Patrick Urban
 */
@ManagedBean
@RequestScoped
public class FoodBean {

    private String dinner;
    private String beverage;
    private String dessert;
    private Float dessertAmount;
    private Float mealAmount;
    private Float beverageAmount;
    private Float total=0.00f;
    private List<Consumable> mealList = new ArrayList<Consumable>();
    private List<Consumable> drinkList = new ArrayList<Consumable>();
    private List<Consumable> dessertList = new ArrayList<Consumable>();
    
    /**
     * Creates a new instance of FoodBean
     */
    public FoodBean() {
    }

    private void getTheMeal(){
    
        Consumable meal1 = new Consumable("Steak", "15.25");
        Consumable meal2 = new Consumable("Cheeseburger", "7.50");
        Consumable meal3 = new Consumable("Pizza", "10.00");
        Consumable meal4 = new Consumable("Burritto", "9.80");
        Consumable meal5 = new Consumable("Stir Fry", "13.25");
        
        getMealList().add(meal1);
        getMealList().add(meal2);
        getMealList().add(meal3);
        getMealList().add(meal4);
        getMealList().add(meal5);
       
    }

    private void getTheBeverage(){
    
        Consumable drink1 = new Consumable("Milk", "2.50");
        Consumable drink2 = new Consumable("Soda", "1.75");
        Consumable drink3 = new Consumable("Beer", "5.00");
        Consumable drink4 = new Consumable("Margaritta", "7.50");
        
        getDrinkList().add(drink1);
        getDrinkList().add(drink2);
        getDrinkList().add(drink3);
        getDrinkList().add(drink4);
    }

    private void getTheDessert(){
    
        Consumable dessert1 = new Consumable("Blueberry Pie", "2.75");
        Consumable dessert2 = new Consumable("Hot Fudge Sundae", "2.25");
        Consumable dessert3 = new Consumable("Chocolate Cake", "3.25");

        getDessertList().add(dessert1);
        getDessertList().add(dessert2);
        getDessertList().add(dessert3);
    }
    
    // Retrieve the Dessert Menu
    public List<Consumable> getTheDessertMenu(){
        getTheDessert();
        return dessertList;
    }
    
    // Retrieve the Beverage Menu
    public List<Consumable> getTheBeverageMenu(){
        getTheBeverage();
        return drinkList;
    }
    
    // Retrieve the Meal Menu
    public List<Consumable> getTheMealMenu(){
        getTheMeal();
        return mealList;
    }
    
    // Return the results of what meal was choosen
    public String getMealSelection(){
        String selection = "";
        int length = mealList.size();
        
        for(Consumable list : mealList){
            if (list.getItem().equals(this.getDinner())){
                selection = "You ordered " + list.getItem() + " to eat. "
                        + "The cost was $" + list.getPrice() + ".";
                
                mealAmount =  Float.parseFloat(list.getPrice());
            }
        }  
        return selection;
    }
    
    
    // Return the results of what beverage was choosen
    public String getBeverageSelection(){
        String selection = "";
        int length = drinkList.size();
        
        for(Consumable list : drinkList){
            if (list.getItem().equals(this.getBeverage())){
                selection = "You ordered " + list.getItem() + " to drink. "
                        + "The cost was $" + list.getPrice() + ".";
                
                beverageAmount = Float.parseFloat(list.getPrice());
            }
        }  
        return selection;
    }
    
    // Return the results of what dessert was choosen
    public String getDessertSelection(){
        String selection = "";
        int length = dessertList.size();
        
        for(Consumable list : dessertList){
            if (list.getItem().equals(this.getDessert())){
                selection = "You ordered " + list.getItem() + " for dessert. "
                        + "The cost was $" + list.getPrice() + ".";
                
                dessertAmount = Float.parseFloat(list.getPrice()); 
            }
        }  
        return selection;
    }
    
    /**
     * @return the dinner
     */
    public String getDinner() {
        return dinner;
    }

    /**
     * @return the beverage
     */
    public String getBeverage() {
        return beverage;
    }

    /**
     * @return the dessert
     */
    public String getDessert() {
        return dessert;
    }

    /**
     * @param dinner the dinner to set
     */
    public void setDinner(String dinner) {
        this.dinner = dinner;
    }

    /**
     * @param beverage the beverage to set
     */
    public void setBeverage(String beverage) {
        this.beverage = beverage;
    }

    /**
     * @param dessert the dessert to set
     */
    public void setDessert(String dessert) {
        this.dessert = dessert;
    }

    /**
     * @return the meal
     */
    public List<Consumable> getMealList() {
        return mealList;
    }

    /**
     * @return the drink
     */
    public List<Consumable> getDrinkList() {
        return drinkList;
    }

    /**
     * @return the dessertItem
     */
    public List<Consumable> getDessertList() {
        return dessertList;
    }

    /**
     * @param meal the meal to set
     */
    public void setMealList(List<Consumable> meal) {
        this.mealList = meal;
    }

    /**
     * @param drink the drink to set
     */
    public void setDrinkList(List<Consumable> drink) {
        this.drinkList = drink;
    }

    /**
     * @param dessertItem the dessertItem to set
     */
    public void setDessertList(List<Consumable> dessertItem) {
        this.dessertList = dessertItem;
    }

    /**
     * @return the total
     */
    public String getTotal() {
        DecimalFormat df = new DecimalFormat("$##.00"); 
        return df.format(this.beverageAmount + this.mealAmount + this.dessertAmount);
    }

    /**
     * @param total the total to set
     */
    public void setTotal(Float total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "FoodBean{" + "dinner=" + dinner + ", beverage=" + beverage + 
                ", dessert=" + dessert + ", total=" + total + ", mealList=" + 
                mealList + ", drinkList=" + drinkList + ", dessertList=" + 
                dessertList + '}';
    }
    
    
    
}
