package net.shaneconnolly.timeTraveller;

import java.io.IOException;
import java.util.Calendar;

/**
 * Created by shconnolly on 7/20/14.
 */
public class Traveller extends Utils {

    private static Calendar calendar;
    private static int year;
    private static int month;
    private static String newMonth;
    private static int dayOfMonth;
    private static int hourOfDay;
    private static int minute;
    public static final String RIGHT_NOW = getNow();


    public static void jumpDay(String day) {
        setSystemTime(setStringByDay(day));
    }

    private static void setSystemTime(String strDateTimeToSet) {
        String command = "date " + strDateTimeToSet;
        p("cmd:  " + command);
        runSystemCommand(command);

    }

    public static void getSystemTime() {

    }

    public static Calendar getNewCalendar() {
        return Calendar.getInstance();

    }

    public static String getNow() {
        calendar = Calendar.getInstance();
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH) + 1; // Jan = 0, dec = 11
        dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
        hourOfDay = calendar.get(Calendar.HOUR_OF_DAY); // 24 hour clock
        minute = calendar.get(Calendar.MINUTE);

        newMonth = String.format("%02d", month);
        String dateString = String.format("%s%s%s%s%s", newMonth, dayOfMonth, hourOfDay, minute, year);

        p("       mm-dd-mm-yyyy");
        p("now is " + dateString);
        return dateString;
    }

    private static String setStringByDay(String newDay) {
        return String.format("%s%s%s%s%s", newMonth, newDay, hourOfDay, minute, year);
    }


    public static void runSystemCommand(String cmd) {
        try {
            Runtime.getRuntime().exec(cmd); // MMddhhmm[[yy]yy]
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void resetDate() {
        runSystemCommand("date " + RIGHT_NOW);
        p("reset day to " + RIGHT_NOW);
    }

    public static int getToday() {
        return dayOfMonth;
    }

}
