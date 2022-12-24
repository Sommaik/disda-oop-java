package th.go.dsd.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MyDateTime {
    public static void main(String[] args) {
        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("Before format = " + myDateObj);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d/M/yyyy HH:mm:ss");
        String dateWithFormat = myDateObj.format(dtf);
        System.out.println(dateWithFormat);
    }
}
