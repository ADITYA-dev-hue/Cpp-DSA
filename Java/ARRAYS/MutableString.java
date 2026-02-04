class MutableString {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder();
        sb.append("Java");
        System.out.println(sb);

        // 1.Length and capacity4
        // capacity : total capacity of sb
        // Length : current no. of character hold by sb
        System.out.println("Length: " + sb.length());
        System.out.println("Capacity: " + sb.capacity());

        // 2. append

        StringBuilder sb1 = new StringBuilder("Basic");
        sb1.append(true);
        sb1.append(45.332);
        sb1.append(" to advance Lecture");
        System.out.println(sb1);

        // 3. indexOf and lastIndexOf
        System.out.println(sb1.indexOf("t"));
        System.out.println(sb1.lastIndexOf("2"));

        // 4. delete and deleteCharAt
        sb1.delete(5, 7);
        System.out.println(sb1);

        sb1.deleteCharAt(2);
        System.out.println(sb1);

        // 5. replace()
        sb1.replace(7, 9, " Medium ");
        System.out.println(sb1);

        // 6. reverse()
        StringBuilder sb2 = new StringBuilder("Programming");
        sb2.reverse();
        System.out.println(sb2);
    }
}
