import java.util.Calendar;

public class U4Calender {
    public static void main(String args[]){
        Calendar c=Calendar.getInstance();
        
        System.out.println("Day of Month: "+c.get(Calendar.DAY_OF_MONTH));
        System.out.println("Year: "+c.get(Calendar.YEAR));
        System.out.println("Day Of Year: "+c.get(Calendar.DAY_OF_YEAR));
        System.out.println("Week Of Year: "+c.get(Calendar.WEEK_OF_YEAR));
        System.out.println("Week Of Month: "+c.get(Calendar.WEEK_OF_MONTH));

        //What will be the day after 5 days
        c.add(Calendar.DAY_OF_MONTH,5);
        System.out.println("Day after 5 days: "+c.get(Calendar.DAY_OF_MONTH));

        //What will be year after 5 years
        c.add(Calendar.YEAR,+5);
        System.out.println("Year after 5 year's: "+c.get(Calendar.YEAR));
    }
}
