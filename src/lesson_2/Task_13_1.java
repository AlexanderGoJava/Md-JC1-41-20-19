/*Task 13. Write a Java program to find the duplicate values of an array of string values.
  Задача 13. Напишите программу на Java, чтобы найти повторяющиеся значения в массиве строковых значений.*/
package lesson_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task_13_1 {
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
        //Без сортировки
        for (i = 0; i < arrayStr.length - 1; i++) {
            for (j = i + 1; j < arrayStr.length; j++) {
                if (arrayStr[i].equals(arrayStr[j])) {
                    System.out.printf("The value of the array element  ‘%s‘ at the index \"%d\" coincides with the value of the array ‘%s‘ at the index \"%d\"\n", arrayStr[i], i, arrayStr[j], j);
                }
            }
        }
    }
}
