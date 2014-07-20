package net.shaneconnolly.timeTraveller;

/**
 * Created by shconnolly on 7/20/14.
 */
public class Utils {


    public static void p(String str) {
        System.out.println(str);
    }

    public static void p(int in) {
        System.out.println(in);
    }

    public static void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }


}
