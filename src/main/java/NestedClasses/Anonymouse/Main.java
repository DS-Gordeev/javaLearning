package NestedClasses.Anonymouse;

public class Main {

    public static void main(String[] args) {
        /* Создаем анонимный класс sum, который имплементирует интерфейс Math, переопределяя его метод doOperation
           lambda выражение - это краткая запись анонимных классов: Math suma = (a, b) -> a + b;
         */
        Math suma = new Math() {

            @Override
            public int doOperation(int a, int b) {
                return a + b;
            }
        };

        // Этот анонимный класс кратко записан как lambda выражение
        Math multi = (a, b) -> a * b;

        System.out.println(suma.doOperation(4, 8));
        System.out.println(multi.doOperation(3, 3));
    }


}

interface Math {
    int doOperation(int a, int b);
}
