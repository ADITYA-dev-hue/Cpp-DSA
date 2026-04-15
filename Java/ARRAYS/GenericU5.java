import java.lang.reflect.Array;
import java.util.ArrayList;


// Custom Generic:
// in order to create custom generic we can use classes and interface:

// T: not specified yet but when we initialize the class then we can specify the type there.
// in <> any alphabet we can use.

class Container<T>{
    T data;

    void setData(T data){
        this.data=data;
    }

    T getData(){
        return this.data;
    }

}
public class GenericU5 {
    public static void main(String Args[]){

        // Without Generic:

        ArrayList list = new ArrayList();
        list.add(21);
        list.add(-23.43);
        list.add("Advertisement");
        list.add(10.5);
        list.add(false);

        //Problem - type safety.
        // type mismatch.
        // runtime error.

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }


        // With Generic:

        // GENERICS :
        // It allows classes, interface and methods to operate on specific types(data types)

        // If we don't use generic, there are problems that can occur at runtime.
        // like type mismatch, runtime error.

        // Dimond Interface: ArrayList<>
        // at compile time we are specifying
        // Compile time error are better than runtime error

        ArrayList<Integer> listG = new ArrayList<>();
        listG.add(21);
        listG.add(-23);
        listG.add(2);
        listG.add(10);
        listG.add(8);
        // listG.add(" Add "); -> Compile time error

        for(int i: listG){
            System.out.print(i+"->");
        }


        Container<Integer> obj1=new Container<>();
        Container<String> obj2=new Container<>();
        obj1.setData(213);
        System.out.println("90\nData : "+obj1.getData());

        obj2.setData("Custom Generic");
        System.out.println("String Data : "+obj2.getData());

    }
}
