package Predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

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

        testStudents(studentsList, s -> s.age > 20);



    }

    public static void testStudents(ArrayList<Student> al, Predicate<Student> pr) {
        for(Student s : al) {
            if(pr.test(s)) {System.out.println(s);}
        }

    }
}
