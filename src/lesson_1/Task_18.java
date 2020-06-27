//Напишите метод переводящий рубли в доллары по заданному курсу. В качестве аргументов укажите кол-во рублей и курс.
package lesson_1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Task_18 {
    public static void main(String[] args) {
        System.out.println("Введите текущую сумму денежных средств на Вашем счёте, руб.:");
        Scanner sc = new Scanner(System.in);
        double money = sc.nextDouble();
        System.out.println("Введите стоимость курса валюты, $:");
        double course = sc.nextDouble();
        sc.close();
        System.out.println("Сумма Ваших денежных средств в пересчёте на валюту составляет, $: " + convertMoney(money, course));
    }

    public static double convertMoney(double money, double course) {
        return new BigDecimal(money / course).setScale(3, RoundingMode.HALF_UP).doubleValue();
    }
}
