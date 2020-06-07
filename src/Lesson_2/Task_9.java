/*Task 9. Write a Java program to insert an element (specific position) into an array.
  Задача 9. Напишите Java-программу для вставки элемента (определенной позиции) в массив.*/
package Lesson_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task_9 {
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
        System.out.println("Введите индекс массива, в который вы хотите произвести вставку элемента:");
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        int indexNum = Integer.parseInt(reader2.readLine());
        if (indexNum < 0 || indexNum > arrayNum.length) {
            System.out.println("Введено неверное значение! Программа завершила свою работу.");
            System.exit(0);
        }
        System.out.println("Введите численное значение, которое необходимо вставить в массив:");
        BufferedReader reader3 = new BufferedReader(new InputStreamReader(System.in));
        double specValue = Double.parseDouble(reader3.readLine());
        System.out.println("Новый массив: ".concat(Arrays.toString(newArrayOfNum(arrayNum, indexNum, specValue))));
        //строковый массив
        System.out.println("Введите размерность строкового массива:");
        BufferedReader reader4 = new BufferedReader(new InputStreamReader(System.in));
        int arraySizeStr = Integer.parseInt(reader4.readLine());
        if (arraySizeStr < 0) {
            System.out.println("Введено неверное значение! Программа завершила свою работу.");
            System.exit(0);
        }
        String[] arrayStr = new String[arraySizeStr];
        System.out.printf("Введите %d символов/строк:\n", arraySizeStr);
        BufferedReader reader5 = new BufferedReader(new InputStreamReader(System.in));
        for (i = 0; i < arrayStr.length; i++) {
            arrayStr[i] = reader5.readLine();
        }
        System.out.println("Полученный массив символов/строк: ".concat(Arrays.toString(arrayStr)));
        System.out.println("Введите индекс массива, в который вы хотите произвести вставку элемента:");
        BufferedReader reader6 = new BufferedReader(new InputStreamReader(System.in));
        int indexStr = Integer.parseInt(reader6.readLine());
        if (indexStr < 0 || indexStr > arrayStr.length) {
            System.out.println("Введено неверное значение! Программа завершила свою работу.");
            System.exit(0);
        }
        System.out.println("Введите символьное/строковое значение, которое необходимо вставить в массив:");
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
        System.out.println("Новый массив: ".concat(Arrays.toString(newArrayOfStr(arrayStr, indexStr, specStr))));
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
