/*Task 9. Write a Java program to insert an element (specific position) into an array.
  Задача 9. Напишите Java-программу для вставки элемента (определенной позиции) в массив.*/
package lesson_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task_9 {
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
        System.out.println("Enter the index of the array into which you want to insert the element:");
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        int indexNum = Integer.parseInt(reader2.readLine());
        if (indexNum < 0 || indexNum > arrayNum.length) {
            System.out.println("Incorrect value entered! The program has completed its work.");
            System.exit(0);
        }
        System.out.println("Enter the numerical value you want to insert into the array:");
        BufferedReader reader3 = new BufferedReader(new InputStreamReader(System.in));
        double specValue = Double.parseDouble(reader3.readLine());
        System.out.println("New array: ".concat(Arrays.toString(newArrayOfNum(arrayNum, indexNum, specValue))));
        //строковый массив
        System.out.println("Enter the dimension of the string array:");
        BufferedReader reader4 = new BufferedReader(new InputStreamReader(System.in));
        int arraySizeStr = Integer.parseInt(reader4.readLine());
        if (arraySizeStr < 0) {
            System.out.println("Incorrect value entered! The program has completed its work.");
            System.exit(0);
        }
        String[] arrayStr = new String[arraySizeStr];
        System.out.printf("Enter %d characters/lines:\n", arraySizeStr);
        BufferedReader reader5 = new BufferedReader(new InputStreamReader(System.in));
        for (i = 0; i < arrayStr.length; i++) {
            arrayStr[i] = reader5.readLine();
        }
        System.out.println("The resulting array of characters/strings: ".concat(Arrays.toString(arrayStr)));
        System.out.println("Enter the index of the array into which you want to insert the element:");
        BufferedReader reader6 = new BufferedReader(new InputStreamReader(System.in));
        int indexStr = Integer.parseInt(reader6.readLine());
        if (indexStr < 0 || indexStr > arrayStr.length) {
            System.out.println("Incorrect value entered! The program has completed its work.");
            System.exit(0);
        }
        System.out.println("Enter the character/string value to be inserted into the array:");
        BufferedReader reader7 = new BufferedReader(new InputStreamReader(System.in));
        String specStr = reader7.readLine();
        reader.close();
        reader1.close();
        reader2.close();
        reader3.close();
        reader4.close();
        reader5.close();
        reader6.close();
        reader7.close();
        System.out.println("New array: ".concat(Arrays.toString(newArrayOfStr(arrayStr, indexStr, specStr))));
    }

    public static double[] newArrayOfNum(double[] arrayNum, int indexNum, double specValue) {
        double[] newArrNum = new double[arrayNum.length + 1];
        System.arraycopy(arrayNum, 0, newArrNum, 0, indexNum);
        newArrNum[indexNum] = specValue;
        System.arraycopy(arrayNum, indexNum, newArrNum, indexNum + 1, newArrNum.length - indexNum - 1);
        return newArrNum;
    }

    public static String[] newArrayOfStr(String[] arrayStr, int indexStr, String specStr) {
        String[] newArrStr = new String[arrayStr.length + 1];
        System.arraycopy(arrayStr, 0, newArrStr, 0, indexStr);
        newArrStr[indexStr] = specStr;
        System.arraycopy(arrayStr, indexStr, newArrStr, indexStr + 1, newArrStr.length - indexStr - 1);
        return newArrStr;
    }
}
