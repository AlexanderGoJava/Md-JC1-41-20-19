/*Task 16. Write a Java program to remove duplicate elements from an array.
  Задача 16. Напишите Java-программу для удаления дублирующихся элементов из массива.*/
package lesson_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task_16 {
    public static void main(String[] args) throws IOException {
        //Массив чисел
        System.out.println("Enter the dimension of the numeric array:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int arraySizeNum = Integer.parseInt(reader.readLine()), counter = 0, i, j;
        if (arraySizeNum < 1) {
            System.out.println("Incorrect value entered! The program has completed its work.");
            System.exit(0);
        }
        double[] arrayNum = new double[arraySizeNum];
        System.out.printf("Enter %d numbers:\n", arraySizeNum);
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        for (i = 0; i < arrayNum.length; i++) {
            arrayNum[i] = Double.parseDouble(reader1.readLine());
        }
        System.out.println("Array of numbers before removing duplicate elements: ".concat(Arrays.toString(arrayNum)));
        for (i = 1; i < arrayNum.length; i++) {
            for (j = arraySizeNum - 1; j >= i; j--) {
                if (arrayNum[j - 1] > arrayNum[j]) {
                    arrayNum[j - 1] = arrayNum[j - 1] + arrayNum[j] - (arrayNum[j] = arrayNum[j - 1]);
                }
            }
        }
        System.out.println("Array of integers sorted in ascending order: ".concat(Arrays.toString(arrayNum)));
        for (i = 0; i < arrayNum.length - 1; i++) {
            if (arrayNum[i] == arrayNum[i + 1]) {
                counter++;
            }
        }
        if (counter == 0) {
            System.out.println("No matches found!");
            System.exit(0);
        }
        double[] arrayCopyNum = new double[arrayNum.length - counter];
        arrayCopyNum[j = 0] = arrayNum[0];
        for (i = 0; i < arrayNum.length - 1; i++) {
            if (arrayNum[i] != arrayNum[i + 1]) {
                arrayCopyNum[j += 1] = arrayNum[i + 1];
            }
        }
        System.out.println("Array of numbers after removing duplicate elements: ".concat(Arrays.toString(arrayCopyNum)));
        //Массив строк
        System.out.println("Enter the dimension of the string array:");
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        int arraySizeStr = Integer.parseInt(reader2.readLine());
        if (arraySizeStr < 1) {
            System.out.println("Incorrect value entered! The program has completed its work.");
            System.exit(0);
        }
        String[] arrayStr = new String[arraySizeStr];
        System.out.printf("Enter %d numbers:\n", arraySizeStr);
        BufferedReader reader3 = new BufferedReader(new InputStreamReader(System.in));
        for (i = 0; i < arrayStr.length; i++) {
            arrayStr[i] = reader3.readLine();
        }
        reader.close();
        reader1.close();
        reader2.close();
        reader3.close();
        System.out.println("Array of strings before removing duplicate items: ".concat(Arrays.toString(arrayStr)));
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
        System.out.println("Array of characters/strings, sorted ascending: ".concat(Arrays.toString(arrayStr)));
        counter = 0;
        for (i = 0; i < arrayStr.length - 1; i++) {
            if (arrayStr[i].equals(arrayStr[i + 1])) {
                counter++;
            }
        }
        if (counter == 0) {
            System.out.println("No matches found!");
            System.exit(0);
        }
        String[] arrayCopyStr = new String[arrayStr.length - counter];
        arrayCopyStr[j = 0] = arrayStr[0];
        for (i = 0; i < arrayStr.length - 1; i++) {
            if (!arrayStr[i].equals(arrayStr[i + 1])) {
                arrayCopyStr[j += 1] = arrayStr[i + 1];
            }
        }
        System.out.println("Array of numbers after removing duplicate elements: ".concat(Arrays.toString(arrayCopyStr)));
    }
}