package Stream.Filter;

public class Car {
    private String brand;
    private String model;
    private Integer horsePower;
    private Double engineCapacity;

    public Car(String brand, String model, Integer horsePower, Double engineCapacity) {
        this.brand = brand;
        this.model = model;
        this.horsePower = horsePower;
        this.engineCapacity = engineCapacity;
    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Integer getHorsePower() {
        return horsePower;
    }

    public Double getEngineCapacity() {
        return engineCapacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", horsePower=" + horsePower +
                ", engineCapacity=" + engineCapacity +
                '}';
    }
}
