package ComparableAndGenerics.Comparator;

// В классе Person имплементируем Comparable, по нему будем сортировать как natural order
// если потребуется другая сортировка, то тут же будем использовать Comparator
public class Person implements Comparable<Person> {
    final Integer id;
    private final String name;
    private final String surname;
    final Integer age;

    public Person(int id, String name, String surname, int age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person otherPerson) {
        // Сортируем по id

        return this.id.compareTo(otherPerson.id);

    }
}
