package Library;

import java.util.Scanner;

public class ReturnBook implements IOOperation {
    @Override
    public void oper(Database database, User user) {
        System.out.println("Enter Book Title: ");
        Scanner s= new Scanner(System.in);
        String bookname = s.next();
        if (!database.getAllBorrowings().isEmpty()){
            for (Borrowing borrowing:database.getAllBorrowings()){
                if (borrowing.getBook().getName().matches(bookname) && borrowing.getUser().getName().matches(user.getName())){
                    Book book= borrowing.getBook();
                    int i= database.getAllBooks().indexOf(book);
                    if (borrowing.getDaysLeft()>0){
                        System.out.println("You are late!" + "You have to pay $" + Math.abs(borrowing.getDaysLeft()*50)+ "as fine");
                    }
                    book.setBorrowedCopies(book.getBorrowedCopies()+1);
                    database.returnBook(borrowing, book, i);
                    System.out.println("Book Returned!\n");
                    break;
                }else {
                    System.out.println("You didn't borrow this book!\n");
                }
            }
        } else {
            System.out.println("You didn't borrow this book!\n");
        }
        user.userMenu(database, user);
    }
}
