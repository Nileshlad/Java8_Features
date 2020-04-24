//---------------------------------------------------------------------------------------------------------------------
//Temporal Adjusters
//        TemporalAdjuster is used to perform the date mathematics. For example,
//        get the "Second Saturday of the Month" or "Next Tuesday".
//        Let us see them in action.
//---------------------------------------------------------------------------------------------------------------------------

package com.date_time_api;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjuster {

    public static void main(String args[]) {
        TemporalAdjuster java8tester = new TemporalAdjuster();
        TemporalAdjuster.testAdjusters();
    }

    public static void testAdjusters() {
        //Get the current date
        LocalDate date1 = LocalDate.now();
        System.out.println("Current date: " + date1);

        //get the next tuesday
        LocalDate nextTuesday = date1.with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
        System.out.println("Next Tuesday on : " + nextTuesday);

        //get the second saturday of next month
        LocalDate firstInYear = LocalDate.of(date1.getYear(),date1.getMonth(), 1);
        LocalDate secondSaturday = firstInYear.with(TemporalAdjusters.nextOrSame(
                DayOfWeek.SATURDAY)).with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
        System.out.println("Second Saturday on : " + secondSaturday);
    }
}

//output
//Current date: 2020-04-25
//        Next Tuesday on : 2020-04-28
//        Second Saturday on : 2020-04-11
