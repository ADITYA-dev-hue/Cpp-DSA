
public class ExceptionHandling {
    public static void main(String args[]){
        int a =12;
        int b= 0;

        try {
            System.out.println("Result: "+a/b);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Exception Handeled\n");
        
        int n=15;
        int arr[]=new int[10];
        for(int i=0;i<10;i++){
            arr[i]=i*i;
        }
        //EXCEPTION HANDLING try() & catch()
        for(int i=0;i<n;i++){
            try {
                System.out.println(arr[i]);
            } catch (Exception e) {
                System.out.println("\n-----------------Error is:------------------");
                e.printStackTrace();
            }
        }
        
        System.out.println("\n------------Exception Handeled----------------");
    }
}
