package Library;

import java.util.Scanner;

public class Exit implements IOOperation{
    Scanner s;
    Database database;
    User user;

    @Override
    public void oper(Database database, User user) {
        this.database=database;
        this.user=user;
        System.out.println("\nAre you sure that you want to quit?\n"
                + "1. Yes\n2. Main Menu");
        s = new Scanner(System.in);
        int i = s.nextInt();
        if (i == 1) {
            System.out.println("\n"
                    + "0. Exit\n"
                    + "1. Login\n2. New User");
            int choice1 = s.nextInt();
            switch (choice1) {
                case 1:
                    login();
                    break;
                case 2:
                    newUser();
                    break;
                default:
                    System.out.println("Exited!");
            }
        }else{
                user.userMenu(database, user);
            }
        }
    private void login() {
        s= new Scanner(System.in);
        System.out.print("Enter Phone Number: ");
        String phone=s.next();
        System.out.print("Enter Email Address: ");
        String email=s.next();
        int n= database.login(phone, email);
        if (n!=-1) {
            user= database.getUser(n);
            user.userMenu(database, user);
        }else {
            System.out.println("User doesn't exist");
        }
    }

    private void newUser(){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter Username: ");
        String username=input.next();
        System.out.print("Enter Phone Number: ");
        String phone=input.next();
        System.out.print("Enter Email Address: ");
        String email=input.next();

        System.out.println("1. Admin\n2. Normal User");
        int choice2=input.nextInt();
        if (choice2==1) {
            user=new Admin(username,email,phone);
        }else{
            user=new NormalUser(username,email,phone);
        }
        database.AddUser(user);
        user.userMenu(database, user);
//        System.out.println("New Library.User created");
    }

}
