package Webinar_OOP_Abstract_Car;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class MainCar {
    public static void main(String[] args) {
        Car car = new Car("Auto", 2,
                true, 12.2f);
        Car car2 = new Car("Brr", 2,
                true, 12.2f);
        TreeSet<Car> cars = new TreeSet<Car>(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.brand.compareTo(o2.brand);
            }
        });
        cars.add(car);
        cars.add(car2);
        System.out.println(cars);
    }
}

