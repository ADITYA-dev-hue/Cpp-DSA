// Enumuration : it is a user defined datatype
// that stores constant only to reduce name


class Days{
    static final String day1="Monday";
    static final String day2="Tueday";
    static final String day3="Wednesday";
    static final String day4="Thursday";
    static final String day5="Friday";
    static final String day6="Saturday";
    static final String day7="Sunday";
}
enum Day{
    Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday
}
class Enumuration {
    public static void main(String[] args) {
        System.out.println(Days.day7);
        System.out.println(Days.day4);

        Day Day1=Day.Monday;
        System.out.println(Day1);
        Day Day2=Day.Tuesday;
        System.out.println(Day2);
    }
}
