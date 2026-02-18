import java.util.Scanner;

public class Func {
    public static void fun(String n, int i) {
        System.out.print("Name : " + n + "\nId : " + i);
    }

    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        String Name = obj.nextLine();

        int id = obj.nextInt();

        fun(Name, id);

    }
}
