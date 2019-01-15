package com.lecture.nine;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

public class DateOperations {
    public static void main(String[] args) {
        long currentTime = System.currentTimeMillis();
        Date now = new Date();
        System.out.println(now);
        Calendar cal = Calendar.getInstance();
        now = cal.getTime();
        System.out.println(now);
        long currentTimeAgain = System.currentTimeMillis();

        System.out.println(currentTime);
        System.out.println(currentTimeAgain);
        System.out.println(cal.get(Calendar.WEEK_OF_YEAR));

        LocalDate localDate = LocalDate.now();
        LocalDate anotherDate = LocalDate.of(2017, 12, 31);
        LocalDate anotherDateData = LocalDate.parse("2017-12-31");
        LocalDate tomorrow = LocalDate.now().plusDays(1);
        LocalDate previousMonthSameDay = LocalDate.now().minus(1, ChronoUnit.MONTHS);
        DayOfWeek sunday = LocalDate.parse("2017-12-31").getDayOfWeek();
        boolean leapYear = LocalDate.now().isLeapYear();
        boolean isAfter = LocalDate.parse("2016-06-12").isAfter(LocalDate.parse("2014-06-21"));


        LocalTime anotherNow = LocalTime.now();
        LocalTime sixThirty = LocalTime.parse("06:30");
        LocalTime sixThirty1 = LocalTime.of(6, 30);
        LocalTime sevenThirty = LocalTime.parse("06:30").plus(1, ChronoUnit.HOURS);
        int six = LocalTime.parse("06:30").getHour();
        boolean isbefore = LocalTime.parse("06:30").isBefore(LocalTime.parse("07:30"));


        LocalDateTime nowa = LocalDateTime.now();
        LocalDateTime.of(2015, Month.FEBRUARY, 20, 06, 30);
        LocalDateTime.parse("2015-02-20T06:30:00");
        nowa = nowa.plusDays(1);
        nowa = nowa.minusHours(2);
        Month month = nowa.getMonth();

        ZoneId zoneId = ZoneId.of("Europe/Paris");
        Set<String> allZoneIds = ZoneId.getAvailableZoneIds();
        ZonedDateTime zonedDateTime =
                ZonedDateTime.of(nowa, zoneId);

        ZonedDateTime.parse("2015-05-03T10:15:30+01:00[Europe/Paris]");

        LocalDate initialDate = LocalDate.parse("2007-05-10");
        LocalDate finalDate = initialDate.plus(Period.ofDays(5));
        int five = Period.between(initialDate,finalDate ).getDays();
        long fives = ChronoUnit.DAYS.between(initialDate , finalDate);


        LocalTime initialTime = LocalTime.of(6, 30, 0);
        LocalTime finalTime = initialTime.plus(Duration.ofSeconds(30));
        long anotherThirty = Duration.between(initialTime, finalTime).getSeconds();
        long anotherThirty1 = ChronoUnit.SECONDS.between(initialTime,finalTime );



    }
}
