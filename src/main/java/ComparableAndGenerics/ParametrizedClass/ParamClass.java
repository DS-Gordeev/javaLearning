package ComparableAndGenerics.ParametrizedClass;

// Параметризированный класс принимает любой тип данных
public class ParamClass <T> {
    private final T value;

    // Конструктор класса
    public ParamClass(T value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return "The value is: " + value;
    }

}

