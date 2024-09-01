package Library;

import java.util.Scanner;

public class NormalUser extends User{
    public NormalUser(String name){
        super(name);
        this.operations= new IOOperation[]{
                new ViewBooks(),
                new Search(),
                new PlaceOrder(),
                new BorrowBook(),
                new CalculateFine(),
                new ReturnBook(),
                new Exit()
        };
    }

    public NormalUser(String name,String email, String phoneNumber){
        super(name,email, phoneNumber);
    }

    @Override
    public void userMenu(Database database, User user) {
        System.out.println("1. View Books");
        System.out.println("2. Library.Search");
        System.out.println("3. Place Order");
        System.out.println("4. Borrow Library.Book");
        System.out.println("5. Calculate Fine");
        System.out.println("6. Return Library.Book");
        System.out.println("7. Library.Exit");

        Scanner input= new Scanner(System.in);
        int choice= input.nextInt();
        this.operations[choice-1].oper(database, user);
        input.close();
    }

    public String toString() {
        return name+"<N/>"+email+"<N/>"+phoneNumber+"<N/>"+"Normal";
    }
}
