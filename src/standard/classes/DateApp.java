package standard.classes;

import java.util.Calendar;
import java.util.Date;

public class DateApp {
  public static void main(String[] args) {
    System.out.println(""); // ? Newline

    Date date = new Date();
    System.out.println("Today is " + date);

    Calendar calendar = Calendar.getInstance();
    calendar.set(Calendar.YEAR, 2017);
    calendar.set(Calendar.MONTH, Calendar.JANUARY);
    calendar.set(Calendar.DAY_OF_MONTH, 1);
    calendar.set(Calendar.HOUR_OF_DAY, 0);

    System.out.println("Past: " + calendar.getTime());
  }
}
