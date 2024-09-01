package Library;

public abstract class User {
    private String name;
    private String email;
    private String phoneNumber;
    protected IOOperation[] operations;

    public User() {};

    public User(String name){
        this.name = name;
    }

    public User(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    abstract public String toString();

    abstract public void userMenu(Database database, User user);
}

