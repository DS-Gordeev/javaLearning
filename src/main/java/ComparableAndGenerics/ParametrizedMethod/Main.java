package ComparableAndGenerics.ParametrizedMethod;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> listOfInt = new ArrayList<>();
        listOfInt.add(12);
        listOfInt.add(29);
        listOfInt.add(44);

        // Метод getSecondElement принимает список интов
        int a = Main.getSecondElement(listOfInt);
        System.out.println(a);

        ArrayList<String> listOfStr = new ArrayList<>();
        listOfStr.add("abc");
        listOfStr.add("zxc");
        listOfStr.add("awd");

        // Метод getSecondElement принимает список строк
        String b = Main.getSecondElement(listOfStr);
        System.out.println(b);

    }
    // Метод может принимать любые типы данных в ArrayList т.к. используем генерики
    public static <T> T getSecondElement(ArrayList<T> listOfValues) {
        return listOfValues.get(1);
    }
}
