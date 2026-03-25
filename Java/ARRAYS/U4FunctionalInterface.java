@FunctionalInterface
interface Calc{
    void add(int a,int b);
}
public class U4FunctionalInterface {
    public static void main(String[] args) {
        Calc c=new Calc(){
            public void add(int a,int b){
                System.out.println("Add: "+a+"+"+b+"="+(a+b));
            }
        };
        c.add(4,5);
    }
}
