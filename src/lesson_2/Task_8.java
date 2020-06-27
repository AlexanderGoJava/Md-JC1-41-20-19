/*Task 8. Write a Java program to copy an array by iterating the array.
  Задача 8. Напишите Java-программу для копирования массива путем его итерации.*/
package lesson_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task_8 {
    public static void main(String[] args) throws IOException {
        //численный массив
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
        System.out.println("The resulting array of numbers: ".concat(Arrays.toString(arrayNum)));
        System.out.println("Copied array of numbers: ".concat(Arrays.toString(arrayCopyNum(arrayNum))));
        //строковый массив
        System.out.println("Enter the dimension of the string array:");
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        int arraySizeStr = Integer.parseInt(reader2.readLine());
        if (arraySizeStr < 0) {
            System.out.println("Incorrect value entered! The program has completed its work.");
            System.exit(0);
        }
        String[] arrayStr = new String[arraySizeStr];
        System.out.printf("Enter %d characters/lines:\n", arraySizeStr);
        BufferedReader reader3 = new BufferedReader(new InputStreamReader(System.in));
        for (i = 0; i < arrayStr.length; i++) {
            arrayStr[i] = reader3.readLine();
        }
        reader.close();
        reader1.close();
        reader2.close();
        reader3.close();
        System.out.println("The resulting array of characters/strings: ".concat(Arrays.toString(arrayStr)));
        System.out.println("The copied array of characters/strings: ".concat(Arrays.toString(arrayCopyStr(arrayStr))));
    }

    public static double[] arrayCopyNum(double[] arrayNum) {
        double[] arrCopyNum = new double[arrayNum.length];
        System.arraycopy(arrayNum, 0, arrCopyNum, 0, arrCopyNum.length);
        return arrCopyNum;
    }

    public static String[] arrayCopyStr(String[] arrayStr) {
        String[] arrCopyStr = new String[arrayStr.length];
        System.arraycopy(arrayStr, 0, arrCopyStr, 0, arrCopyStr.length);
        return arrCopyStr;
    }

}
