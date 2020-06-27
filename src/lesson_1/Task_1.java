//Напишите программу, которая вычисляет ваш вес на Луне с учетом того, что сила тяжести равна 16% от силы тяжести на Земле.
package lesson_1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Task_1 {

    public static final double MOON_GRAVITY_BY_PERCENTS = 0.16;
    public static final double EARTH_GRAVITY = 9.81;

    public static void main(String[] args) {
        System.out.print("Enter the mass of a person, kg: ");
        Scanner sc = new Scanner(System.in);
        double mass = sc.nextDouble();
        sc.close();
        System.out.println("The weight of a person on the moon is: " + getWeight(mass) + " Newton(-s).");
    }

    //calculates the free fall coefficient on the moon and return weight on the moon
    public static double getWeight(double mass) {
        double gMoon = MOON_GRAVITY_BY_PERCENTS * EARTH_GRAVITY;
        mass *= gMoon;
        return new BigDecimal(mass).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

}
