package Comparable;
// Интерфейс Comparable в котором содержится только один метод compareTo который нужно реализовать
public class Person implements Comparable<Person> {
    private final Integer id;
    private final String name;
    private final String surname;
    private final Integer age;

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

    // Переопределяем метод compareTo. Он возвращает int: -1, 0, 1 (меньше, больше, равно)
    @Override
    public int compareTo(Person otherPerson) {
        // Сортируем по возрастанию по id, если id равны, то сортируем по age
        int result = this.id.compareTo(otherPerson.id);

        if(result == 0) {
            result = this.age.compareTo(otherPerson.age);
        }

        return result;

//        if(this.id > otherPerson.id) return 1;
//        else if(this.id < otherPerson.id) return -1;
//        else return 0;

    }
}
