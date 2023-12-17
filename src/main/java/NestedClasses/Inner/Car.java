package NestedClasses.Inner;

public class Car {
    String color;
    int doorCount;
    //По-умолчанию мощьность двигателя будет 0
    Engine engine = this.new Engine(0);


    public Car(String color, int doorCount) {
        this.color = color;
        this.doorCount = doorCount;
    }
    
    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    @Override
    public String toString() {
        return "My car: {" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    // Вложенный inner класс (обычный не static)
    public class Engine {
      private int HorsePower;

        public Engine(int horsePower) {
            this.HorsePower = horsePower;
        }

        @Override
        public String toString() {
            return "My Engine: {" +
                    "HorsePower=" + HorsePower +
                    '}';
        }
    }
}
