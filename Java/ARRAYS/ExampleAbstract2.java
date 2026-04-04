abstract class Shape{
    abstract double Area();
}
class Circle extends Shape{
    double radius;
    Circle(double r){
        radius=r;
    }
    @Override
    public double Area(){
        return (3.14*radius*radius);
    }
}
class Rectangle extends Shape{
    double l;
    double b;
    Rectangle(double l,double b){
        this.l=l;
        this.b=b;
    }
    @Override
    public double Area(){
        return (l*b);
    }

}

public class ExampleAbstract2 {
    public static void main(String Args[]){
        Rectangle r=new Rectangle(12,4);
        Circle c=new Circle(6);

        System.out.println("Circle Area: "+c.Area());
        System.out.println("Rectangle Area: "+r.Area());
    }
}
