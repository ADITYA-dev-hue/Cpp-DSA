@FunctionalInterface
interface Calculator{
    int add(int a,int b);
}

public class U4FunctionalInterface_Lambda_Exp {
    public static void main(String Args[]){

        Calculator c1=(a,b)->a+b;       //-> for lambda.
        System.out.println(c1.add(5,6));
    }
}
