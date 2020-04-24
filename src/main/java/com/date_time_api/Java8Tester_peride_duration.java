////----------------------------------------------------------------------------------------------------------------------
//Period and Duration
//        With Java 8, two specialized classes are introduced to deal with the time differences.
//
//       1.Period − It deals with date based amount of time.
//
//        2.Duration − It deals with time based amount of time.

//--------------------------------------------------------------------------------------------------
package com.date_time_api;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Java8Tester_peride_duration {
    public static void main(String args[]) {
        Java8Tester_peride_duration java8tester = new Java8Tester_peride_duration();
        Java8Tester_peride_duration.testPeriod();
        Java8Tester_peride_duration.testDuration();
    }

    public static void testPeriod() {
        //Get the current date
        LocalDate date1 = LocalDate.now();
        System.out.println("Current date: " + date1);

        //add 1 month to the current date
        LocalDate date2 = date1.plus(1, ChronoUnit.MONTHS);
        System.out.println("Next month: " + date2);

        Period period = Period.between(date2, date1);
        System.out.println("Period: " + period);
    }

    public static void testDuration() {
        LocalTime time1 = LocalTime.now();
        Duration twoHours = Duration.ofHours(2);

        LocalTime time2 = time1.plus(twoHours);
        Duration duration = Duration.between(time1, time2);

        System.out.println("Duration: " + duration);
    }
}

////output
//Current date: 2020-04-25
//        Next month: 2020-05-25
//        Period: P-1M
//        Duration: PT2H