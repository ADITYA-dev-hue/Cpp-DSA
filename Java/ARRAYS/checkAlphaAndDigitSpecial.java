import java.util.Scanner;
class Difference{
    String str;
    Difference(String str){
        this.str=str;
    }
    public void CountAlpha(){
        char ch[]=str.toCharArray();
        int count=0;
        for(int i=0;i<ch.length;i++){
           if(Character.isLetter(ch[i])){
            count++;
           }
        }
        System.out.println("No. of Alphabatic charcter's in String Are: "+count);
    }
    public void CountDigits(){
        char[] ch=str.toCharArray();
        int count=0;
        for(int i=0;i<ch.length;i++){
            if(Character.isDigit(ch[i])){
                count++;
            }
        }
        System.out.println("No. of Digit's in String Are: "+count);
    }
    public void CountSpecial(){
        char[] ch=str.toCharArray();
        int count = 0;
        int countSpace=0;
        for(int i=0;i<ch.length;i++){
            if(ch[i]==' '){
                countSpace++;
                continue;
            }
            if((!(Character.isDigit(ch[i]))) && (!(Character.isLetter(ch[i])))){
                count++;
            }
        }
        System.out.println("No. of Special Character's in String Are: "+count);
        System.out.println("No. of Spaces in String Are: "+countSpace);
    }
}
public class checkAlphaAndDigitSpecial {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        Difference d=new Difference(str);
        d.CountAlpha();
        d.CountDigits();
        d.CountSpecial();
    }
}
