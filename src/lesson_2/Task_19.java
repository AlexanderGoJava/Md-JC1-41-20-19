/*Task 19. Write a Java program to add two matrices of the same size.
  Задача 19. Напишите программу на Java, чтобы сложить две матрицы одинакового размера.*/
package lesson_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_19 {
    public static void main(String[] args) throws IOException {
        //Задание параметров двумерного массива чисел
        System.out.println("Введите размерность двумерного численного массива (количество строк):");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int arrSizeNumStr = Integer.parseInt(reader.readLine());
        if (arrSizeNumStr < 1) {
            System.out.println("Введено неверное значение! Программа завершила свою работу.");
            System.exit(0);
        }
        System.out.println("Введите размерность двумерного численного массива (количество столбцов):");
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        int arrSizeNumClm = Integer.parseInt(reader1.readLine());
        if (arrSizeNumClm < 1) {
            System.out.println("Введено неверное значение! Программа завершила свою работу.");
            System.exit(0);
        }
        //Задание двух двумерных массивов чисел
        double[][] matrixFst = new double[arrSizeNumStr][arrSizeNumClm];
        double[][] matrixScd = new double[arrSizeNumStr][arrSizeNumClm];
        //Заполнение двумерного массива
        System.out.printf("Введите %d чисел первого массива:\n", arrSizeNumStr * arrSizeNumClm);
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < matrixFst.length; i++) {
            for (int j = 0; j < matrixFst[i].length; j++) {
                matrixFst[i][j] = Double.parseDouble(reader2.readLine());
            }
        }
        System.out.println("Элементы первого массива:");
        for (double[] doubles : matrixFst) {
            for (double aDouble : doubles) {
                System.out.print(aDouble + " | ");
            }
        }
        System.out.printf("\nВведите %d чисел второго массива:\n", arrSizeNumStr * arrSizeNumClm);
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
        System.out.println("Элементы второго массива:");
        for (double[] doubles : matrixScd) {
            for (double aDouble : doubles) {
                System.out.print(aDouble + " | ");
            }
        }
        //Суммирование двух двумерных массивов
        for (int i = 0; i < matrixFst.length; i++) {
            for (int j = 0; j < matrixFst[i].length; j++) {
                matrixFst[i][j] += matrixScd[i][j];
            }
        }
        System.out.println("\nРезультат суммирования элементов двумерного массива:");
        for (double[] doubles : matrixFst) {
            for (double aDouble : doubles) {
                System.out.print(aDouble + " | ");
            }
        }
    }
}