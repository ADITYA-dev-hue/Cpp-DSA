class Data{
    int id;
    public Data(int id){
        this.id=id;
    }

    @Override
    public boolean equals(Object obj){
        Data d=(Data)obj;
        return this.id==d.id;
    }
    @Override
    public String  toString(){
        return "Name : Aditya \nId: "+this.id;
    }
}



public class OBJECT_Class {
    public static void main(String Args[]){
        // Object class is the parent class of all the classes in java
        // it is the root class of the class hierarchy in java
        // it is the superclass of all the classes in java

        // it has some methods which are inherited by all the classes in java
        // some of the methods are toString(), equals(), hashCode(), getClass(), etc.

        // toString() method is used to return a string representation of the object
        // it is used to print the object in a readable format

        // equals() method is used to compare two objects for equality
        // it returns true if the objects are equal, otherwise it returns false

        // hashCode() method is used to return a hash code value for the object
        // it is used in hashing based collections like HashMap, HashSet, etc.

        // getClass() method is used to return the runtime class of the object
        // it returns a Class object that

        Data d1=new Data(5);
        Data d2=new Data(5);
        
        
        //equals() by default the purpose of equals() is to
        //Compare object memory.
        //but we override it for specific purpose.
        System.out.println(d1.equals(d2)); // false

        // toString(): by default the purpose of toString() is to
        //provide string version of object
        // but we can override it;
        System.out.println(d1.toString());
    }
}