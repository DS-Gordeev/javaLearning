package ComparableAndGenerics.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Сортируем список при помощи метода .sort класса Collections в natural order
        List<String> namesList = new ArrayList<>();

        namesList.add("Vikror");
        namesList.add("Iliya");
        namesList.add("Bob");
        // До сортировки --> [Dmitriy, Roman, Andrey]
        System.out.println(namesList);

        Collections.sort(namesList);
        // После сортировки --> [Andrey, Dmitriy, Roman]
        System.out.println(namesList);

        // Создадим список объектов типа Person
        List<Person> personsList = new ArrayList<>();
        personsList.add(new Person(65, "Vikror", "Pelevin", 45));
        personsList.add(new Person(8, "Iliya", "Repin", 66));
        personsList.add(new Person(231, "Bob", "Dillan", 78));

        System.out.println(personsList);

        // Это Comparator
        // Для сравнения передаем в sort список и объекта класса-компаратора по которому будем сортировать. по age
        Collections.sort(personsList, new PersonComparator());

        // Это Comparable
        // Для сравнения передаем в sort только список. Работает только Comparable. по id
        Collections.sort(personsList);
        System.out.println(personsList);


    }
}
