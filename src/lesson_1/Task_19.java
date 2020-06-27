// Напишите программу, которая будет считать количество часов, минут и секунд в n-ном количестве суток.
package lesson_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Task_19 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите количество суток:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String days = reader.readLine();
        double days1 = Double.parseDouble(days);
        System.out.println("Количество часов в сутках равно: " + quantityOfHours(days1));
        System.out.println("Количество минут в сутках равно: " + quantityOfMinutes(days1));
        System.out.println("Количество секунд в сутках равно: " + quantityOfSeconds(days1));
    }

    private static double quantityOfHours(double days1) {
        return new BigDecimal(days1 * 24).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    private static double quantityOfMinutes(double days1) {
        return new BigDecimal(days1 * 24 * 60).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    private static double quantityOfSeconds(double days1) {
        return new BigDecimal(days1 * 24 * 60 * 60).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
}
