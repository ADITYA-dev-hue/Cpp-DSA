class File{
    public void display(){
        System.out.println("Hello");
    }
}

class Folder extends File{
    public void display(){
        System.out.println("Hello Folder");
    }
}

public  class InstanceOfKeyWord {
    public static void main(String args[]){
        
        File f=new File();
        System.out.println(f instanceof File);

        Folder fo=new Folder();
        System.out.println(fo instanceof Folder);       // It is true because fo is an instance of Folder class
        System.out.println(fo instanceof File);
        // instanceof is used to check
        // whether the object is an instance of a specific class or not

        System.out.println(f instanceof Folder);         // It is false because f is not an instance of Folder class

    }
    
}
