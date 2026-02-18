
class Student {
    int rollNo;
    String studentName;
}

public class CL {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.rollNo = 12;
        obj.studentName = "Adyta";

        System.out.println(obj.rollNo);
        System.out.println(obj.studentName);
    }
}
