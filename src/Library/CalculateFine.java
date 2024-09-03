package Library;

import java.util.Scanner;

public class CalculateFine implements IOOperation {
    @Override
    public void oper(Database database, User user) {
        System.out.println("Enter Book title");
        Scanner s = new Scanner(System.in);
        String bookname= s.next();

        boolean done= true;

        for (Borrowing borrowing: database.getAllBorrowings()){
            if (borrowing.getBook().getName().matches(bookname) && borrowing.getUser().getName().matches(user.getName())){
                if (borrowing.getDaysLeft()>0){
                    System.out.println("You are late!" + "You have to pay $" + Math.abs(borrowing.getDaysLeft()*50)+ "as fine");
                } else {
                    System.out.println("You don't have to pay fine\n");
                }
                done= false;
                break;
            }
        }
        if (done){
            System.out.println("You didn't borrow this book!");
        }
        user.userMenu(database, user);
    }
}
