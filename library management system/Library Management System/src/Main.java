import Model.Books;
import Model.Order;
import Model.User;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Books book1 = new Books("Article","ScientificPaper","MaglevTrains", 123,1000);
        Books book2 = new Books("Book","Memoir","journey to hell",111,1100);
        Books book3 = new Books("Book","Sci-Fi","freaky show",121,1200);

        ArrayList<Books> booksOrdered1 = new ArrayList<Books>();
        ArrayList<Books> booksOrdered2 = new ArrayList<Books>();
        booksOrdered1.add(book1);
        booksOrdered1.add(book2);
        booksOrdered1.add(book3);



        User user1 = new User("Kirtan Poudyal",1121);
        User user2 = new User("poudel ji", 1114);
        ArrayList<User> orderedBy1 = new ArrayList<User>();
        orderedBy1.add(user1);

        ArrayList<User> orderedBy2 = new ArrayList<User>();
        orderedBy2.add(user2);

        Order order1 = new Order(1,orderedBy1,booksOrdered1);
        Order order2 = new Order(2,orderedBy2,booksOrdered2);

        book1.getInfo();

        order1.getOrderInfo();

    }


}
