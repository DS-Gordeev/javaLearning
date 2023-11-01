package Comparator;
// В классе Person не импементируем никакой интерфейс
public class Person {
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

}
