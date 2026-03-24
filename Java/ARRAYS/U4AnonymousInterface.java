interface Data{
    void Sub();
}


public class U4AnonymousInterface {
    public static void main(){
        Data an = new Data() {
            @Override
            public void Sub(){
                System.out.println("A-B = "+(102-20));
            }
        };
        an.Sub();
    }

}
