package Library;

import java.util.ArrayList;

public class Book {
    private String name;
    private String author;
    private String publisher;
    private String address; //Collection location
    private String status;
    private String quantity;
    private double price;
    private int borrowedCopies;

    public Book(){};

    public Book(String name, String author, String publisher, String address, String status, String quantity, double price, int borrowedCopies) {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.address = address;
        this.status = status;
        this.quantity = quantity;
        this.price = price;
        this.borrowedCopies = borrowedCopies;
    }

    public String toString(){
        String text= "Library.Book Name: " + name +
                "Library.Book Author: " + author +
                "Library.Book Publisher: " + publisher +
                "Library.Book Collection Address: " + address +
                "Library.Book Status: " + status +
                "Library.Book Quantity: " + String.valueOf(quantity) +
                "Library.Book Price: " + String.valueOf(price) +
                "Library.Book Borrowed Copies: " + String.valueOf(borrowedCopies);
        return text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getBorrowedCopies() {
        return borrowedCopies;
    }

    public void setBorrowedCopies(int borrowedCopies) {
        this.borrowedCopies = borrowedCopies;
    }
}
