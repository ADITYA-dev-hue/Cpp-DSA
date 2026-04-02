import java.util.List;
import java.util.ArrayList;

public class U4Comparetor {
    // Comparator : Compare the value and sort them.
    public static void main(String Args[]) {

        List<Integer> list = new ArrayList<>();
        list.add(13);
        list.add(51);
        list.add(14);
        list.add(21);
        list.add(19);

        System.out.println("Original list: " + list);

        list.sort((a, b) -> a - b);

        System.out.println("New list: " + list);

        // String List;

        List<String> StrList = new ArrayList<>();
        StrList.add("bfc");
        StrList.add("grc");
        StrList.add("Afc");
        StrList.add("abc");
        System.out.println("Original List: " + StrList);
        // Comparator a.comparator(b);
        StrList.sort((a, b) -> a.compareTo(b));

        System.out.println("Original List: " + StrList);
    }
}
