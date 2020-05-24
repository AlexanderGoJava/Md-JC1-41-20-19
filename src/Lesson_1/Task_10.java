//Напишите программу с тремя переменными целого типа, первым двум присвойте значения, а третьей переменной присвойте их сумму. Выведете значение третей переменной на экран.
package Lesson_1;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        System.out.println("Введите 2 целых числа!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Первое число: ");
        int a = sc.nextInt();
        System.out.print("Второе число: ");
        int b = sc.nextInt();
        int c = a + b;
        System.out.println("Сумма двух целых чисел равна: " + c);
    }
}
