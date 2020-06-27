/*Task 11. Write a Java program to reverse an array of integer values.
  Задача 11. Напишите Java-программу для обращения к массиву целочисленных значений.*/
package lesson_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task_11 {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter the dimension of the numeric array:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int arraySizeNum = Integer.parseInt(reader.readLine()), i;
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
        for (i = 0; i < arraySizeNum / 2; i++) {
            arrayNum[i] = arrayNum[i] + arrayNum[arraySizeNum - 1 - i] - (arrayNum[arraySizeNum - 1 - i] = arrayNum[i]);
        }
        System.out.println("Array after its reverse: ".concat(Arrays.toString(arrayNum)));
    }
}