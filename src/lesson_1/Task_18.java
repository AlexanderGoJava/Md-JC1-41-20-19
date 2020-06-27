//Напишите метод переводящий рубли в доллары по заданному курсу. В качестве аргументов укажите кол-во рублей и курс.
package lesson_1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Task_18 {
    public static void main(String[] args) {
        System.out.println("Enter the current amount of money in your account, rub.:");
        Scanner sc = new Scanner(System.in);
        double money = sc.nextDouble();
        System.out.println("Enter currency rate value, $:");
        double course = sc.nextDouble();
        sc.close();
        System.out.println("The amount of your money in terms of currency is, $: " + convertMoney(money, course));
    }

    //method converting rubles into dollars
    public static double convertMoney(double money, double course) {
        return new BigDecimal(money / course).setScale(3, RoundingMode.HALF_UP).doubleValue();
    }
}
