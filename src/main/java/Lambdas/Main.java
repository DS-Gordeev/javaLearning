package Lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 23, 3, 8.6);
        Student st2 = new Student("Artem", 'm', 27, 4, 7.3);
        Student st3 = new Student("Olga", 'f', 19, 1, 9.3);
        Student st4 = new Student("David", 'm', 31, 4, 8.6);
        Student st5 = new Student("Sasha", 'f', 33, 5, 8.2);

        ArrayList<Student> studentsList = new ArrayList<>();
        studentsList.add(st1);
        studentsList.add(st2);
        studentsList.add(st3);
        studentsList.add(st4);
        studentsList.add(st5);

        StudentInfo myStudentInfo = new StudentInfo();

        // В этом случае 2-м параметром передаем lambda выражение (логика в самом выражении)
        myStudentInfo.testStudents(studentsList, s -> s.age > 30);

        // В этом случае 2-м параметром передаем класс Test() который имплементирует интерфейс checkStudents
        // логика в классе, т.к. оверрайдит метод интерфейса check(). Так обычно не делают!
        myStudentInfo.testStudents(studentsList, new Test());

        // А это то же самое, что и 1-й пример, но с анонимным классам, который можно заменить lambda выражением
        myStudentInfo.testStudents(studentsList, new checkStudents() {
            @Override
            public boolean check(Student s) {
                return false;
            }
        });

        // Сортируем класс Student переопределив метод compare функционального интерфейса Comparator
        Collections.sort(studentsList, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Integer.compare(s1.course, s2.course);
            }
        });

        // Делаем то же самое при помощи lambda выражения
        Collections.sort(studentsList, (stud1, stud2) -> stud1.course - stud2.course);
        System.out.println(studentsList);

    }
}
