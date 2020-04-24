////----------------------------------------------------------------------------------------------------------------------
//With Java 8, a new Date-Time API is introduced to cover the following drawbacks of old date-time API.
//        1.Not thread safe − java.util.Date is not thread safe, thus developers have to deal with concurrency
//        issue while using date. The new date-time API is immutable and does not have setter methods.

//        2.Poor design − Default Date starts from 1900, month starts from 1, and day starts from 0, so no uniformity.
//        The old API had less direct methods for date operations. The new API provides numerous utility methods for such operations.

//        3.Difficult time zone handling − Developers had to write a lot of code to deal with timezone issues.
//        The new API has been developed keeping domain-specific design in mind.
////----------------------------------------------------------------------------------------------------------------------
//Java 8 introduces a new date-time API under the package java.time. Following are some of the important classes
// introduced in java.time package.
//        1.Local − Simplified date-time API with no complexity of timezone handling.
//        2.Zoned − Specialized date-time API to deal with various timezones.
//
//        Local Date-Time API
//        LocalDate/LocalTime and LocalDateTime classes simplify the development where timezones are not required.
//        Let's see them in action.
//---------------------------------------------------------------------------------------------------------------------------

package com.date_time_api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Java8Tester {
    public static void main(String args[]) {
        Java8Tester java8tester = new Java8Tester();
        java8tester.testLocalDateTime();
    }

    public void testLocalDateTime() {
        // Get the current date and time
        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println("Current DateTime: " + currentTime);

        LocalDate date1 = currentTime.toLocalDate();
        System.out.println("date1: " + date1);

        Month month = currentTime.getMonth();
        int day = currentTime.getDayOfMonth();
        int seconds = currentTime.getSecond();

        System.out.println("Month: " + month +"day: " + day +"seconds: " + seconds);

        LocalDateTime date2 = currentTime.withDayOfMonth(10).withYear(2012);
        System.out.println("date2: " + date2);

        //12 december 2014
        LocalDate date3 = LocalDate.of(2014, Month.DECEMBER, 12);
        System.out.println("date3: " + date3);

        //22 hour 15 minutes
        LocalTime date4 = LocalTime.of(22, 15);
        System.out.println("date4: " + date4);

        //parse a string
        LocalTime date5 = LocalTime.parse("20:15:30");
        System.out.println("date5: " + date5);
    }

    public void testDuration() {
    }

    public void testPeriod() {
    }
}

//---------------------------------------------------------------------------------------------------------------------------
////output
//Current DateTime: 2014-12-09T11:00:45.457
//        date1: 2014-12-09
//        Month: DECEMBERday: 9seconds: 45
//        date2: 2012-12-10T11:00:45.457
//        date3: 2014-12-12
//        date4: 22:15
//        date5: 20:15:30