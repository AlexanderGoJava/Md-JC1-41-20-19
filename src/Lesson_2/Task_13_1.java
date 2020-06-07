/*Task 13. Write a Java program to find the duplicate values of an array of string values.
  Задача 13. Напишите программу на Java, чтобы найти повторяющиеся значения в массиве строковых значений.*/
package Lesson_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task_13_1 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите размерность строкового массива:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int arraySizeStr = Integer.parseInt(reader.readLine()), i, j;
        if (arraySizeStr < 1) {
            System.out.println("Введено неверное значение! Программа завершила свою работу.");
            System.exit(0);
        }
        String[] arrayStr = new String[arraySizeStr];
        System.out.printf("Введите %d символов/строк:\n", arraySizeStr);
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        for (i = 0; i < arrayStr.length; i++) {
            arrayStr[i] = reader1.readLine();
        }
        reader.close();
        reader1.close();
        System.out.println("Полученный массив символов/строк: ".concat(Arrays.toString(arrayStr)));
        //Без сортировки
        for (i = 0; i < arrayStr.length - 1; i++) {
            for (j = i + 1; j < arrayStr.length; j++) {
                if (arrayStr[i].equals(arrayStr[j])) {
                    System.out.printf("Значение элемента массива ‘%s‘ по индексу \"%d\" совпадает со значением массива ‘%s‘ по индексу \"%d\"\n", arrayStr[i], i, arrayStr[j], j);
                }
            }
        }
    }
}
