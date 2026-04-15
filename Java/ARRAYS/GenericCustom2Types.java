import java.util.ArrayList;

class Pair<K,V>{
    K key;
    V value;

    Pair(K key,V value){
        this.key=key;
        this.value=value;
    }

    void display(){
        System.out.println("Key: "+this.key);
        System.out.println("Value: "+this.value);
    }
}


// Upper Bound Geneeric
// <T extends Number>  can only take number like int double float
class Calculator<T extends Number, U extends Number>{
    T a;
    U b;

    void add(T a,U b){

        System.out.println("Sum: "+(a.intValue()+b.doubleValue()));
        // to keep a as integer
        // b as double

    }
}


public class GenericCustom2Types {
    public static void main(String Args[]){
        Pair<String,Integer> pair1=new Pair("Roll no ",54 );
        pair1.display();

        Pair<Integer,String> pair2=new Pair(12404666,"Rahul" );
        pair2.display();


        // Bounds : Restrict  allowed data types
        // Specify which kind of data we can store in generics

        // Types of bound:
        //  i. UpperBound.
        // ii. LowerBound.
        Calculator<Integer,Double> calculator=new Calculator();
        calculator.add(13,32.2344453);
    }
}
