import java.util.Scanner;
interface Payment{
    void pay();
}
class UPI implements Payment{
    @Override
    public void pay(){
        System.out.println("Payement done using UPI");
    }
}
class CreditCard implements Payment{
    @Override
    public void pay(){
        System.out.println("Payment Done by: Credit Card");
    }
}
public class ExampleInterfacePay {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Type UPI or CreditCard");
        String s = sc.nextLine();
        if(s.equals("UPI")){
            UPI u=new UPI();
            u.pay();
        }else if(s.equals("CreditCard")){
            CreditCard c=new CreditCard();
            c.pay();
        }else{
            System.out.println("Payment done by Cash");
        }
    }
}
