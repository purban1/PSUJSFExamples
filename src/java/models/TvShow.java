/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author production
 */
public class TvShow {
    public String showLabel;
    public String showValue;

    
    public TvShow(String label, String value){
        this.setShowLabel(label);
        this.setShowValue(value);
        
    }
    
    /**
     * @return the showLabel
     */
    public String getShowValue(){
        return showValue;
    }
    
    /**
     * @return the showLabel
     */
    public String getShowLabel() {
        return showLabel;
    }

    /**
     * @param showLabel the showLabel to set
     */
    public void setShowLabel(String showLabel) {
        this.showLabel = showLabel;
    }

    /**
     * @param showValue the showValue to set
     */
    public void setShowValue(String showValue) {
        this.showValue = showValue;
    }
    
    
}
