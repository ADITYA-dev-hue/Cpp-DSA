class StringOperation {
    public static void main(String args[]) {
        char[] str = new char[] { 'H', 'e', 'l', 'l', 'o' };
        System.out.println(str);

        String str1 = "Hello"; // this stores in SCP(String Constant Pool)
        String str2 = new String("Hello World");// Stores in heap

        String sentence1 = "Java programming";
        String sentence2 = "Object oriented programming";

        // 1. Length
        System.out.println(sentence1.length());
        System.out.println(sentence2.length());

        // 2. Concatenate

        String str3 = sentence1.concat(sentence2);
        System.out.println(str3);

        System.out.println(sentence1 + " " + sentence2);

        // charAt : to find character at index
        System.out.println(sentence1.charAt(5));
        System.out.println(sentence1.charAt(1));
        System.out.println(sentence1.charAt(0));

        System.out.println(sentence2.charAt(6));
        System.out.println(sentence2.charAt(10));

        System.out.println(sentence2.charAt(sentence2.length() - 1));

        // 4. indexOf
        System.out.println(sentence1.indexOf('P'));

        // 5. LastIndexOf
        System.out.println(sentence2.indexOf('a'));

        // 6. contains
        System.out.println(str3.contains("Object"));

        String ex = "String operation ";
        System.out.println(ex.contains("String"));

        // 7. trim
        String word = "   House    ";
        System.out.println(word);
        System.out.println(word.trim());

        // 8. Replace
        System.out.println(ex.replace('i', 'a'));
        System.out.println(ex.replace('O', 'i'));

        // 9. uppercase && lowercase

        System.out.println(ex.toLowerCase());
        System.out.println(ex.toUpperCase());

        // 10. split : it split whole string into separate words;
        String sep = "it split whole string into separate words into the world wide Natural Disaster's";
        String separate[] = sep.split(" ");
        System.out.println(separate[0]);
        System.out.println(separate[2]);
        System.out.println(separate[1]);

        for (String x : separate) {
            System.out.print(x + " ");
        }
        System.out.println();
        // 11. SubString : to extract substring

        System.out.println(sep.substring(7));
        System.out.println(sep.substring(3, 10));

    }
}