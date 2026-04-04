interface Greeting{
    void Greet();
}
public class ExampleInterface {
    public static void main(String Args[]){
        Greeting Morning=new Greeting(){
            @Override
            public void Greet(){
                System.out.println("Good Morning");
            }
        };
        Morning.Greet();

    }
}
