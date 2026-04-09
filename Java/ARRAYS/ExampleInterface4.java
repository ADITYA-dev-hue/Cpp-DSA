interface AI{
    int add(int a,int b);
}
public class ExampleInterface4 {
    public static void main(String args[]){
        AI a=new AI(){
            @Override
            public int add(int a,int b){
                return a*b;
            }
        };
        System.out.println(a.add(12,2));
    }
}
