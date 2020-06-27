/*Напишите программу, в которой используются две переменные логического типа (boolean),
  присвойте им значения и выведете для каждой переменной на экран строку "истина", если
  переменная имеет значение true и "ложь", если переменная имеет значение false.*/
package lesson_1;

import java.util.Scanner;

public class Task_12 {
    public static void main(String[] args) {
        System.out.println("Введите любое вещественное число:");
        Scanner sc = new Scanner(System.in);
        double c = sc.nextDouble();
        System.out.println("Введённое число является неотрицательным?\n" + signOfDouble(c));
    }

    public static boolean signOfDouble(double c) {
        boolean a = true, b = false;
        if (c >= 0) {
            return a;
        }
        return b;
    }
}