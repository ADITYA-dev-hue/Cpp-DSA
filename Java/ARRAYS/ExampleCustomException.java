import java.util.Scanner;
class AgeException extends Exception{
    AgeException(String msg){
        super(msg);
    }
}
class Voting {
    int age[]=new int[6];
    Voting(int age[]){
        this.age=age;
    }
    public void ValidAge() throws AgeException{
        for(int i=0;i<age.length;i++){
            if(age[i]<0){
                throw new IllegalArgumentException("Age never be 'Negative'.");
            }else if(!(age[i]>18)){
                throw new AgeException("Not Eligible to Vote");
            }else{
                System.out.println("Person With index:"+i+" You are Eligible to Vote.");
            }
        }
    }
}
class ExampleCustomException{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Value of n: ");
        int n=sc.nextInt();
        
        int arr[]=new int[n];
        System.out.println("Enter Values in Array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        try {
            Voting v=new Voting(arr);
            v.ValidAge();
        } catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        catch (AgeException e) {
            System.out.println(e.getMessage());
            System.out.println(e instanceof AgeException);
        }
        System.out.println("Sorry No more Voting's");
    }
}