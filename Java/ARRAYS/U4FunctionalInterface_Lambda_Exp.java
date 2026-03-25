@FunctionalInterface
interface Calculator{
    int operation(int a,int b);
}

public class U4FunctionalInterface_Lambda_Exp {
    public static void main(String Args[]){

        Calculator c1=(a,b)->a+b;       //"->" for lambda.
        Calculator c2=(a,b)->a*b; //With Lambda_Expression we can perform multiple Expression's with one FuctionalInterface Method
        Calculator c3=(a,b)->a-b;

        System.out.println("Sum: "+c1.operation(5,6));
        System.out.println("Product: "+c2.operation(5,6));
        System.out.println("Difference: "+c3.operation(5,6));
    }
}
