/*Task 15. Write a Java program to find the common elements between two arrays of integers.
  Задача 15. Напишите программу на Java, чтобы найти общие элементы между двумя массивами целых чисел.*/
package lesson_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task_15 {
    public static void main(String[] args) throws IOException {
        //Первый массив чисел
        System.out.println("Enter the dimension of the first numerical array:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int arraySizeNumFst = Integer.parseInt(reader.readLine()), i, j;
        if (arraySizeNumFst < 1) {
            System.out.println("Incorrect value entered! The program has completed its work.");
            System.exit(0);
        }
        double[] arrayNumFst = new double[arraySizeNumFst];
        System.out.printf("Enter %d numbers:\n", arraySizeNumFst);
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        for (i = 0; i < arrayNumFst.length; i++) {
            arrayNumFst[i] = Double.parseDouble(reader1.readLine());
        }
        System.out.println("The resulting first array of numbers: ".concat(Arrays.toString(arrayNumFst)));
        //Второй массив чисел
        System.out.println("Enter the dimension of the second numerical array:");
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        int arraySizeNumScd = Integer.parseInt(reader2.readLine());
        if (arraySizeNumScd < 1) {
            System.out.println("Incorrect value entered! The program has completed its work.");
            System.exit(0);
        }
        double[] arrayNumScd = new double[arraySizeNumScd];
        System.out.printf("Enter %d numbers:\n", arraySizeNumScd);
        BufferedReader reader3 = new BufferedReader(new InputStreamReader(System.in));
        for (i = 0; i < arrayNumScd.length; i++) {
            arrayNumScd[i] = Double.parseDouble(reader3.readLine());
        }
        reader.close();
        reader1.close();
        reader2.close();
        reader3.close();
        System.out.println("The resulting second array of numbers: ".concat(Arrays.toString(arrayNumScd)));
        for (i = 0; i < arrayNumFst.length; i++) {
            for (j = i; j < arrayNumScd.length; j++) {
                if (arrayNumFst[i] == arrayNumScd[j]) {
                    System.out.printf("The value of the element of the first array ‘%s‘ at the index \"%d\" coincides with the value of the second array ‘%s‘ at the index \"%d\"\n", arrayNumFst[i], i, arrayNumScd[j], j);
                }
            }
        }
    }
}
