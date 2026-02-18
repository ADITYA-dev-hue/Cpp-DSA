import java.util.List;
import java.util.ArrayList;

//[or] import java.util.*;
public class WraperClass {
    public static void main(String args[]) {
        Integer i = Integer.valueOf(100);
        Character c = Character.valueOf('A');
        Double d = Double.valueOf(12.44);
        Float f = Float.valueOf(32.14f);

        System.out.println(i);
        System.out.println(c);
        System.out.println(d);
        System.out.println(f);

        Integer a = 90;
        System.out.println(a);

        // if you do with int show error in list.

        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(390);
        list.add(200);

        for (int x : list) {
            System.out.print(x + " ");
        }

        System.out.println("\nInteger MAX: " + Integer.MAX_VALUE);
        System.out.println("Integer MIN: " + Integer.MIN_VALUE);
        System.out.println("Integer SIZE: " + Integer.SIZE);

        System.out.println("\nByte MAX: " + Byte.MAX_VALUE);
        System.out.println("Byte MIN: " + Byte.MIN_VALUE);
        System.out.println("Byte SIZE: " + Byte.SIZE);
    }
}
