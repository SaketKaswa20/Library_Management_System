package Library;

import java.util.Scanner;

public class Admin extends User{
    public Admin(String name){
        super(name);
        this.operations= new IOOperation[]{
                new ViewBooks(),
                new AddBook(),
                new DeleteBooks(),
                new Search(),
                new DeleteAllData(),
                new ViewOrders(),
                new Exit()
        };
    }

    public Admin(String name,String email, String phoneNumber){
        super(name,email, phoneNumber);
        this.operations= new IOOperation[]{
                new ViewBooks(),
                new AddBook(),
                new DeleteBooks(),
                new Search(),
                new DeleteAllData(),
                new ViewOrders(),
                new Exit()
        };
    }

    @Override
    public void userMenu(Database database, User user) {
        System.out.println("1. View Books");
        System.out.println("2. Add Books");
        System.out.println("3. Delete Books");
        System.out.println("4. Library.Search");
        System.out.println("5. Delete All Data");
        System.out.println("6. View Orders");
        System.out.println("7. Library.Exit");

        Scanner input= new Scanner(System.in);
        int choice= input.nextInt();
        this.operations[choice-1].oper(database, user);
        input.close();
    }

    @Override
    public String toString() {
        return getName() + "<N/>" + getEmail() + "<N/>" + getPhoneNumber() + "<N/>"+"Admin";
    }
}
