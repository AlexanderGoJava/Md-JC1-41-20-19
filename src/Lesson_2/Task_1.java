/* Task 1.  Write a Java program to sort a numeric array and a string array.
   Задача 1. Напишите Java-программу для сортировки числового массива и строкового массива.*/
package Lesson_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task_1 {
    public static void main(String[] args) throws IOException {
        int a = 10, i, j, k;
        int[] array = new int[a];
        System.out.printf("Введите %d целых чисел (числа):\n", a);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (i = 0; i < array.length; i++) {
            String s = reader.readLine();
            int b = Integer.parseInt(s);
            array[i] = b;
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
        String[] str = new String[a];
        System.out.printf("Введите %d символов (символа):\n", a);
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        for (i = 0; i < str.length; i++) {
            str[i] = reader1.readLine();
        }
        reader1.close();
        System.out.println("Массив строк до сортировки:\n".concat(Arrays.toString(str)));
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
        System.out.println("Массив строк, отсортированный по возрастанию:\n".concat(Arrays.toString(str)));
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
        System.out.println("Массив строк, отсортированный по убыванию:\n".concat(Arrays.toString(str)));
    }
}