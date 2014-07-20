package net.shaneconnolly.timeTraveller;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Calendar;

/**
 * Hello world!
 */
public class App {

    private static int today;

    public static void main(String[] args) {

        setToday();

        Utils.p("running as " + System.getProperty("user.name"));
        try {
            Utils.p("on " + InetAddress.getLocalHost().getHostName());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

        Utils.p(today);

        Traveller.jumpDay("25");

        Utils.p("after jump");
        Utils.p(Traveller.getTimeInJava().get(Calendar.DAY_OF_MONTH));
        Utils.p(Traveller.getTimeInJava().get(Calendar.DAY_OF_WEEK));

        resetDate();

    }

    private static void resetDate() {
        Traveller.jumpDay(Integer.toString(today));
        Utils.p("reset day to " + today);
    }

    private static void setToday() {
        today = Traveller.getTimeInJava().get(Calendar.DAY_OF_MONTH);
        Utils.p("today is " + today);
    }
}
