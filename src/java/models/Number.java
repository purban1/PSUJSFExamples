/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author production
 */
public class Number {
    public String number;

    
    public Number(String num){
        this.setNumber(num);
    }
    
    /**
     * @return the number
     */
    public String getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Number{" + "number=" + number + '}';
    }
    
}
