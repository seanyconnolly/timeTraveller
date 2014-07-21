package net.shaneconnolly.timeTraveller;

import java.util.Calendar;

/**
 * Hello world!
 */
public class App extends Utils {

    public static void main(String[] args) {

        p("running as " + System.getProperty("user.name"));
        getHostname();

        p(Traveller.getToday());

        Traveller.jumpDay("25");

        p("after jump");
        p(Traveller.getNewCalendar().get(Calendar.DAY_OF_MONTH));

        sleep(10);
        Traveller.resetDate();

    }


}
