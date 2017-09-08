package minhtetoo131.photoshare;


public class model {
    private String title;
    private String description;
    private String imageURL;
    private String username;

    public model(){

    }

    public model(String title, String description, String imageURL, String username) {
        this.title = title;
        this.description = description;
        this.imageURL = imageURL;
        this.username = username;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getUsername(){
        return username;
    }

    public  void setUsername(String username){
        this.username = username;
    }

}