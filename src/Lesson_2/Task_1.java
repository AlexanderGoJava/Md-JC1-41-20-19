/* Task 1.  Write a Java program to sort a numeric array and a string array.
   Задача 1. Напишите Java-программу для сортировки числового массива и строкового массива.*/
package Lesson_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task_1 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите размерность целочисленного массива:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine()), i, j, k;
        if (a < 0) {
            System.out.println("Введено неверное значение! Программа завершила свою работу.");
            System.exit(0);
        }
        int[] array = new int[a];
        System.out.printf("Введите %d целых чисел:\n", a);
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        for (i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader1.readLine());
        }
        System.out.println("Массив целых чисел до сортировки:\n".concat(Arrays.toString(array)));
        // Сортировка массива целых чисел по возрастанию
        for (i = 1; i < array.length; i++) {
            for (j = a - 1; j >= i; j--) {
                if (array[j - 1] > array[j]) {
                    k = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = k;
                }
            }
        }
        System.out.println("Массив целых чисел, отсортированный по возрастанию:\n".concat(Arrays.toString(array)));
        // Сортировка массива целых чисел по убыванию
        for (i = 1; i < array.length; i++) {
            for (j = 1; j <= array.length - 1; j++) {
                if (array[j - 1] < array[j]) {
                    k = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = k;
                }
            }
        }
        System.out.println("Массив целых чисел, отсортированный по убыванию:\n".concat(Arrays.toString(array)));
        // Сортировка массива строк
        System.out.println("Введите размерность строкового массива:");
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        int b = Integer.parseInt(reader2.readLine());
        if (b < 0) {
            System.out.println("Введено неверное значение! Программа завершила свою работу.");
            System.exit(0);
        }
        String[] str = new String[b];
        System.out.printf("Введите %d символов/строк:\n", b);
        BufferedReader reader3 = new BufferedReader(new InputStreamReader(System.in));
        for (i = 0; i < str.length; i++) {
            str[i] = reader3.readLine();
        }
        reader.close();
        reader1.close();
        reader2.close();
        reader3.close();
        System.out.println("Массив символов/строк до сортировки:\n".concat(Arrays.toString(str)));
        // Сортировка массива строк по возрастанию
        String temp;
        for (i = 0; i < str.length; i++) {
            for (j = 0; j < str.length - 1; j++) {
                if (str[j].compareTo(str[j + 1]) > 0) {
                    temp = str[j];
                    str[j] = str[j + 1];
                    str[j + 1] = temp;
                }
            }
        }
        System.out.println("Массив символов/строк, отсортированный по возрастанию:\n".concat(Arrays.toString(str)));
        // Сортировка массива строк по убыванию
        String temp1;
        for (i = 0; i < str.length; i++) {
            for (j = 0; j < str.length - 1; j++) {
                if (str[j].compareTo(str[j + 1]) < 0) {
                    temp1 = str[j];
                    str[j] = str[j + 1];
                    str[j + 1] = temp1;
                }
            }
        }
        System.out.println("Массив символов/строк, отсортированный по убыванию:\n".concat(Arrays.toString(str)));
    }
}