import java.util.Scanner;
class User{
    private int userId;
    private String Name;
    private String pass;
    public User(String n,String pas){
        Name=n;
        pass=pas;
    }
    //Getter & Setter
    public void setUserId(int id){
        this.userId=id;
    }
    public int getUserId(){
        return this.userId;
    }
    public String getName(){
        return Name;
    }
    public String getPass(){
        return pass;
    }
}

public class ENCAPSULATION {
    public static void main(String Args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name");
        String name=sc.nextLine();
        System.out.println("Enter Password");
        String password=sc.nextLine();

        User u1=new User(name,password);
        u1.setUserId(123300);
        
        System.out.println("User Id: "+ u1.getUserId());
        System.out.println("User_Name: "+ u1.getName());
        System.out.println("User Password: "+ u1.getPass());

    }
}
