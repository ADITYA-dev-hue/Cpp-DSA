import java.util.Scanner;

interface Discount{
    public double discount(double a);
}
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        Discount VIP=(c)->(c*0.2);
        Discount Fest=(c)->(c*0.3);
        System.out.printf("VIP discount: %.2f:\n",VIP.discount(a));
        System.out.printf("Festival discount: %.2f:",Fest.discount(a));
    }
}