/*Task 7. Write a Java program to remove a specific element from an array.
  Задача 7. Напишите Java-программу для удаления определенного элемента из массива.*/
package lesson_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task_7_1 {
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
        System.out.println("Enter the index of the array you want to delete:");
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        int indexNum = Integer.parseInt(reader2.readLine());
        if (indexNum < 0 || indexNum > arrayNum.length - 1) {
            System.out.println("Incorrect value entered! The program has completed its work.");
            System.exit(0);
        }
        System.out.printf("Array after deleting an item with an index \"%d\": ".concat(Arrays.toString(removeCellNum(arrayNum, indexNum))).concat("\n"), indexNum);
        //строковый массив
        System.out.println("Enter the dimension of the string array:");
        BufferedReader reader3 = new BufferedReader(new InputStreamReader(System.in));
        int arraySizeStr = Integer.parseInt(reader3.readLine());
        if (arraySizeStr < 0) {
            System.out.println("Incorrect value entered! The program has completed its work.");
            System.exit(0);
        }
        String[] arrayStr = new String[arraySizeStr];
        System.out.printf("Enter %d characters/lines:\n", arraySizeStr);
        BufferedReader reader4 = new BufferedReader(new InputStreamReader(System.in));
        for (i = 0; i < arrayStr.length; i++) {
            arrayStr[i] = reader4.readLine();
        }
        System.out.println("The resulting array of characters/strings: ".concat(Arrays.toString(arrayStr)));
        System.out.println("Enter the index of the array you want to delete:");
        BufferedReader reader5 = new BufferedReader(new InputStreamReader(System.in));
        int indexStr = Integer.parseInt(reader5.readLine());
        if (indexStr < 0 || indexStr > arrayNum.length - 1) {
            System.out.println("Incorrect value entered! The program has completed its work.");
            System.exit(0);
        }
        reader.close();
        reader1.close();
        reader2.close();
        reader4.close();
        reader5.close();
        System.out.printf("Array after deleting an item with an index \"%d\": ".concat(Arrays.toString(removeCellStr(arrayStr, indexStr))).concat("\n"), indexStr);
    }

    public static double[] removeCellNum(double[] arrayNum, int indexNum) {
        double[] copyNum = new double[arrayNum.length - 1];
        System.arraycopy(arrayNum, 0, copyNum, 0, indexNum);
        System.arraycopy(arrayNum, indexNum + 1, copyNum, indexNum, arrayNum.length - indexNum - 1);
        return copyNum;
    }

    public static String[] removeCellStr(String[] arrayStr, int indexStr) {
        String[] copyStr = new String[arrayStr.length - 1];
        System.arraycopy(arrayStr, 0, copyStr, 0, indexStr);
        System.arraycopy(arrayStr, indexStr + 1, copyStr, indexStr, arrayStr.length - indexStr - 1);
        return copyStr;
    }
}
