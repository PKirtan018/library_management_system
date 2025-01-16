package Model;

public class MainCategory {

    String category;
    boolean inLibrary = true;

    public MainCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void getInfo(){
        System.out.println("Main Category: " + this.category);
    }
}
