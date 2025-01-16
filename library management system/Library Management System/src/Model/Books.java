package Model;

public class Books extends Category {

    String name;
    int isbn;
    int price;

    public Books(String category, String genre, String name, int isbn, int price) {
        super(category, genre);
        this.name = name;
        this.isbn = isbn;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void getInfo(){
        super.getInfo();
        System.out.println("\n By the order of memyself: ");
        System.out.println("BookName: " + this.name + "\n");
        System.out.println("ISBN: " + this.isbn + "\n");
        System.out.println("Price: " + this.price + "\n");
    }
}
