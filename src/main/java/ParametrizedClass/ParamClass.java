package ParametrizedClass;

public class ParamClass <T> {
    private final T value;

    public ParamClass(T value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return "The value is: " + value;
    }

}
