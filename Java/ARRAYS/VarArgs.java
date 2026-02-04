public class VarArgs {
    static void sum(int... number){  //VarArgs must be last parameter
        int total =0;
        for(int i : number){
            total+=i;
        }
        System.out.println("total sum ="+total);
    }
    public static void main(String[] args) {
        sum(1,2);
        sum(1,3,4,2,4);
        sum(1,3,4,2,4,5,6,7);
        sum(1,3,4,2,4,5,6,7,5,2);
        sum(1,3,4,2,4,5,6,7,5,2,5,5);

    }
}
