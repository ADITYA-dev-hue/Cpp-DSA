class Outer{
    int x;
    Outer(int x){
        this.x=x;
    }
    class Inner{
        void SquareOfx(){
            System.out.println("Square of x is: "+(x*x));
        }
    }
}

public class ExampleNestedClass {
    public static void main(String Args[]){
        int n=30;
        Outer o=new Outer(n);
        Outer.Inner i=o.new Inner();
        i.SquareOfx();
    }
}
