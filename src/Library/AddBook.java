package Library;

import java.util.Scanner;

public class AddBook implements IOOperation{

    @Override
    public void oper(Database database, User user) {
        Scanner sc = new Scanner(System.in);
        Book book = new Book();
        System.out.println("Enter Book Title: ");
        String name = sc.next();
        if (database.getBook(name) > -1) {
            System.out.println("There is a book with this name!");
            System.out.println("");
            user.userMenu(database, user);
        } else {
            book.setName(sc.next());
            System.out.println("Enter Book Author: ");
            book.setAuthor(sc.next());
            System.out.println("Enter Book Publisher: ");
            book.setPublisher(sc.next());
            System.out.println("Enter Book Address: ");
            book.setAddress(sc.next());
            System.out.println("Enter Book Quantity: ");
            book.setQuantity(sc.nextInt());
            System.out.println("Enter Book Price: ");
            book.setPrice(sc.nextDouble());
            System.out.println("Enter No. Borrowing Copies: ");
            book.setBorrowedCopies(sc.nextInt());
            database.AddBook(book);
            System.out.println("Book Added Successfully\n");
            user.userMenu(database, user);
            sc.close();
        }
    }
}
