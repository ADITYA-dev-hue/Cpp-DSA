import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

class Employee implements Serializable{
    // If we implements any class with Seriallizable then
    // we are declaring that it can be converted into byte Stream.

    int empid;
    String empName;

    public Employee(int id,String name){
        empid=id;
        empName=name;
    }
}

class ObjectSerialisation {
    public static void main(String Args[]){

        Employee emp = new Employee(21, "Aditya");

        //ObjectOutputStream: to convert object into byte and store it into file
        try{

        FileOutputStream fos= new FileOutputStream("Employee.txt");
        
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        
        oos.writeObject(emp);
        fos.close();
        oos.close();

        }catch(Exception e){
            System.out.println(e);
        }

        //ObjectInputStream: to fetch byte from file and convert it into object

        //Deserialization

        try{
            FileInputStream fis = new FileInputStream("Employee.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            // we are converting a byte into object stream
            // so inorder to convert it into object we have to create object first.

            Employee emp2=(Employee) ois.readObject();
            ois.close();
            fis.close();

            System.out.println("emp object data into emp2 object");
            System.out.println("Name: "+emp2.empName);
            System.out.println("Id: "+emp2.empid);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
