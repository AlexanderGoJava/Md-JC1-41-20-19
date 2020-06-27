/*Напишите программу, в которой используются две переменные логического типа (boolean),
  присвойте им значения и выведете для каждой переменной на экран строку "истина", если
  переменная имеет значение true и "ложь", если переменная имеет значение false.*/
package lesson_1;

import java.util.Scanner;

public class Task_12 {
    public static void main(String[] args) {
        System.out.println("Enter any real number:");
        Scanner sc = new Scanner(System.in);
        double c = sc.nextDouble();
        sc.close();
        System.out.println("The number entered is non-negative?\n" + signOfDouble(c));
    }

    //method checks if the number is non-negative
    public static boolean signOfDouble(double c) {
        boolean a = true, b = false;
        if (c >= 0) {
            return a;
        }
        return b;
    }
}