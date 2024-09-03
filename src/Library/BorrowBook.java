package Library;

import java.util.Scanner;

public class BorrowBook implements IOOperation {
    @Override
    public void oper(Database database, User user) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter Book Title: ");
        String bookname=s.next();

        int i= database.getBook(bookname);
        if (i>-1){
            Book book= database.getBook(i);
            boolean flag=true;
            for (Borrowing borrowing: database.getAllBorrowings()){
                if (borrowing.getBook().getName().matches(bookname) && borrowing.getBook().getAuthor().matches(user.getName())){
                    flag=false;
                    System.out.println("You have borrowed this book before");
                }
            }

            if (flag){
                if (book.getBorrowedCopies()>1 && flag){
                    Borrowing borrowing= new Borrowing(book, user);
                    book.setBorrowedCopies(book.getBorrowedCopies() - 1);
                    database.borrowBook(borrowing, book, i);
                    System.out.println("You must return the book before 14 days from now \n" + "Expiry date: "+ borrowing.getFinish()+ "\nEnjoy!\n");
                }else{
                    System.out.println("This book isn't available for borrowing\n");
                }
            }
        }else {
            System.out.println("Book not found");
        }
        user.userMenu(database, user);
    }
}
