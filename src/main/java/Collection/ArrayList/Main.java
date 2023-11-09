package Collection.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Способы создания ArrayList
        ArrayList<String> listOfString = new ArrayList<>();
        listOfString.add("Dmitriy");
        listOfString.add("Roman");
        System.out.println(listOfString);

        // Задаем размер списка 30 при создании (по умолчанию 10)
        ArrayList<String> listOfString2 = new ArrayList<>(30);
        listOfString2.add("Viktor");
        listOfString2.add("Andrey");
        System.out.println(listOfString2);

        // Создает список на основе другого списка. Это будут разные списки (разные ссылки)
        ArrayList<String> listOfString3 = new ArrayList<>(listOfString);
        System.out.println(listOfString3);

        // Создает неизменяемый список
        List<Integer> immutableList = List.of(1, 2, 3);
        System.out.println(immutableList);

        //____________________________________________________________________________________
        System.out.println("МЕТОДЫ ArrayList:");
        //МЕТОДЫ ArrayList

        // .add - добавляет элемент в список --> boolean. Можно указать индекс в пределех размера списка
        ArrayList<Double> testList = new ArrayList<>();
        testList.add(3.14);
        testList.add(3.15);
        testList.add(3.16);
        testList.add(0, 77.8);
        System.out.println(testList);

        // .get - получаем элемент по индексу
        System.out.println(testList.get(3));

        // .set - изменяем значение элемента по указанному индексу
        testList.set(1, 1.0);
        System.out.println(testList);

        // .remove - удаляет элемент по индексу или по значению
        testList.remove(3.15);
        System.out.println(testList);
        testList.remove(0);
        System.out.println(testList);

        // .addAll - добавляет другой список в конец или начиная с указанного индекса
        ArrayList<Double> testList2 = new ArrayList<>();
        testList.add(23.00);
        testList.add(24.01);
        testList.add(25.02);

        testList.addAll(testList2);
        System.out.println(testList);

        ArrayList<Double> testList3 = new ArrayList<>();
        testList3.add(90.00);
        testList3.add(90.01);
        testList3.add(90.02);

        testList.addAll(0, testList3);
        System.out.println(testList);

        // .clear - очищает список
        testList2.clear();
        System.out.println(testList2);

        // .indexOf - возвращает индекс первого найденного указанного элемента (если их два вернет первый)
        // .lastIndexOf - возвращает индекс последнего найденного указанного элемента
        System.out.println(testList3.indexOf(90.02));

        // .size - возвращает текущий размер списка
        System.out.println(testList.size());

        // .isEmpty - возвращает true если список пуст, иначе false
        System.out.println(testList.isEmpty());
        System.out.println(testList2.isEmpty());

        // .contains - возвращает true если список содержит указанный элемент, иначе false
        System.out.println(testList.contains(3.14));

    }
}
