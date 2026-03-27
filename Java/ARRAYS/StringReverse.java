import java.util.Scanner;
public class StringReverse {
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        char[] arr=str.toCharArray();

        
        char[] rev=new char[str.length()];
        int i=0;
        int j=str.length()-1;
        while(i<str.length() && j>=0){

            if(!Character.isLetter(arr[i])){
                rev[i]=arr[i];
                i++;
            }
            else if(!Character.isLetter(arr[j])){
                rev[j]=arr[j];
                j--;
            }
            else{
                rev[i]=arr[j];
                i++;
                j--;
            }
        }
        for(char c:rev){
            System.out.print(c);
        }
    }
}