/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author production
 */
public class Identity {
    public String lastNameValue = "";
    public String lastNameLabel = "Last Name: ";
    public String firstNameValue = "";
    public String firstNameLabel = "First Name: ";

    
    public Identity(){ 
    }
    
    /**
     * @return the lastNameValue
     */
    public String getLastNameValue() {
        return lastNameValue;
    }

    /**
     * @return the lastNameLabel
     */
    public String getLastNameLabel() {
        return lastNameLabel;
    }

    /**
     * @return the firstNameVale
     */
    public String getFirstNameValue() {
        return firstNameValue;
    }

    /**
     * @return the firstNameLavel
     */
    public String getFirstNameLabel() {
        return firstNameLabel;
    }

    /**
     * @param lastNameValue the lastNameValue to set
     */
    public void setLastNameValue(String lastNameValue) {
        this.lastNameValue = lastNameValue;
    }

    /**
     * @param lastNameLabel the lastNameLabel to set
     */
    public void setLastNameLabel(String lastNameLabel) {
        this.lastNameLabel = lastNameLabel;
    }

    /**
     * @param firstNameVale the firstNameVale to set
     */
    public void setFirstNameValue(String firstNameVale) {
        this.firstNameValue = firstNameVale;
    }

    /**
     * @param firstNameLavel the firstNameLavel to set
     */
    public void setFirstNameLabel(String firstNameLavel) {
        this.firstNameLabel = firstNameLavel;
    }

    @Override
    public String toString() {
        return "Identity{" + "lastNameValue=" + lastNameValue + ", lastNameLabel=" 
                + lastNameLabel + ", firstNameValue=" + firstNameValue 
                + ", firstNameLabel=" + firstNameLabel + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + (this.firstNameValue != null ? this.firstNameValue.hashCode() : 0);
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
        final Identity other = (Identity) obj;
        if ((this.firstNameValue == null) ? (other.firstNameValue != null) : !this.firstNameValue.equals(other.firstNameValue)) {
            return false;
        }
        return true;
    }

    
}
