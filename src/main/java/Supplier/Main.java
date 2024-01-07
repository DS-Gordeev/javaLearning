package Supplier;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> x = Car.createThreeCars(() -> new Car("Skoda", "Kodiaq", "Green"));
        System.out.println(x);
    }
}
