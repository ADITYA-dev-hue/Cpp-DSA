//Super Keyword:
//Initially un inheritence only child can able to access the data
//parent can't able to access the child class data
//this is basically unidirection reletionship

//with the help of super keyword
//now we can pass the data from child class to 
//parent class

//Super applied in
// 1. methods : on;ly from child to parent method
// 2. constructor : only from child to parent constructor
// 3. variable : from method we can pass

class Parent2{
    public int id;
    public int roll;

    public Parent2(int a,int c){
        this.id=a;
        this.roll=c;
    }

    public void display(){
        System.out.println("id: "+ id+" \nRoll: "+roll);
    }
}
class Child2 extends Parent2{
    
    public String name;

    public Child2(String name,int a , int c){
        super(a,c);

        super.display();
    }
    
}
public class SuperConstructor {
    public static void main(String args[]){

        Child2 ch=new Child2("Aditya",23, 3);

    }
}
