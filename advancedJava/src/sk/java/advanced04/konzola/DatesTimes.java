package sk.java.advanced04.konzola;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

public class DatesTimes {
    public static void main(String[] args) {
        localDate();
        localTime();
        localDateTime();
    }

    private static void localDate() {
        LocalDate xMas = LocalDate.of(2017, 12, 24);
        LocalDate xMas2 = LocalDate.parse("2017-12-24");

        LocalDate tomorrow = LocalDate.now().plusDays(1);
        LocalDate anotherDate = LocalDate.now().minus( 1, ChronoUnit.MONTHS);

        DayOfWeek dayOfWeek = LocalDate.parse("2017-12-29").getDayOfWeek();
        System.out.println(dayOfWeek);

        boolean isLeapYear = LocalDate.now().isLeapYear();


        boolean isBefore = LocalDate.parse("2017-07-12").isBefore(LocalDate.parse("2017-08-11"));
        boolean isAfter = LocalDate.parse("2017-07-12").isAfter(LocalDate.parse("2017-08-11"));

        LocalDate firstDayOfMonth = LocalDate.parse("2017-12-24")
                .with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(firstDayOfMonth);
    }

    private static void localTime() {
//        bez datumu
        LocalTime now = LocalTime.now();
        LocalTime sixThirty = LocalTime.parse("06:30");
        LocalTime sixThirty2 = LocalTime.of(6, 30);

        LocalTime sevenThirty = LocalTime.parse("06:30").plus(1, ChronoUnit.HOURS);


        int six = LocalTime.parse("06:30").getHour();
        boolean isbefore = LocalTime.parse("06:30").isBefore(LocalTime.parse("07:30"));

        LocalTime maxTime = LocalTime.MAX;

    }

    private static void localDateTime() {
        LocalDateTime.now();
        LocalDateTime.of(2015, Month.FEBRUARY, 20, 06, 30);
        LocalDateTime localDateTime = LocalDateTime.parse("2015-02-20T06:30:00");
        localDateTime = localDateTime.plusDays(1);
        localDateTime = localDateTime.minusHours(2);
        System.out.println(localDateTime);
    }

}
