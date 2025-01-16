package Model;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Order {
    int orderNo;
    ArrayList<User> Users;
    ArrayList<Books> Books;

    public Order(int orderNo, ArrayList<User> users, ArrayList<Model.Books> books) {
        this.orderNo = orderNo;
        Users = users;
        Books = books;
    }

    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }

    public ArrayList<User> getUsers() {
        return Users;
    }

    public void setUsers(ArrayList<User> users) {
        Users = users;
    }

    public ArrayList<Model.Books> getBooks() {
        return Books;
    }

    public void setBooks(ArrayList<Model.Books> books) {
        Books = books;
    }

    public void getOrderInfo(){

        System.out.println("Following User: ");

        for( User st: this.Users){
            System.out.println(st.getLibUser());
        }

        System.out.println("\n Has ordered: \n");
        for( Books st: this.Books){
            System.out.println(st.getName());
        }


    }
}


