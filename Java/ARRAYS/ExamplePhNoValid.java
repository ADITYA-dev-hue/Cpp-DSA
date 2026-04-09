class PhoneException extends Exception{
    PhoneException(String msg){
        super(msg);
    }
}
class Phone{
    String ph;
    Phone(String ph){
        this.ph=ph;
    }
    void PhValidity() throws PhoneException{
        char[] ch=ph.toCharArray();
        for(int i=0;i<ch.length;i++){
         if(!(Character.isDigit(ch[i]))){
             throw new IllegalArgumentException("Invalid: It is Not of valid");
         }
        }
        if(ph.length()!=10){
            throw new PhoneException("Invalid: Phone no. should be of 10-digits.");
       }else{
        System.out.println("Valid No.");
       }
       
    }
}
public class ExamplePhNoValid {
    public static void main(String args[]){
        String ph="7619448694";
        try{
            Phone p=new Phone(ph);
            p.PhValidity();
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }catch(PhoneException e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Code done");
        }
    }
}

