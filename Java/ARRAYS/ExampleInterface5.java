import java.util.Scanner;
@FunctionalInterface
interface AI1{
    double A(double a,double b);
}
public class ExampleInterface5 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();

        AI1 u=(c,d)->(2*(c+d));
        System.out.println(u.A(a,b));
    }
}