class CompileTime{
    public int Add(int a,int b){
        return a+b;
    }
    public double Add(double a,double b,double c){
        return a+b+c;
    }
}

public class MethodOverloading4 {
    public static void main(String Args[]){
        CompileTime ct=new CompileTime();
        System.out.println(ct.Add(12,4));
        System.out.println(ct.Add(12.5,55.5,8.9));
    }
}
