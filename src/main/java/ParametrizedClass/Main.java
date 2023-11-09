package ParametrizedClass;

public class Main {
    public static void main(String[] args) {
        ParamClass<String> iAmString = new ParamClass<>("Это строка");
        System.out.println(iAmString);

        ParamClass<Integer> iAmInteger = new ParamClass<>(737);
        System.out.println(iAmInteger);

        // Т.к. public class ParamClassSubtype<T extends Number>, то тип данных может быть только потомки Number
        ParamClassSubtype<Double> iAmAnyNumber = new ParamClassSubtype<>(3.14);
        System.out.println(iAmAnyNumber);


    }
}
