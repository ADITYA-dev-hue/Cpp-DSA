public class MethodOverloading {
    void addition(int a, int b) {
        System.out.println("Int Sum: " + (a + b));
    }

    void addition(double a, double b) {
        System.out.printf("Double Sum: %.2f\n", (a + b));
    }

    static void add(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    public static void main(String[] args) {
        MethodOverloading mo = new MethodOverloading();
        mo.addition(3, 4); // Without Static we need an object.
        add(4, 5); // With Static no need of object.
        mo.addition(23.3, 32.33);
    }
}
