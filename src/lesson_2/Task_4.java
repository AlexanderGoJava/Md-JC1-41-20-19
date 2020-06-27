/* Task 4.  Write a Java program to calculate the average value of array elements.
   Задача 4. Напишите Java-программу для расчета среднего значения элементов массива.*/
package lesson_2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimension of the array:");
        int a = sc.nextInt(), i;
        if (a <= 0) {
            System.out.println("Incorrect value entered! The program has completed its work.");
            System.exit(0);
        }
        double result, sum = 0;
        double[] array = new double[a];
        System.out.printf("Enter %d numbers:\n", a);
        Scanner sc1 = new Scanner(System.in);
        for (i = 0; i < array.length; i++) {
            array[i] = sc1.nextDouble();
        }
        sc.close();
        sc1.close();
        System.out.println("Array of numbers: ".concat(Arrays.toString(array)));
        for (i = 0; i < array.length; i++) {
            sum += array[i];
        }
        result = new BigDecimal(sum / array.length).setScale(3, RoundingMode.HALF_UP).doubleValue();
        System.out.println("Arithmetic mean of all elements of the array: " + result);

    }
}
