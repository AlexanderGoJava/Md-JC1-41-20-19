/*Task 14. Write a Java program to find the common elements between two arrays (string values).
  Задача 14. Напишите программу на Java, чтобы найти общие элементы между двумя массивами (строковые значения).*/
package lesson_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task_14 {
    public static void main(String[] args) throws IOException {
        //Первый массив строк
        System.out.println("Enter the dimension of the first string array:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int arraySizeStrFst = Integer.parseInt(reader.readLine()), i, j;
        if (arraySizeStrFst < 1) {
            System.out.println("Incorrect value entered! The program has completed its work.");
            System.exit(0);
        }
        String[] arrayStrFst = new String[arraySizeStrFst];
        System.out.printf("Enter %d numbers:\n", arraySizeStrFst);
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        for (i = 0; i < arrayStrFst.length; i++) {
            arrayStrFst[i] = reader1.readLine();
        }
        System.out.println("The resulting first array of strings: ".concat(Arrays.toString(arrayStrFst)));
        //Второй массив строк
        System.out.println("Enter the dimension of the second string array:");
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        int arraySizeStrScd = Integer.parseInt(reader2.readLine());
        if (arraySizeStrScd < 1) {
            System.out.println("Incorrect value entered! The program has completed its work.");
            System.exit(0);
        }
        String[] arrayStrScd = new String[arraySizeStrScd];
        System.out.printf("Enter %d numbers:\n", arraySizeStrScd);
        BufferedReader reader3 = new BufferedReader(new InputStreamReader(System.in));
        for (i = 0; i < arrayStrScd.length; i++) {
            arrayStrScd[i] = reader3.readLine();
        }
        reader.close();
        reader1.close();
        reader2.close();
        reader3.close();
        System.out.println("The resulting second array of strings: ".concat(Arrays.toString(arrayStrScd)));
        for (i = 0; i < arrayStrFst.length; i++) {
            for (j = i; j < arrayStrScd.length; j++) {
                if (arrayStrFst[i].equals(arrayStrScd[j])) {
                    System.out.printf("The value of the element of the first array ‘%s‘ at the index \"%d\" coincides with the value of the second array ‘%s‘ at the index \"%d\"\n", arrayStrFst[i], i, arrayStrScd[j], j);
                }
            }
        }
    }
}
