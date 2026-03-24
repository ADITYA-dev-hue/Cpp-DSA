//Anonymous Class: this class not having any implementation\
//but at the time of object creation we can define its implementation
//and that implementation is only for the current object.

//We can create anonymous class using "Interface and Abstract class".
abstract class File{
    abstract void add();
}

public class U4AnonymousClass {
    public static void main(String Args[]){
        File f1=new File(){
            @Override
            public void add(){
                System.out.println("Addition : "+(2+5));
            }
        };

        f1.add();
    }
    
}
