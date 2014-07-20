package net.shaneconnolly.timeTraveller;

import java.io.IOException;
import java.util.Calendar;

/**
 * Created by shconnolly on 7/20/14.
 */
public class Traveller {

    public static void jumpDay(String day) {
        setSystemTime(day);
    }

    private static void setSystemTime(String day) {
        String strDateTimeToSet = String.format("07%s01002014", day);
        Utils.p("Setting date to " + strDateTimeToSet);
        try {
            Runtime.getRuntime().exec("date " + strDateTimeToSet); // MMddhhmm[[yy]yy]
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void getSystemTime() {

    }

    public static Calendar getTimeInJava() {
        Calendar today = Calendar.getInstance();

        return today;

    }
}
