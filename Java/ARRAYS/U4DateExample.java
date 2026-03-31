//Utility Class: a class that having some predefining methods, algorithms,
//classes and data structures that help us to solve problem and build a program
//Due to this class, there is no need to write code for primary task or data structures.

import java.util.Date;

class U4DateExample{
    public static void main(String[] args)
    {
        Date date = new Date();
        System.out.println("Current Date and Time: " + date);

        //Methods of Date

        System.out.println("Year: " + date.getYear());
        System.out.println("Month: " + date.getMonth());
        System.out.println("Date: " + date.getDate());
        System.out.println("Hours: " + date.getHours());
        System.out.println("Minutes: " + date.getMinutes());
        System.out.println("Seconds: " + date.getSeconds());

        System.out.println("Time in milliseconds since January 1, 1970: " + date.getTime());
        System.out.println("Current Year: "+(date.getYear() + 1900)); // Adding 1900 to get the actual year

        //Limitations of Date class
        //1. Having to much small things: calculate month and year
        //2. Having Deprecated methods: getYear(), getMonth(), getDate(),
        //   getHours(), getMinutes(), getSeconds() are deprecated(Not Supported).
        //3. Mutable: date can be mutable it will distruct thread safety
        //Date class is not thread safe.
        }
}