/*Task 8. Write a Java program to copy an array by iterating the array.
  Задача 8. Напишите Java-программу для копирования массива путем его итерации.*/
package Lesson_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task_8 {
    public static void main(String[] args) throws IOException {
        //численный массив
        System.out.println("Введите размерность численного массива:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int arraySizeNum = Integer.parseInt(reader.readLine()), i;
        if (arraySizeNum < 0) {
            System.out.println("Введено неверное значение! Программа завершила свою работу.");
            System.exit(0);
        }
        double[] arrayNum = new double[arraySizeNum];
        System.out.printf("Введите %d чисел:\n", arraySizeNum);
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        for (i = 0; i < arrayNum.length; i++) {
            arrayNum[i] = Double.parseDouble(reader1.readLine());
        }
        System.out.println("Полученный массив чисел: ".concat(Arrays.toString(arrayNum)));
        System.out.println("Скопированный массив чисел: ".concat(Arrays.toString(arrayCopyNum(arrayNum))));
        //строковый массив
        System.out.println("Введите размерность строкового массива:");
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        int arraySizeStr = Integer.parseInt(reader2.readLine());
        if (arraySizeStr < 0) {
            System.out.println("Введено неверное значение! Программа завершила свою работу.");
            System.exit(0);
        }
        String[] arrayStr = new String[arraySizeStr];
        System.out.printf("Введите %d символов/строк:\n", arraySizeStr);
        BufferedReader reader3 = new BufferedReader(new InputStreamReader(System.in));
        for (i = 0; i < arrayStr.length; i++) {
            arrayStr[i] = reader3.readLine();
        }
        reader.close();
        reader1.close();
        reader2.close();
        reader3.close();
        System.out.println("Полученный массив символов/строк: ".concat(Arrays.toString(arrayStr)));
        System.out.println("Скопированный массив символов/строк: ".concat(Arrays.toString(arrayCopyStr(arrayStr))));
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
