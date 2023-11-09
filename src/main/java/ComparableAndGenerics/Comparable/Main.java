package ComparableAndGenerics.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Сортируем список при помощи метода .sort класса Collections
        List<String> namesList = new ArrayList<>();

        namesList.add("Dmitriy");
        namesList.add("Roman");
        namesList.add("Andrey");
        // До сортировки --> [Dmitriy, Roman, Andrey]
        System.out.println(namesList);

        Collections.sort(namesList);
        // После сортировки --> [Andrey, Dmitriy, Roman]
        System.out.println(namesList);

        // Создадим список объектов типа Person
        List<Person> personsList = new ArrayList<>();
        personsList.add(new Person(12, "Dmitriy", "Gordeev", 36));
        personsList.add(new Person(76, "Roman", "Nechin", 37));
        personsList.add(new Person(3, "Andrey", "Kyralesov", 40));

        System.out.println(personsList);

        // Объекты отсортированы по ID
        Collections.sort(personsList);
        System.out.println(personsList);


    }
}
