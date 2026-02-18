class Student1{
    public String name;
    
    public Student1(String name){

        this.name=name;
        // System.out.println("Student class constructor");
    }
    public String getName(){
        return this.name;
    }
}

class Teacher{
    private String name;
    public Teacher(String name){
        this.name=name;
        // System.out.println("Teacher class constructor");
    }
    public String getName(){
        return this.name;
    }
    public void display(Student1 st){
        System.out.println("Teacher name: "+this.name);
        System.out.println("Student name: "+st.name);
    }
}
class ASSOCIATION{
    public static void main(String[] args) {
        Student1 st = new Student1("John");
        Teacher t = new Teacher("Mr. Smith");
        
        t.display(st);  // uses-a

        t.getName();
        st.getName();
    }
}