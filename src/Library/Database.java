package Library;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Database {

    private ArrayList<User> users= new ArrayList<>();
    private ArrayList<String> usernames= new ArrayList<>();
    private ArrayList<Book> books= new ArrayList<>();
    private ArrayList<String> booknames= new ArrayList<>();
    private File userfile= new File(Main.class.getClassLoader().getResource("Users").getFile());
    private File booksfile= new File(Main.class.getClassLoader().getResource("Books").getFile());

    public Database(){
        if (!userfile.exists()){
            userfile.mkdirs();
        }
        if (!booksfile.exists()){
            booksfile.mkdirs();
        }
    }

    public void AddUser(User user) {
        users.add(user);
        usernames.add(user.getName());
    }

    public int login(String phoneNumber, String email){
        int n=-1;
        for (User user : users) {
            if (user.getPhoneNumber().matches(phoneNumber) && user.getEmail().matches(email)) {
                n=users.indexOf(user);
                break;
            }
        }
        return n;
    }

    public User getUser(int n){
        return users.get(n);
    }

    public void AddBook(Book book){
        books.add(book);
        booknames.add(book.getName());
    }

    private void getUsers(){
        String text1= "";
        try{
            BufferedReader br1= new BufferedReader(new FileReader(userfile));
            String s1;
            while((s1= br1.readLine())!=null){
                text1= text1+s1;
            }
        }catch(Exception e){
            System.err.println(e.toString());
        }

        if(!text1.matches("")||!text1.isEmpty()){
            String[] a1= text1.split("<NewUser/>");
            for(String s: a1){

            }
        }
    }

    private void saveUsers(){
        String text1="";
        for (User user : users) {
            text1= text1 + users.toString()+"<NewUser/>\n";
        }
        try{
            PrintWriter pw= new PrintWriter(userfile);
            pw.print(text1);
            pw.close();
        }catch (Exception e){
            System.err.println(e.toString());
        }
    }
}
