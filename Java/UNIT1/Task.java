import java.util.Scanner;

class Student{
    private String Name;
    private int roll;
    private float marks[];
    private double average;
    private boolean result;

    public Student(String Name,int roll,float marks[]){
        this.Name=Name;
        this.roll=roll;
        this.marks=marks;

        this.calculateAvg();
        this.display();
    }
    private void display(){
        System.out.println("Name: "+Name+"\nRoll No. :"+roll+"\nMarks: ");
        for(float x:marks){
            System.out.printf("%.2f ",x);
        }
        System.out.printf("\nAverage: %.2f\n",this.average);
        System.out.println("Result: "+result);
    }
    private void calculateAvg(){
        double sum=0;
        for(int i=0;i<5;i++){
            sum=sum+this.marks[i];
            
        }
        this.average=sum/marks.length;

        if(this.average>=30){
            this.result=true;
        }else{
            this.result=false;

        }
    }

}
public class Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name:");
        String Name = sc.nextLine();
        System.out.println("Roll:");
        int roll=sc.nextInt();
        System.out.println("Marks:");
        float marks[]=new float[5];
        for(int i=0;i<5;i++ ){
            marks[i]=sc.nextFloat();
        }
        Student st = new Student(Name, roll, marks);
           
    }
}
