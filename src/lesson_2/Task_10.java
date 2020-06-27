/*Task 10. Write a Java program to find the maximum and minimum value of an array.
  Задача 10. Напишите программу на Java, чтобы найти максимальное и минимальное значение массива.*/
package lesson_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task_10 {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter the dimension of the numeric array:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int arraySizeNum = Integer.parseInt(reader.readLine()), i, indexMin, indexMax;
        double minValue, maxValue;
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
        reader.close();
        reader1.close();
        System.out.println("The resulting array of numbers: ".concat(Arrays.toString(arrayNum)));
        indexMin = 0;
        minValue = arrayNum[0];
        indexMax = 0;
        maxValue = arrayNum[0];
        for (i = 1; i < arrayNum.length; i++) {
            if (minValue > arrayNum[i]) {
                minValue = arrayNum[i];
                indexMin = i;
            }
            if (maxValue < arrayNum[i]) {
                maxValue = arrayNum[i];
                indexMax = i;
            }
        }
        System.out.printf("Minimum value in the array: %.1f \nIndex of minimum value: %d \nMaximum value in the array: %.1f \nIndex of maximum value: %d", minValue, indexMin, maxValue, indexMax);
    }
}
