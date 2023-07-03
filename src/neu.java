import java.time.DayOfWeek;
import java.time.MonthDay;

public class neu {
    public static void main(String[] args) {
        DayOfWeek day = DayOfWeek.MONDAY;


        int dayOfWeek = switch (day)
        {

            case MONDAY, FRIDAY, SUNDAY -> 6;
            case TUESDAY                -> 7;
            case THURSDAY, SATURDAY     -> 8;
            case WEDNESDAY              -> 9;

        };
        System.out.println(dayOfWeek);

    }
}
