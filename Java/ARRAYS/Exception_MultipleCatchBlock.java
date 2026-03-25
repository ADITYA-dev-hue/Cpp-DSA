
// Multiple catch block:
// in this we will handle multiple catch block from 1 try block
// but there will be
public class Exception_MultipleCatchBlock {
    public static void main(String Args[]){

        int arr[]=new int[5];

        try {
            System.out.println(arr[10]);
            int result = 10/0;
        }
        catch (ArithmeticException e) {
            e.printStackTrace();
        }
        catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
