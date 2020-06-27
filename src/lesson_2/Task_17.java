/*Task 17. Write a Java program to find the second largest element in an array.
  Задача 17. Напишите программу на Java, чтобы найти второй по величине элемент в массиве.*/
package lesson_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task_17 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите размерность численного массива:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int arraySizeNum = Integer.parseInt(reader.readLine()), i, j;
        double k, maxValueNum, maxSecondNum;
        if (arraySizeNum < 0) {
            System.out.println("Введено неверное значение! Программа завершила свою работу.");
            System.exit(0);
        }
        double[] arrayNum = new double[arraySizeNum];
        System.out.printf("Введите %d чисел:\n", arraySizeNum);
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        for (i = 0; i < arrayNum.length; i++) {
            arrayNum[i] = Double.parseDouble(reader1.readLine());
        }
        System.out.println("Полученный массив чисел: ".concat(Arrays.toString(arrayNum)));
        for (i = 1; i < arrayNum.length; i++) {
            for (j = 1; j <= arrayNum.length - 1; j++) {
                if (arrayNum[j - 1] < arrayNum[j]) {
                    k = arrayNum[j];
                    arrayNum[j] = arrayNum[j - 1];
                    arrayNum[j - 1] = k;
                }
            }
        }
        System.out.println("Массив чисел, отсортированный по убыванию:\n".concat(Arrays.toString(arrayNum)));
        maxValueNum = arrayNum[0];
        for (i = 0; i < arrayNum.length - 1; i++) {
            if (arrayNum[i + 1] < maxValueNum) {
                maxSecondNum = arrayNum[i + 1];
                System.out.printf("Второй по величине элемент в массиве: %.1f\n", maxSecondNum);
                break;
            }
        }
        //Стоковый массив
        System.out.println("Введите размерность строкового массива:");
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        int arraySizeStr = Integer.parseInt(reader2.readLine());
        String maxValueStr, maxSecondStr;
        if (arraySizeStr < 0) {
            System.out.println("Введено неверное значение! Программа завершила свою работу.");
            System.exit(0);
        }
        String[] arrayStr = new String[arraySizeStr];
        System.out.printf("Введите %d строк:\n", arraySizeStr);
        BufferedReader reader3 = new BufferedReader(new InputStreamReader(System.in));
        for (i = 0; i < arrayStr.length; i++) {
            arrayStr[i] = reader3.readLine();
        }
        reader.close();
        reader1.close();
        reader2.close();
        reader3.close();
        System.out.println("Полученный массив строк: ".concat(Arrays.toString(arrayStr)));
        String temp1;
        for (i = 0; i < arrayStr.length; i++) {
            for (j = 0; j < arrayStr.length - 1; j++) {
                if (arrayStr[j].compareTo(arrayStr[j + 1]) < 0) {
                    temp1 = arrayStr[j];
                    arrayStr[j] = arrayStr[j + 1];
                    arrayStr[j + 1] = temp1;
                }
            }
        }
        System.out.println("Массив символов/строк, отсортированный по убыванию:\n".concat(Arrays.toString(arrayStr)));
        maxValueStr = arrayStr[0];
        for (i = 0; i < arrayStr.length - 1; i++) {
            if (!arrayStr[i + 1].equals(maxValueStr)) {
                maxSecondStr = arrayStr[i + 1];
                System.out.printf("Второй по величине элемент в массиве: %s\n", maxSecondStr);
                break;
            }
        }
    }
}