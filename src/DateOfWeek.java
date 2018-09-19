import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateOfWeek {
    public static void main(String[] args) {
        DateOfWeek dateOfWeek = new DateOfWeek();
        dateOfWeek.getFirstAndLastDateOfWeek();
    }

    public void getFirstAndLastDateOfWeek() {
        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(Calendar.DAY_OF_WEEK, calendar1.getFirstDayOfWeek());
        Date dt1 = calendar1.getTime();

        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(Calendar.DAY_OF_WEEK,calendar2.getFirstDayOfWeek()+6);
        Date dt2 = calendar2.getTime();

        SimpleDateFormat dateFormat = new SimpleDateFormat("E dd/MM/yyyy");

        System.out.println("First Date of Week: " + dateFormat.format(dt1));
        System.out.println("Last Date of Week: " + dateFormat.format(dt2));
    }
}



