/*Task 16. Write a Java program to remove duplicate elements from an array.
  Задача 16. Напишите Java-программу для удаления дублирующихся элементов из массива.*/
package Lesson_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task_16 {
    public static void main(String[] args) throws IOException {
        //Массив чисел
        System.out.println("Введите размерность численного массива:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int arraySizeNum = Integer.parseInt(reader.readLine()), counter = 0, i, j;
        if (arraySizeNum < 1) {
            System.out.println("Введено неверное значение! Программа завершила свою работу.");
            System.exit(0);
        }
        double[] arrayNum = new double[arraySizeNum];
        System.out.printf("Введите %d чисел:\n", arraySizeNum);
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        for (i = 0; i < arrayNum.length; i++) {
            arrayNum[i] = Double.parseDouble(reader1.readLine());
        }
        System.out.println("Массив чисел до удаления повторяющихся элементов: ".concat(Arrays.toString(arrayNum)));
        for (i = 1; i < arrayNum.length; i++) {
            for (j = arraySizeNum - 1; j >= i; j--) {
                if (arrayNum[j - 1] > arrayNum[j]) {
                    arrayNum[j - 1] = arrayNum[j - 1] + arrayNum[j] - (arrayNum[j] = arrayNum[j - 1]);
                }
            }
        }
        System.out.println("Массив целых чисел, отсортированный по возрастанию: ".concat(Arrays.toString(arrayNum)));
        for (i = 0; i < arrayNum.length - 1; i++) {
            if (arrayNum[i] == arrayNum[i + 1]) {
                counter++;
            }
        }
        if (counter == 0) {
            System.out.println("Совпадений не найдено!");
            System.exit(0);
        }
        double[] arrayCopyNum = new double[arrayNum.length - counter];
        arrayCopyNum[j = 0] = arrayNum[0];
        for (i = 0; i < arrayNum.length - 1; i++) {
            if (arrayNum[i] != arrayNum[i + 1]) {
                arrayCopyNum[j += 1] = arrayNum[i + 1];
            }
        }
        System.out.println("Массив чисел после удаления повторяющихся элементов: ".concat(Arrays.toString(arrayCopyNum)));
        //Массив строк
        System.out.println("Введите размерность строкового массива:");
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        int arraySizeStr = Integer.parseInt(reader2.readLine());
        if (arraySizeStr < 1) {
            System.out.println("Введено неверное значение! Программа завершила свою работу.");
            System.exit(0);
        }
        String[] arrayStr = new String[arraySizeStr];
        System.out.printf("Введите %d чисел:\n", arraySizeStr);
        BufferedReader reader3 = new BufferedReader(new InputStreamReader(System.in));
        for (i = 0; i < arrayStr.length; i++) {
            arrayStr[i] = reader3.readLine();
        }
        reader.close();
        reader1.close();
        reader2.close();
        reader3.close();
        System.out.println("Массив строк до удаления повторяющихся элементов: ".concat(Arrays.toString(arrayStr)));
        //Сортировка строкового массива
        String temp;
        for (i = 0; i < arrayStr.length; i++) {
            for (j = 0; j < arrayStr.length - 1; j++) {
                if (arrayStr[j].compareTo(arrayStr[j + 1]) > 0) {
                    temp = arrayStr[j];
                    arrayStr[j] = arrayStr[j + 1];
                    arrayStr[j + 1] = temp;
                }
            }
        }
        System.out.println("Массив символов/строк, отсортированный по возрастанию: ".concat(Arrays.toString(arrayStr)));
        counter = 0;
        for (i = 0; i < arrayStr.length - 1; i++) {
            if (arrayStr[i].equals(arrayStr[i + 1])) {
                counter++;
            }
        }
        if (counter == 0) {
            System.out.println("Совпадений не найдено!");
            System.exit(0);
        }
        String[] arrayCopyStr = new String[arrayStr.length - counter];
        arrayCopyStr[j = 0] = arrayStr[0];
        for (i = 0; i < arrayStr.length - 1; i++) {
            if (!arrayStr[i].equals(arrayStr[i + 1])) {
                arrayCopyStr[j += 1] = arrayStr[i + 1];
            }
        }
        System.out.println("Массив чисел после удаления повторяющихся элементов: ".concat(Arrays.toString(arrayCopyStr)));
    }
}