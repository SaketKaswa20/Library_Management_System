package Library;

public class Book {
    private String name;
    private String author;
    private String publisher;
    private String address; //Collection location
    private String status;
    private int quantity;
    private double price;
    private int borrowedCopies;

    public Book(){};

    public Book(String name, String author, String publisher, String address, String status, int quantity, double price, int borrowedCopies) {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.address = address;
        this.status = status;
        this.quantity = quantity;
        this.price = price;
        this.borrowedCopies = borrowedCopies;
    }

    public String toString() {
        String text = "Book Name: " +name+"\n" +
        "Book Author: " + author+"\n"+
                "Book Publisher: " + publisher+"\n"+
                "Book Collection Adress: " + address+"\n"+
                "Qty: " + String.valueOf(quantity)+"\n"+
                "Price: " + String.valueOf(price)+"\n"+
                "Borrowing Copies: " + String.valueOf(borrowedCopies);
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
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

    public String toString2(){
        String text= name+"<N/>"+author+"<N/>"+publisher+"<N/>"+address+"<N/>"+String.valueOf(quantity)+
                "<N/>"+String.valueOf(price)+"<N/>"+String.valueOf(borrowedCopies);
        return text;
    };
}
