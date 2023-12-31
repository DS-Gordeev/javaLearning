package ComparableAndGenerics.Comparator;

import java.util.Comparator;

// Создаем новый класс-компаратор и имлементимся от Comparator с указанием того, что будем сравнивать
public class PersonComparator implements Comparator<Person> {

    /* Реализуем метод compare. Он возвращает int: -1, 0, 1 (меньше, больше, равно)
    Метод compare принимает два сравниваемых объекта */
    @Override
    public int compare(Person person1, Person person2) {

        /* if(person1.id > person2.id) return 1;
        else if(person1.id < person2.id) return -1;
        else return 0; */

        // В Comparator сортируем по age

        return person1.age.compareTo(person2.age);

    }
}
