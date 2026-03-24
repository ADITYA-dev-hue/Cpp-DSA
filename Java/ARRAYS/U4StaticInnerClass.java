

// Non-Static Inner class.
class Outer{
    public static int id;
    public static String name;

    //Static inner class : Without creating object we can access it.
    static class Inner{
        // We can't directly access outer class members inside "static inner class"

        //We can only access "static data member" of outer class.
        public void display(){
            System.out.println("Id: "+id);
            System.out.println("Name: "+name);
        }

    }
}

public class U4StaticInnerClass {
    public static void main(String args[]){
        Outer.Inner i=new Outer.Inner();

        // Because id and name are static no need of Outer class object.
        Outer.id=24;
        Outer.name="Aditya";

        i.display();
    }
}
