/*Task 5.  Write a Java program to test if an array contains a specific value.
 * Задача 5. Напишите программу на Java, чтобы проверить, содержит ли массив определенное значение.*/
package lesson_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task_5 {
    public static void main(String[] args) throws IOException {
        // Массив чисел
        System.out.println("Enter the dimension of the numeric array:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int arraySizeNum = Integer.parseInt(reader.readLine()), counter = 0, i;
        if (arraySizeNum < 0) {
            System.out.println("Incorrect value entered! The program has completed its work.");
            System.exit(0);
        }
        double specValue;
        double[] arrayNum = new double[arraySizeNum];
        System.out.printf("Enter %d numbers:\n", arraySizeNum);
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        for (i = 0; i < arrayNum.length; i++) {
            arrayNum[i] = Double.parseDouble(reader1.readLine());
        }
        System.out.println("The resulting array of numbers: ".concat(Arrays.toString(arrayNum)));
        System.out.println("Enter a specific numerical value:");
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        specValue = Double.parseDouble(reader2.readLine());
        for (i = 0; i < arrayNum.length; i++) {
            if (specValue == arrayNum[i]) {
                counter++;
                System.out.printf("The value you entered \"%.2f\" matches one of the values in the array!\nThe position of this value in the array: " + i + "\n", specValue);
            }
        }
        if (counter == 0) {
            System.out.println("No matches found!");
        }
        // Массив строк
        System.out.println("Enter the dimension of the string array:");
        BufferedReader reader3 = new BufferedReader(new InputStreamReader(System.in));
        int arraySizeStr = Integer.parseInt(reader3.readLine()), counter1 = 0;
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
        System.out.println("Enter a specific character/string value:");
        BufferedReader reader5 = new BufferedReader(new InputStreamReader(System.in));
        String s = reader5.readLine();
        reader.close();
        reader1.close();
        reader2.close();
        reader3.close();
        reader4.close();
        reader5.close();
        for (i = 0; i < arrayStr.length; i++) {
            if (s.equals(arrayStr[i])) {
                counter1++;
                System.out.printf("The value you entered  \"%s\" matches one of the values in the array!\nThe position of this value in the array: " + i + "\n", s);
            }
        }
        if (counter1 == 0) {
            System.out.println("No matches found!");
        }
    }
}