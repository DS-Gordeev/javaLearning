package Collection.TreeMap;

import java.util.Objects;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        /* TreeMap - элементы хранятся в отсортированном по возрастанию по КЛЮЧАМ порядке. В основе лежит красно-черно
        дерево. Сложность поиска O(logN) - по сути это бинарный поиск. Как и для любой MAP - ключи уникальны! */

        TreeMap<Double, Main.Student> students = new TreeMap<>();
        Main.Student st1 = new Main.Student("Dmitriy", "Gordeev", 4);
        Main.Student st2 = new Main.Student("Andrey", "Kyralesov", 3);
        Main.Student st3 = new Main.Student("Roman", "Nechin", 5);
        Main.Student st4 = new Main.Student("Vikotr", "Abramov", 4);
        Main.Student st5 = new Main.Student("Nikolay", "Fedorov", 3);
        Main.Student st6 = new Main.Student("Ivan", "Krasnov", 5);

        students.put(4.9, st1);
        students.put(8.7, st2);
        students.put(5.1, st3);
        students.put(9.9, st4);
        students.put(4.0, st5);
        students.put(6.7, st6);

        // По-умолчанию выводит TreeMap по возрастанию по КЛЮЧАМ
        System.out.println(students);

        System.out.println("\n// МЕТОДЫ TreeMap.............\n");

        // .get() - выводит значение по ключу
        System.out.println(students.get(9.9));

        // .remove() - удаляет значение по ключу
        System.out.println(students.remove(5.1));

        // .descendingMap() - выводит значение по ключам в обратном порядке (от большего к меньшему)
        System.out.println(students.descendingMap());

        // .tailMap() - выводит значения включительно начиная больше чем указанный ключ (хвост)
        System.out.println(students.tailMap(6.7));







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
            Main.Student student = (Main.Student) o;
            return this.course == student.course &&
                    Objects.equals(this.name, student.name) &&
                    Objects.equals(this.surname, student.surname);
        }

        // Возвращает "уникальный" int, но он может быть одинаков для одинаковых объектов по equals - это коллизия.
        // Может возникнуть потому что кол-во разных объектав безгранично, а кол-во значений int ограничено

        /* ПРАВиЛА:
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
