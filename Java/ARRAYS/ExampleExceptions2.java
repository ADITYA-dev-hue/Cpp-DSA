class Cust extends Exception{Cust(String msg){super(msg);}}

class Handlethrow{
    int a;
    public Handlethrow(int a) {
        this.a=a;
    }
    void display() throws Cust{
        if(a<0){
            throw new Cust("Negative Exception: Invalid");
        }
        System.out.println("Display: "+a);
    }
}
public class ExampleExceptions2 {
    public static void main(String[] agrs){
        int a=-90;
        Handlethrow th=new Handlethrow(a);
        try {
            th.display();

        } catch (Cust e) {
            System.out.println(e.getMessage());
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}