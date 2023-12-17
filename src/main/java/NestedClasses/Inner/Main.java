package NestedClasses.Inner;

public class Main {
    public static void main(String[] args) {

        // Создаем объект myCar с двигателем по-умолчанию
        Car myCar = new Car("black", 4);
        System.out.println(myCar);

        // Создаем двигатель, т.к. класс Engine не Static, то для создания необходим уже созданный объект myCar
        Car.Engine myEngine = myCar.new Engine(150);
        System.out.println(myEngine);

        // При помощи setter устанавливаем двигатель в объект myCar
        myCar.setEngine(myEngine);
        System.out.println(myCar);




    }
}
