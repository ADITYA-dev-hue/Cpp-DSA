import java.util.*;

public class APPEND_STRING {
    public static void main(String Args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String Value:");
        String str = sc.nextLine();

        System.out.println("Character to append at index");
        char c = sc.next().charAt(0);
        int b=sc.nextInt();

        char[] arr = new char[str.length()+1];

        char[] arr2=str.toCharArray();
        for(int i=0;i<arr2.length;i++){
            arr[i]=arr2[i];
        }
        for(int i=arr.length-1;i>b;i--){
            arr[i]=arr[i-1];
        }
        arr[b]=c;

        //Character Array to String.
        String newStr=new String(arr);

            System.out.println("Old String is: "+str);
            System.out.println("New String is: "+newStr);
    }
}
