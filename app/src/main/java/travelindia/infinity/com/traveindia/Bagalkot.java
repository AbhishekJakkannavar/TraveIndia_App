package travelindia.infinity.com.traveindia;

/**
 * Created by Abhishek Jakkannavar on 3/4/2018.
 */

public class Bagalkot {


    private String description, image, title,history,speciality,time,fees;

    public Bagalkot() {

    }

    public Bagalkot(String description, String image, String title,String history,String speciality,String time,String fees) {
        this.description = description;
        this.image = image;
        this.title = title;
        this.history= history;
        this.speciality = speciality;
        this.time = time;
        this.fees = fees;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getFees() {
        return fees;
    }

    public void setFees(String fees) {
        this.fees = fees;
    }
}



