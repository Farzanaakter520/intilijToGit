package Class21;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class LastDate {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        LocalDate lastDate = today.with(TemporalAdjusters.lastDayOfMonth());

        System.out.println("The Last Date Of the Month :" + lastDate);

    }
}
