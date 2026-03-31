import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//improved version of Date and Calender Class.

public class U4DateAndTime {
    public static void main(String Args[]){
        LocalDate ld=LocalDate.now();
        System.out.println("Current Date: "+ld);
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fDate = ld.format(f);

        System.out.println("Formated Current Date : "+fDate);

        LocalTime lt = LocalTime.now();
        System.out.println("Local Time: "+lt);
        lt=lt.plusHours(2);
        System.out.println("Time After 2 Hours: "+lt);

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("Current Date And Time: "+ldt);
    }
}