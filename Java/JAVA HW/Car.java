public class Car {
    // Class fields (attributes)
    String color;
    int year;

    // Class method (behavior)
    public void displayDetails() {
        System.out.println("Color: " + color + ", Year: " + year);
    }

    // The main method is the entry point of the program.
    public static void main(String[] args) {
        // Create an object (instance) of the Car class
        Car myCar = new Car();

        // Access fields and set values using the object
        myCar.color = "Red";
        myCar.year = 2024;

        // Call the method using the object
        myCar.displayDetails(); // Output: Color: Red, Year: 2024
    }
}
