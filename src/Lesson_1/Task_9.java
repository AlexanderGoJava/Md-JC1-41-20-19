//Объявить 2 переменных целого типа. Необходимо поменять значения переменных так, чтобы значение первой оказалось во второй, а второй - в первой.
package Lesson_1;

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        System.out.println("Введите 2 целых числа!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Первое число, a: ");
        int a = sc.nextInt();
        System.out.print("Второе число, b: ");
        int b = sc.nextInt();
        a = a + b - (b = a);
        System.out.print("Числа, поменявшиеся местами: a = " + a + " | b = " + b);
    }
}
