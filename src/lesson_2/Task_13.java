/*Task 13. Write a Java program to find the duplicate values of an array of string values.
  Задача 13. Напишите программу на Java, чтобы найти повторяющиеся значения в массиве строковых значений.*/
package lesson_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task_13 {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter the dimension of the string array:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int arraySizeStr = Integer.parseInt(reader.readLine()), i, j;
        if (arraySizeStr < 1) {
            System.out.println("Incorrect value entered! The program has completed its work.");
            System.exit(0);
        }
        String[] arrayStr = new String[arraySizeStr];
        System.out.printf("Enter %d characters/lines:\n", arraySizeStr);
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        for (i = 0; i < arrayStr.length; i++) {
            arrayStr[i] = reader1.readLine();
        }
        reader.close();
        reader1.close();
        System.out.println("The resulting array of characters/strings: ".concat(Arrays.toString(arrayStr)));
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
        System.out.println("Array of characters/strings, sorted ascending:\n".concat(Arrays.toString(arrayStr)));
        for (i = 0; i < arrayStr.length - 1; i++) {
            if (arrayStr[i].equals(arrayStr[i + 1])) {
                System.out.printf("The value of the array element ‘%s‘ at the index \"%d\" coincides with the value of the array ‘%s‘ at the index \"%d\"\n", arrayStr[i], i, arrayStr[i + 1], i + 1);
            }
        }
    }
}
