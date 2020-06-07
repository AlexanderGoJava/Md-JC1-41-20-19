/*Task 12. Write a Java program to find the duplicate values of an array of integer values.
  Задача 12. Напишите программу на Java, чтобы найти повторяющиеся значения в массиве целочисленных значений.*/
package Lesson_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task_12 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите размерность численного массива:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int arraySizeNum = Integer.parseInt(reader.readLine()), i, j, k;
        if (arraySizeNum < 1) {
            System.out.println("Введено неверное значение! Программа завершила свою работу.");
            System.exit(0);
        }
        int[] arrayNum = new int[arraySizeNum];
        System.out.printf("Введите %d чисел:\n", arraySizeNum);
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        for (i = 0; i < arrayNum.length; i++) {
            arrayNum[i] = Integer.parseInt(reader1.readLine());
        }
        reader.close();
        reader1.close();
        System.out.println("Полученный массив чисел: ".concat(Arrays.toString(arrayNum)));
        //Сортировка целочисленного массива
        for (i = 1; i < arrayNum.length; i++) {
            for (j = arraySizeNum - 1; j >= i; j--) {
                if (arrayNum[j - 1] > arrayNum[j]) {
                    k = arrayNum[j - 1];
                    arrayNum[j - 1] = arrayNum[j];
                    arrayNum[j] = k;
                }
            }
        }
        System.out.println("Массив целых чисел, отсортированный по возрастанию:\n".concat(Arrays.toString(arrayNum)));
        for (i = 0; i < arrayNum.length - 1; i++) {
            if (arrayNum[i] == arrayNum[i + 1]) {
                System.out.printf("Значение элемента массива ‘%d‘ по индексу \"%d\" совпадает со значением массива ‘%d‘ по индексу \"%d\"\n", arrayNum[i], i, arrayNum[i + 1], i + 1);
            }
        }
    }
}
