package Stream.Filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {

    public static void main(String[] args) {
        Car car1 = new Car("Skoda", "Kodiaq", 150, 2.0);
        Car car2 = new Car("Fiat", "Punto", 101, 1.3);
        Car car3 = new Car("Ferrari", "F500", 730, 6.5);
        Car car4 = new Car("ВАЗ", "2105", 108, 1.5);
        Car car5 = new Car("BMW", "X5", 249, 3.0);

        List<Car> myCars = new ArrayList<>();
        myCars.add(car1);
        myCars.add(car2);
        myCars.add(car3);
        myCars.add(car4);
        myCars.add(car5);

        System.out.println(myCars);

        // Метод filter возвращает НОВЫЙ стрим с объектами соответствующими условию
        List<Car> filtredCars = myCars.stream().
                filter(car -> car.getHorsePower() > 140 && car.getEngineCapacity() > 2.5).
                collect(Collectors.toList());

        System.out.println(filtredCars);
    }

}
