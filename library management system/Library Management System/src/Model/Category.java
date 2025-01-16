package Model;

public class Category extends MainCategory {

    String genre;

    public Category(String category, String genre) {
        super(category);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void getInfo(){
        System.out.println("By the orders of grandfather MainCategory \n");
        super.getInfo();
        System.out.println("\n By the orders of father Category: ");
        System.out.println("Genre: " + this.genre);
    }
}
