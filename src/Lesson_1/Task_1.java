//Напишите программу, которая вычисляет ваш вес на Луне с учетом того, что сила тяжести равна 16% от силы тяжести на Земле.
package Lesson_1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        System.out.print("Введите массу человека, кг: ");
        Scanner sc = new Scanner(System.in);
        double m = sc.nextDouble();
        sc.close();
        System.out.println("Вес человека на Луне равен: " + getWeight(m) + " Ньютон(-а/-ов).");
    }

    public static double getWeight(double m) {
        double gEarth = 9.81;
        double gMoon = 0.16 * gEarth;
        m *= gMoon;
        return new BigDecimal(m).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
}
