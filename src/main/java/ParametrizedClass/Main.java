package ParametrizedClass;

public class Main {
    public static void main(String[] args) {
        ParamClass<String> iAmString = new ParamClass<>("Это строка");
        System.out.println(iAmString);

        ParamClass<Integer> iAmInteger = new ParamClass<>(737);
        System.out.println(iAmInteger);

    }
}
