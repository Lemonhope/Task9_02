package Task9_02;

import java.util.Calendar;

public class Main {
    public static void findTimeBetween(Calendar myDate){

        Calendar calendar = Calendar.getInstance();
        long milliseconds1 = myDate.getTimeInMillis();
        long milliseconds2 = calendar.getTimeInMillis();
        long diff = milliseconds2 - milliseconds1;
        long diffSeconds = diff / 1000;
        long diffMinutes = diff / (60 * 1000);
        long diffHours = diff / (60 * 60 * 1000);
        long diffDays = diff / (24 * 60 * 60 * 1000);
        long diffYears = diffDays/365;
        System.out.println("\nYour age:");
        System.out.println("Time in milliseconds: " + diff
                + " milliseconds.");
        System.out.println("Time in seconds: " + diffSeconds
                + " seconds.");
        System.out.println("Time in minutes: " + diffMinutes
                + " minutes.");
        System.out.println("Time in hours: " + diffHours
                + " hours.");
        System.out.println("Time in days: " + diffDays
                + " days.");
        System.out.println("Time in years: " + diffYears
                + " years.");
    }
    public static void main(String[] args) {

        try {
            Calendar birthday = Calendar.getInstance();
            birthday.set(1997, Calendar.MAY, 23);
            findTimeBetween(birthday);
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
