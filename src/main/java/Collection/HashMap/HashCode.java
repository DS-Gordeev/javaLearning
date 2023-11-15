package Collection.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCode {
    public static void main(String[] args) {
        Map<Student, Double> students = new HashMap<>();
        Student st1 = new Student("Dmitriy", "Gordeev", 4);
        Student st2 = new Student("Andrey", "Kyralesov", 3);
        Student st3 = new Student("Roman", "Nechin", 5);
        students.put(st1, 8.9);
        students.put(st2, 6.7);
        students.put(st3, 7.1);
        System.out.println(students);

        Student st4 = new Student("Dmitriy", "Gordeev", 4);
        boolean check = students.containsKey(st4);

        // Без переопределения метода hashCode будет возвращать false, т.к. сперва проверяется
        // на hashCode, а потом на equals. Коллекции hashMap и hashSet используют хэширование при поиске и сравнении
        // Для стандартных классов String, Integer и т.д. методы уже реализованы корректно в Object.
        System.out.println(check);
        // Возвращает true так как переопределен метод equals
        System.out.println(st1.equals(st4));




    }
    public static class Student {
        String name;
        String surname;
        int course;

        public Student(String name, String surname, int course) {
            this.name = name;
            this.surname = surname;
            this.course = course;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", course=" + course +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            return this.course == student.course &&
                    Objects.equals(this.name, student.name) &&
                    Objects.equals(this.surname, student.surname);
        }

        // Возвращает "уникальный" int, но он может быть одинаков для одинаковых объектов по equals - это коллизия.
        // Может возникнуть потому что кол-во разных объектав безгранично, а кол-во значений int ограничено

        /* ПРАВИЛА:
        1. Если переопредилил equals, то переопредели и hashCode
        2. Результат нескольких выполнений hashCode для одного объекта должен быть одинаковый
        3. Если согласно equals два объекта равны, то и hashCode у них должен быть одинаковый
        4. Если согласно equals два объекта НЕ равны, то hashCode у них НЕ обязательно должен быть разным
         */
        @Override
        public int hashCode() {
            return Objects.hash(name, surname, course);
        }
    }
}
