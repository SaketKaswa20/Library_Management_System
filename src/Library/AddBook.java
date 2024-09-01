package Library;

public class AddBook implements IOOperation{

    @Override
    public void oper(Database database, User user) {
        System.out.println("Library.AddBook");
    }
}
