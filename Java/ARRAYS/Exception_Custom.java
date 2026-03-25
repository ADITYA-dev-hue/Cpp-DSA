// Custom Exception:
//these are the exception that we can create by overself
// for different cases or specific class

//write a program in which take student marks as input
//if marks < 40 then throw exception like "Failed in exam"




// Custom Exception----

class FailExam extends Exception     //FailExam:  It is now use as type of exception.
{
    FailExam(String message){
        super(message);
    }
}

//------throws V/S throw-------

//throws:
// throws keyword in exception handling is used for
// predefining that in back of there will exception can occur

//throw:
// to create new exception object
//to throw custom exception

class ResultChechker{
    static int marks=45;

    static void checkMarks() throws FailExam {
        if(marks<40){
            
            throw new FailExam("Marks are less than 40");
        }else{
            System.out.println("Student Passed");
        }
        System.out.println("=== Result out ===");
    }
}



public class Exception_Custom {
    public static void main(String[] args) {
        try{
            ResultChechker.checkMarks();
        }catch(FailExam e){
            System.out.println("Student failed...");

            //  e.printStackTrace();
            //--OR--
            System.out.println(e);
        }
    }
}
