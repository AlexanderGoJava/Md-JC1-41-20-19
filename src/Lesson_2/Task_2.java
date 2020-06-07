/*Task 2.  Write a Java program to sum values of an array.
  Задача 2. Напишите Java-программу для суммирования значений массива.*/
package Lesson_2;

import java.util.Arrays;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность массива:");
        int a = sc.nextInt(), i, sum = 0;
        if (a < 0) {
            System.out.println("Введено неверное значение! Программа завершила свою работу.");
            System.exit(0);
        }
        int[] array = new int[a];
        System.out.printf("Введите %d целых чисел:\n", a);
        Scanner sc1 = new Scanner(System.in);
        for (i = 0; i < array.length; i++) {
            array[i] = sc1.nextInt();
        }
        sc.close();
        sc1.close();
        System.out.println("Массив целых чисел: ".concat(Arrays.toString(array)));
        for (i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}
