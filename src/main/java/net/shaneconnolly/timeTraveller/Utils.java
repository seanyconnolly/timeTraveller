package net.shaneconnolly.timeTraveller;

import java.net.InetAddress;
import java.net.UnknownHostException;

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

    public static void getHostname() {
        try {
            Utils.p("on " + InetAddress.getLocalHost().getHostName());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

}
