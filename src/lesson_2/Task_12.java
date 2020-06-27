/*Task 12. Write a Java program to find the duplicate values of an array of integer values.
  Задача 12. Напишите программу на Java, чтобы найти повторяющиеся значения в массиве целочисленных значений.*/
package lesson_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task_12 {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter the dimension of the numeric array:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int arraySizeNum = Integer.parseInt(reader.readLine()), i, j, k;
        if (arraySizeNum < 1) {
            System.out.println("Incorrect value entered! The program has completed its work.");
            System.exit(0);
        }
        int[] arrayNum = new int[arraySizeNum];
        System.out.printf("Enter %d numbers:\n", arraySizeNum);
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        for (i = 0; i < arrayNum.length; i++) {
            arrayNum[i] = Integer.parseInt(reader1.readLine());
        }
        reader.close();
        reader1.close();
        System.out.println("The resulting array of numbers: ".concat(Arrays.toString(arrayNum)));
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
        System.out.println("Array of integers sorted in ascending order:\n".concat(Arrays.toString(arrayNum)));
        for (i = 0; i < arrayNum.length - 1; i++) {
            if (arrayNum[i] == arrayNum[i + 1]) {
                System.out.printf("The value of the array element ‘%d‘ at the index \"%d\" coincides with the value of the array ‘%d‘ at the index \"%d\"\n", arrayNum[i], i, arrayNum[i + 1], i + 1);
            }
        }
    }
}
