import java.util.Scanner;
class SubString{
    public static void main(String Args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                System.out.print(str.substring(i,j)+" ");
            }
            System.out.println();
        }
    }
}