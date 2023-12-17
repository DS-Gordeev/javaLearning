package NestedClasses.Static;

public class Main {
    public static void main(String[] args) {

        // Обращаемся к Static классу Engine напрямую без создания объекта
        Car.Engine carEngine = new Car.Engine(249);
        System.out.println(carEngine);

        // Передаем созданный объект carEngine в конструктор класса Car
        Car myCar = new Car("red", 5, carEngine);
        System.out.println(myCar);
    }
}
