package beans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import models.Identity;
import models.TvShow;

/**
 *
 * @author Patrick Urban
 */
@ManagedBean(name="dataBean")
@RequestScoped
public class RawDataBean {
    
    private Identity theId = new Identity();
    public String[] show;
    
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
        
        return newShow;
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
    
    public String getFirstName() {
        return theId.getFirstNameValue();
    }

    public String getLastName() {
        return theId.getLastNameValue();
    }

    public void setFirstName(String fName) {
        theId.setFirstNameValue(fName);
    }

    public void setLastName(String lName) {
        theId.setLastNameValue(lName);
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

}
