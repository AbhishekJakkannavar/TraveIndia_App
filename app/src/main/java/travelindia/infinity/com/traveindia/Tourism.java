package travelindia.infinity.com.traveindia;

/**
 * Created by Abhishek Jakkannavar on 4/5/2018.
 */

public class Tourism {



    private String description, image, title;

    public Tourism() {

    }

    public Tourism(String description, String image, String title) {
        this.description = description;
        this.image = image;
        this.title = title;
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
}
