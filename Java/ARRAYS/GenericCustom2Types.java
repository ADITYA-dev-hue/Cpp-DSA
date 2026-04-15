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
public class GenericCustom2Types {
    public static void main(String Args[]){
        Pair<String,Integer> pair1=new Pair("Roll no ",54 );
        pair1.display();

        Pair<Integer,String> pair2=new Pair(12404666,"Rahul" );
        pair2.display();
    }
}
