package Library;

import java.util.ArrayList;

public class ViewBooks implements IOOperation{
    @Override
    public void oper(Database database, User user) {
        ArrayList<Book> books = database.getAllBooks();
        System.out.println("Name\tAuthor\tPublisher\tAddress\tStatus\tQuantity\tPrice\tBorrowedCopies");
        for (Book book : books) {
            System.out.println(book.getName()+"\t"+book.getAuthor()+"\t"+book.getPublisher()+"\t\t"+
                    book.getAddress()+"\t\t"+book.getStatus()+"\t\t"+book.getQuantity()+"\t\t"+book.getPrice()+"\t\t"+book.getBorrowedCopies());
        }
        System.out.println();
        user.userMenu(database, user);
    }
}
