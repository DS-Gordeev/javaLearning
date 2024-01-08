package Supplier;

import java.util.ArrayList;
import java.util.function.Supplier;

public class Car {

    String brand;
    String model;
    String color;

    public Car(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    // интерфейс Supplier поставляет данный, реализуем метод get() который возвращает объект
    public static ArrayList<Car> createThreeCars(Supplier<Car> supplier) {
        ArrayList<Car> myCars = new ArrayList<>();
        for(int i=0; i<3; i++) {
            myCars.add(supplier.get());
        }
        return myCars;
    }
}
