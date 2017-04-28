/*
Project Euler # 19

*/

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CS {
   public static void main(String args[]) {
      Calendar start = new GregorianCalendar(1901, Calendar.JANUARY, 1);
      Calendar end = new GregorianCalendar(2000, Calendar.DECEMBER, 31);
      int count = 0;

      while (start.before(end)) {
          if (start.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY)
              count++;
          start.add(Calendar.MONTH, 1);
      }
      System.out.println(count);

   }
}
