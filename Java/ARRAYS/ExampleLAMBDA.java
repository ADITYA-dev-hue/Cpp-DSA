@FunctionalInterface
interface Discount{
    public double applyDis(double price);
}
class Main {
    public static void main(String Args[]){
        double price=1000;
        Discount Festival=(p)->(p-(p*0.3));
        Discount VIP = (p)->(p-(p*0.2));

        System.out.printf("Festival: %.2f\n",Festival.applyDis(price));
        System.out.printf("VIP: %.2f",VIP.applyDis(price));
    }
}