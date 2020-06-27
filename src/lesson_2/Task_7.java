/*Task 7. Write a Java program to remove a specific element from an array.
  Задача 7. Напишите Java-программу для удаления определенного элемента из массива.*/
package lesson_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task_7 {
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
        System.out.println("Введите численное значение, совпадающее с одним из элементов массива для его удаления из массива:");
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        double specValue = Double.parseDouble(reader2.readLine());
        System.out.println(Arrays.toString(removeCellNum(arrayNum, specValue)));
        //строковый массив
        System.out.println("Введите размерность строкового массива:");
        BufferedReader reader3 = new BufferedReader(new InputStreamReader(System.in));
        int arraySizeStr = Integer.parseInt(reader3.readLine());
        if (arraySizeStr < 0) {
            System.out.println("Введено неверное значение! Программа завершила свою работу.");
            System.exit(0);
        }
        String[] arrayStr = new String[arraySizeStr];
        System.out.printf("Введите %d символов/строк:\n", arraySizeStr);
        BufferedReader reader4 = new BufferedReader(new InputStreamReader(System.in));
        for (i = 0; i < arrayStr.length; i++) {
            arrayStr[i] = reader4.readLine();
        }
        System.out.println("Полученный массив символов/строк: ".concat(Arrays.toString(arrayStr)));
        System.out.println("Введите символьное/строковое значение, совпадающее с одним из элементов массива для его удаления из массива:");
        BufferedReader reader5 = new BufferedReader(new InputStreamReader(System.in));
        String specStr = reader5.readLine();
        reader.close();
        reader1.close();
        reader2.close();
        reader3.close();
        reader4.close();
        reader5.close();
        System.out.println(Arrays.toString(removeCellStr(arrayStr, specStr)));
    }

    public static double[] removeCellNum(double[] arrayNum, double specValue) {
        int counter = 0;
        for (int i = 0; i < arrayNum.length; i++) {
            double[] copyNum = new double[arrayNum.length - 1];
            if (specValue == arrayNum[i]) {
                counter++;
                System.arraycopy(arrayNum, 0, copyNum, 0, i);
                System.arraycopy(arrayNum, i + 1, copyNum, i, arrayNum.length - i - 1);
                System.out.print("Массив после удаления первого совпадающего элемента массива с введённым элементом: ");
                return copyNum;
            }
        }
        if (counter == 0) {
            System.out.print("Совпадающих элементов не найдено. Массив остался без изменений: ");
        }
        return arrayNum;
    }

    public static String[] removeCellStr(String[] arrayStr, String specStr) {
        int counter1 = 0;
        for (int i = 0; i < arrayStr.length; i++) {
            String[] copyStr = new String[arrayStr.length - 1];
            if (specStr.equals(arrayStr[i])) {
                counter1++;
                System.arraycopy(arrayStr, 0, copyStr, 0, i);
                System.arraycopy(arrayStr, i + 1, copyStr, i, arrayStr.length - i - 1);
                System.out.print("Массив после удаления первого совпадающего элемента массива с введённым элементом: ");
                return copyStr;
            }
        }
        if (counter1 == 0) {
            System.out.print("Совпадающих элементов не найдено. Массив остался без изменений: ");
        }
        return arrayStr;
    }
}
