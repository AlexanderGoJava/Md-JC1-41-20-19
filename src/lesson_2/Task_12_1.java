package lesson_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task_12_1 {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter the dimension of the numeric array:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int arraySizeNum = Integer.parseInt(reader.readLine()), i, j;
        if (arraySizeNum < 1) {
            System.out.println("Incorrect value entered! The program has completed its work.");
            System.exit(0);
        }
        int[] arrayNum = new int[arraySizeNum];
        System.out.printf("Enter %d numbers:\n", arraySizeNum);
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        for (i = 0; i < arrayNum.length; i++) {
            arrayNum[i] = Integer.parseInt(reader1.readLine());
        }
        reader.close();
        reader1.close();
        System.out.println("The resulting array of numbers: ".concat(Arrays.toString(arrayNum)));
        //без сортировки
        for (i = 0; i < arrayNum.length - 1; i++) {
            for (j = i + 1; j < arrayNum.length; j++) {
                if (arrayNum[i] == arrayNum[j]) {
                    System.out.printf("The value of the array element ‘%d‘ at the index \"%d\" coincides with the value of the array ‘%d‘ at the index \"%d\"\n", arrayNum[i], i, arrayNum[j], j);
                }
            }
        }
    }
}