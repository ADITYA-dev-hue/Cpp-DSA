// 1. Polymorphism
// 2. Method Overriding

//Class Parent
class Parent{
    public void display(){
        System.out.println("Hello parent");
    }
}
// Class Child
class Child extends Parent{
    //Override..
    @Override
    public void display(){
        System.out.println("Hello Child");
    }
}
public class MethodOverriding4 {
    public static void main(String Args[]){
        Child ch = new Child();
        Parent pa= new Parent();
        ch.display();
        pa.display();
    }
}
