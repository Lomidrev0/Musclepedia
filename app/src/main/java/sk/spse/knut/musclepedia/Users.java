package sk.spse.knut.musclepedia;

public class Users {
    public String name, image,status;

    public Users(String name, String image, String status) {
        this.name = name;
        this.image = image;
        this.status = status;
    }
    public Users(){

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }

    public String getStatus() {
        return status;
    }
}
