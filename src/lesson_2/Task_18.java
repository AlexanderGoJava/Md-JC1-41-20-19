/*Task 18. Write a Java program to find the second smallest element in an array.
  Задача 18. Напишите программу на Java, чтобы найти второй наименьший элемент в массиве.*/
package lesson_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task_18 {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter the dimension of the numeric array:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int arraySizeNum = Integer.parseInt(reader.readLine()), i, j;
        double k, minValueNum, minSecondNum;
        if (arraySizeNum < 0) {
            System.out.println("Incorrect value entered! The program has completed its work.");
            System.exit(0);
        }
        double[] arrayNum = new double[arraySizeNum];
        System.out.printf("Enter %d numbers:\n", arraySizeNum);
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        for (i = 0; i < arrayNum.length; i++) {
            arrayNum[i] = Double.parseDouble(reader1.readLine());
        }
        System.out.println("The resulting array of numbers: ".concat(Arrays.toString(arrayNum)));
        for (i = 1; i < arrayNum.length; i++) {
            for (j = arraySizeNum - 1; j >= i; j--) {
                if (arrayNum[j - 1] > arrayNum[j]) {
                    k = arrayNum[j - 1];
                    arrayNum[j - 1] = arrayNum[j];
                    arrayNum[j] = k;
                }
            }
        }
        System.out.println("Array of integers sorted in ascending order: ".concat(Arrays.toString(arrayNum)));
        minValueNum = arrayNum[0];
        for (i = 0; i < arrayNum.length - 1; i++) {
            if (arrayNum[i + 1] > minValueNum) {
                minSecondNum = arrayNum[i + 1];
                System.out.printf("The second smallest element in the array: %.1f\n", minSecondNum);
                break;
            }
        }
        //Стоковый массив
        System.out.println("Enter the dimension of the string array:");
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        int arraySizeStr = Integer.parseInt(reader2.readLine());
        String minValueStr, minSecondStr;
        if (arraySizeStr < 0) {
            System.out.println("Incorrect value entered! The program has completed its work.");
            System.exit(0);
        }
        String[] arrayStr = new String[arraySizeStr];
        System.out.printf("Enter %d strings:\n", arraySizeStr);
        BufferedReader reader3 = new BufferedReader(new InputStreamReader(System.in));
        for (i = 0; i < arrayStr.length; i++) {
            arrayStr[i] = reader3.readLine();
        }
        reader.close();
        reader1.close();
        reader2.close();
        reader3.close();
        System.out.println("The resulting array of strings: ".concat(Arrays.toString(arrayStr)));
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
        System.out.println("Array of characters/strings, sorted ascending:\n".concat(Arrays.toString(arrayStr)));
        minValueStr = arrayStr[0];
        for (i = 0; i < arrayStr.length - 1; i++) {
            if (!arrayStr[i + 1].equals(minValueStr)) {
                minSecondStr = arrayStr[i + 1];
                System.out.printf("The second largest element in the array: %s\n", minSecondStr);
                break;
            }
        }
    }
}
