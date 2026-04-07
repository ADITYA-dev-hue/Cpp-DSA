import java.util.Scanner;

class CunstructorOvr {
    // Cunstructor : it is a method that having same name and class
    // it called when obj of class created.

    private String name;

    public CunstructorOvr() {
        System.out.println("Default Cunstructor Called");
    }

    public CunstructorOvr(String name) {
        this.name = name;
        System.out.println("Parameterized Cunstructor Called");
    }

    void display() {
        System.out.println("Name given: " + name);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "";
        if (sc.hasNextLine()) {
            name = sc.nextLine();
        } else {
            name = "Unknown";
        }
        sc.close();
        CunstructorOvr ob = new CunstructorOvr();
        CunstructorOvr obj = new CunstructorOvr(name);
        obj.display();
    }

}
