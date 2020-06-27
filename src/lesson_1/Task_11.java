//Напишите программу с тремя переменными целого типа. Определить какое из них наибольшее.
package lesson_1;

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        System.out.println("Введите 3 целых числа!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Первое число, a: ");
        int a = sc.nextInt();
        System.out.print("Второе число, b: ");
        int b = sc.nextInt();
        System.out.print("Третье число, c: ");
        int c = sc.nextInt();
        if (a > b && a > c) {
            System.out.println("Число a наибольшее, а = " + a);
        } else if (b > a && b > c) {
            System.out.println("Число b наибольшее, b = " + b);
        } else {
            System.out.println("Число c наибольшее, c = " + c);
        }
    }
}
