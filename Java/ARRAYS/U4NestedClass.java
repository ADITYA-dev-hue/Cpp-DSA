class Outer{
    int id;
    String name;

    //Private Data member.
    private String Address;

    //Static Data member: Accessible from inner class without creating outer class object
    static double salary;


    //Constructor...
    Outer(int id,String name,String Address,double sal){
        this.id=id;
        this.name=name;
        this.Address=Address;
        salary=sal;
    }

    // Inner Class : It is a member of Outer class
    class Inner{
        int age;
        String Phone;
        
        Inner(int a,String p){
            age=a;
            Phone=p;
        }
        public void display(){
            System.out.println("Name: "+name);
            System.out.println("Id: "+id);
            System.out.println("Age: "+age);
            System.out.println("Phone: "+Phone);
            System.out.println("Address: "+Address);
            System.out.println("Salary: "+salary);
        }

    }
}

public class U4NestedClass {
    public static void main(String args[]){
        
        // Object of Outter class..
        Outer o=new Outer(12404666,"Aditya Prakash","109/1 Subroto Enclave, Jalahalli West,Bangluru-15",120000.33);
        

        //create object of inner class with the referrence of outer class object..
        Outer.Inner i= o.new Inner(18,"+91 761944**** ");

        //Memmory of Outer class and Inner Object is "Shared"..
        i.display();  //o.display is not possible..
    }
}
