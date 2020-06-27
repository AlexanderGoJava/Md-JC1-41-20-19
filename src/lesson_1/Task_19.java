// Напишите программу, которая будет считать количество часов, минут и секунд в n-ном количестве суток.
package lesson_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Task_19 {

    public static final int HOURS = 24;
    public static final int MINUTES = 60;
    public static final int SECONDS = 60;

    public static void main(String[] args) throws IOException {
        System.out.println("Enter the number of days:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String days = reader.readLine();
        double days1 = Double.parseDouble(days);
        System.out.println("The number of hours in a day is: " + quantityOfHours(days1));
        System.out.println("The number of minutes in a day is: " + quantityOfMinutes(days1));
        System.out.println("The number of seconds in a day is: " + quantityOfSeconds(days1));
    }

    //the method allows you to find out the number of hours in a day
    private static double quantityOfHours(double days1) {
        return new BigDecimal(days1 * HOURS).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    //the method allows you to find out the number of minutes in a day
    private static double quantityOfMinutes(double days1) {
        return new BigDecimal(days1 * HOURS * MINUTES).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    //the method allows you to find out the number of seconds in a day
    private static double quantityOfSeconds(double days1) {
        return new BigDecimal(days1 * HOURS * MINUTES * SECONDS).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
}
