/*Task 20. Write a Java program to convert an array to ArrayList.
  Задача 20. Напишите программу на Java для преобразования массива в ArrayList.*/
package Lesson_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task_20 {
    public static void main(String[] args) throws IOException {
        //Массив чисел
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
        ArrayList<Double>ListOfNums = new ArrayList<>();
        for (double arrIndexNum: arrayNum) {
            ListOfNums.add(arrIndexNum);
        }
        System.out.print("Элементы списка: ");
        printListOfNums(ListOfNums);
        //Массив строк
        System.out.println("\nВведите размерность строкового массива:");
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        int arraySizeStr = Integer.parseInt(reader2.readLine());
        if (arraySizeStr < 0) {
            System.out.println("Введено неверное значение! Программа завершила свою работу.");
            System.exit(0);
        }
        String[] arrayStr = new String[arraySizeStr];
        System.out.printf("Введите %d строк:\n", arraySizeStr);
        BufferedReader reader3 = new BufferedReader(new InputStreamReader(System.in));
        for (i = 0; i < arrayStr.length; i++) {
            arrayStr[i] = reader3.readLine();
        }
        reader.close();
        reader1.close();
        reader2.close();
        reader3.close();
        System.out.println("Полученный массив строк: ".concat(Arrays.toString(arrayStr)));
        ArrayList<String>ListOfStr = new ArrayList<>();
        Collections.addAll(ListOfStr, arrayStr);
        System.out.print("Элементы списка: ");
        printListOfStr(ListOfStr);
    }

    private static void printListOfNums(ArrayList<Double> list) {
        for (Double x : list) {
            System.out.print(x + " | ");
        }
    }

    private static void printListOfStr(ArrayList<String> list) {
        for (String x : list) {
            System.out.print(x + " | ");
        }
    }
}
