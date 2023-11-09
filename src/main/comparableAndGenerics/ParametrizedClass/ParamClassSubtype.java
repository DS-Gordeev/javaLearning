package ParametrizedClass;

// Класс ParamClassSubtype сможет принимать только тип T extends от Number (Integer, Float, Double и т.д.)
public class ParamClassSubtype<T extends Number> {
    private final T value;

    // Конструктор класса
    public ParamClassSubtype(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "The value is: " + value;
    }

}
