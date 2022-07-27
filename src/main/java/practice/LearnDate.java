package practice;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class LearnDate {
    public void captureDate(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        DateTimeFormatter dtfUs = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();

        System.out.println(dtf.format(now));
        System.out.println(dtfUs.format(now));
        System.out.println(now);

        Date date = Calendar.getInstance().getTime();
        System.out.println(date);
    }
}
