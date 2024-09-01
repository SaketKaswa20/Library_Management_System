package Library;

import java.util.Scanner;

public class Main {
    static Scanner input;
    static Database database;
    public static void main(String[] args) {

        database = new Database();
        System.out.println("Welcome to Library Management System!");
        int choice1;

//        do{
            System.out.println("\n"
                    +"0. Exit\n"
                    + "1. Login\n2. New User");

            input= new Scanner(System.in);
            choice1=input.nextInt();

            switch(choice1) {
                case 1:
                    login();
                    break;
                case 2:
                    newUser();
                    break;
                default:
                    System.out.println("Exited!");
            }
//            }while (choice1!=0);
    }

    private static void login() {
        System.out.print("Enter Phone Number: ");
        String phone=input.next();
        System.out.print("Enter Email Address: ");
        String email=input.next();
        int n= database.login(phone, email);
        if (n!=-1) {
            User user= database.getUser(n);
            user.userMenu(database, user);
            System.out.println("Welcome "+ user.getName());
        }else {
            System.out.println("Library.User doesn't exist");
        }
    }

    private static void newUser(){
        System.out.print("Enter Username: ");
        String username=input.next();
        System.out.print("Enter Phone Number: ");
        String phone=input.next();
        System.out.print("Enter Email Address: ");
        String email=input.next();

        System.out.println("1. Library.Admin\n2. Normal Library.User");
        int choice2=input.nextInt();
        User user;
        if (choice2==1) {
            user=new Admin(username,phone,email);
        }else{
            user=new NormalUser(username,phone,email);
        }
        database.AddUser(user);
        user.userMenu(database, user);
//        System.out.println("New Library.User created");
    }
}