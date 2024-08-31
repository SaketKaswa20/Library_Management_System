public class Admin extends User{
    public Admin(String name){
        super(name);
    }

    public Admin(String name,String email, String phoneNumber){
        super(name,email, phoneNumber);
    }

    @Override
    public void userMenu() {
        System.out.println("1. View Books");
        System.out.println("2. Add Books");
        System.out.println("3. Delete Books");
        System.out.println("4. Search");
        System.out.println("5. Delete All Data");
        System.out.println("6. View Orders");
        System.out.println("7. Exit");
    }
}
