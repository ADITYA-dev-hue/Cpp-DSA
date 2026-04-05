import java.util.Scanner;
abstract class abstractU3{
    abstract void abstractMethod();
}
class Encap3 extends abstractU3{
    int a;
    String str;
    Encap3(int a,String str){
        this.a=a;
        this.str=str;
    }
    @Override
    public void abstractMethod(){
        System.out.println("Encap : "+a);
    }
    @Override
    public String toString(){
        return (a+" "+str);
    }
    @Override
    public boolean equals(Object obj){
        Encap3 o=(Encap3)obj;
        String s1=(this.str).toLowerCase();
        String s2=(o.str).toLowerCase();
        return (s1.equals(s2) && this.a==o.a);
    }

}


interface IntoLambda{
    int op(int a,int b,int c);
}
interface un{
    int op();
}
class Outer implements un{
    public int a;
    public int b;
    public int c;

    Outer(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    @Override
    public int op(){
        return ((a*a)+(b*b)+(c*c));
    }
    class Inner{
        public void prn(){
            System.out.println("Inner class");
        }
    }
}

public class ExampleAllUnit34 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str="Aditya";
        int a=12;
        Encap3 c=new Encap3(a,str);
        Encap3 d=new Encap3(12,"Aditya");
        c.abstractMethod();

        String s=c.toString();
        System.out.println("String 's' is: "+s);
        System.out.println("is c==d: "+c.equals(d));
        
        System.out.println("Unit 4");
        
        // FUNCTION INTERFACE WITH LAMBDA EXPRESSION..
        IntoLambda l=(x,y,z)->(y*x*z);
        System.out.println("Product is: "+l.op(2,3,4));

        Outer o=new Outer(2,3,4);
        System.out.println("Outer Class Method:  "+o.op());
        
        // INNER CLASS..
        Outer.Inner i=o.new Inner();
        i.prn();

        // INTERFACE..
        un lam=new un(){
            @Override
            public int op(){
                return 12;
            }
        };
        // FUCTIONAL INTERFACE WITH ANONYMOUS CLASS..
        System.out.println("12^3 = "+lam.op());
    }
}