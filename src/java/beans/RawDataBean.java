package beans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import models.Identity;
import models.Number;
import models.TvShow;

/**
 *
 * @author Patrick Urban
 */
@ManagedBean(name="dataBean")
@RequestScoped
public class RawDataBean {
    
    private Identity theId = new Identity();
    private String[] show;
    public String[] numberList;
    
    public RawDataBean() {
    }
        
    
    public List<TvShow> getTheShowList(){
        
//        Map newShow = new LinkedHashMap<String, Object>();
//        newShow.put("Star Trek Voyager", "Voyager");
//        newShow.put("Stargate", "Stargate");
//        newShow.put("Doctor Who", "Who");
        List<TvShow> newShow = new ArrayList<TvShow>();
        newShow.add(new TvShow("Star Trek Voyager", "Voyager"));
        newShow.add(new TvShow("Stargate", "Stargate"));
        newShow.add(new TvShow("Doctor Who", "Doctor Who"));
        newShow.add(new TvShow("Bones", "Bones"));
        newShow.add(new TvShow("Fringe", "Fringe"));
        
        return newShow;
    }
    
    private List<Number> createNumberLists(){
        List<Number> number = new ArrayList<Number>();
        number.add(new Number("2"));
        number.add(new Number("4"));
        number.add(new Number("5"));
        number.add(new Number("8"));
        number.add(new Number("10"));
        
        return number;
    }
    
    public List<Number> getTheNumberList(){
        return this.createNumberLists();
    }

    

    public String getTheIdentity(){
        if (theId.firstNameValue.equals("") || theId.firstNameValue == null){
            return " ";
        }
        else {
            return "Welcome " + theId.firstNameValue +
                    " " + theId.lastNameValue;
        }
    }

    public String getShowChoiceResults(){  
        return Arrays.toString(show);
    }

    public String getNumberChoiceResults(){  
        String results="";
        int length = numberList.length;
        
        /* 
         * Use a loop here instead of 'Arrays.toString(array name)
         * to avoid getting '[ ]' around the results.
         */
        for (int i=0; i<length; i++){
            results += numberList[i];
            if (i < length-1){
                results += ", ";
            }
        }
        return results;
    }
    
    public String getFirstName() {
        return theId.getFirstNameValue();
    }

    public String getLastName() {
        return theId.getLastNameValue();
    }

    public void setFirstName(String fName) {
        theId.setFirstNameValue(fName.trim());
    }

    public void setLastName(String lName) {
        theId.setLastNameValue(lName.trim());
    }

    /**
     * @return the show
     */
    public String[] getShow() {
        return show;
    }

    /**
     * @param show the show to set
     */
    public void setShow(String[] show) {
        this.show = show;
    }

    /**
     * @return the numberList
     */
    public String[] getNumberList() {
        return numberList;
    }

    /**
     * @param numberList the numberList to set
     */
    public void setNumberList(String[] numberList) {
        this.numberList = numberList;
    }

}
