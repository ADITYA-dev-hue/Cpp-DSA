import java.util.Scanner;
class InvalidAgeException extends Exception{
    InvalidAgeException(String msg){
        super(msg);
    }
}

public class ExampleCustomException {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        try{
            int n=sc.nextInt();
            if(n<21){
                throw new InvalidAgeException("Invalid Age");
            }else{
                System.out.println("Valid");
            }

        }catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
