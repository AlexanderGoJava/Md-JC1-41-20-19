/*Task 19. Write a Java program to add two matrices of the same size.
  Задача 19. Напишите программу на Java, чтобы сложить две матрицы одинакового размера.*/
package lesson_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_19 {
    public static void main(String[] args) throws IOException {
        //Setting parameters of a two-dimensional array of numbers
        System.out.println("Enter the dimension of a two-dimensional numerical array (number of rows):");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int arrSizeNumStr = Integer.parseInt(reader.readLine());
        if (arrSizeNumStr < 1) {
            System.out.println("Incorrect value entered! The program has completed its work.");
            System.exit(0);
        }
        System.out.println("Enter the dimension of a two-dimensional numerical array (number of columns):");
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        int arrSizeNumClm = Integer.parseInt(reader1.readLine());
        if (arrSizeNumClm < 1) {
            System.out.println("Incorrect value entered! The program has completed its work.");
            System.exit(0);
        }
        //Defining two two-dimensional arrays of numbers
        double[][] matrixFst = new double[arrSizeNumStr][arrSizeNumClm];
        double[][] matrixScd = new double[arrSizeNumStr][arrSizeNumClm];
        //Filling a two-dimensional array
        System.out.printf("Enter %d numbers of the first array:\n", arrSizeNumStr * arrSizeNumClm);
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < matrixFst.length; i++) {
            for (int j = 0; j < matrixFst[i].length; j++) {
                matrixFst[i][j] = Double.parseDouble(reader2.readLine());
            }
        }
        System.out.println("Elements of the first array:");
        for (double[] doubles : matrixFst) {
            for (double aDouble : doubles) {
                System.out.print(aDouble + " | ");
            }
        }
        System.out.printf("\nEnter %d numbers of the second array:\n", arrSizeNumStr * arrSizeNumClm);
        BufferedReader reader3 = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < matrixScd.length; i++) {
            for (int j = 0; j < matrixScd[i].length; j++) {
                matrixScd[i][j] = Double.parseDouble(reader3.readLine());
            }
        }
        reader.close();
        reader1.close();
        reader2.close();
        reader3.close();
        System.out.println("Elements of the second array:");
        for (double[] doubles : matrixScd) {
            for (double aDouble : doubles) {
                System.out.print(aDouble + " | ");
            }
        }
        //Summation of two two-dimensional arrays
        for (int i = 0; i < matrixFst.length; i++) {
            for (int j = 0; j < matrixFst[i].length; j++) {
                matrixFst[i][j] += matrixScd[i][j];
            }
        }
        System.out.println("\nThe result of summing the elements of a two-dimensional array:");
        for (double[] doubles : matrixFst) {
            for (double aDouble : doubles) {
                System.out.print(aDouble + " | ");
            }
        }
    }
}