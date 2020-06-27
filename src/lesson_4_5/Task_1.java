/*1.Создать класс Car с 3 полями различных типов, 2 конструкторами, один из которых с параметрами.
  В классе создать 2 метода, статический и не статический. Один из методов решает по весу машины ее тип:
  легковой, джип, грузовой (через свитч). Второй метод генерирует рандомную машину.
  2.Доработать последнее задание про машины следующим образом: создать иерархию наследования на 3 уровня
  с абстрактным классом и 2-мя абстрактными методами, переопределить методы equals hashCode, toString,  
  перегрузить и переопределить 2 метода в классах и конструкторах, продемонстрировать работу с массивами
  объектов из иерархии классов (сортировать по критериям, суммарный подсчет параметров и т.д.) + добавить
  имплементацию 2 своих интерфейсов.*/
package lesson_4_5;

import lesson_4_5.domain.Car;
import lesson_4_5.domain.TechPassport;
import lesson_4_5.util.CarUtil;
import lesson_4_5.util.TechPaspUtil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task_1 {
    public static void main(String[] args) throws IOException {
        System.out.print("Enter array dimension: "); //Для удобства чтения лучше вводить не более 5 элементоа
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(reader.readLine());
        System.out.println("Array of cars (without sorting):\n".concat(Arrays.toString(generateCarArray(i))));
        Car[] cars = new Car[i];
        carArraySort(cars);
//1st variant generation of the car
//        Car car1 = CarUtil.generateCar();
//        car1.printTechChar();
//        car1.measStopDist();
//2nd variant generation of the car
//        Car car2 = CarUtil.generate();
//        car2.printTechChar();
//        car2.measStopDist();
    }

    public static Car[] generateCarArray(int i) throws IOException {
        Car[] cars = new Car[i];
        for (i = 0; i < cars.length; i++) {
            Car car2 = CarUtil.generate();
            TechPassport techPassport = TechPaspUtil.generateTechPass();
            System.out.println(techPassport);
            car2.printTechChar();
            car2.measStopDist();
            cars[i] = car2;
        }
        return cars;
    }

    public static void carArraySort(Car[] cars) {
        double[] fuel = new double[cars.length];
        for (int i = 0; i < cars.length; i++) {
            fuel[i] = CarUtil.generateFuel(); //some troubles at this line (we are getting null-array)
        }
        for (int i = 1; i < fuel.length; i++) {
            for (int j = i - 1; j >= i; j--) {
                if (fuel[j - 1] < fuel[j]) {
                    double k = fuel[j];
                    fuel[j] = fuel[j - 1];
                    fuel[j - 1] = k;
                }
            }
        }
        System.out.println("Array of fuel volume sorted by increase:\n".concat(Arrays.toString(cars)));
    }
}