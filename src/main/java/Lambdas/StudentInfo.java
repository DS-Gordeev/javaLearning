package Lambdas;

import java.util.ArrayList;

public class StudentInfo {

    void testStudents(ArrayList<Student> al, checkStudents sc) {
        for(Student s : al) {
            if(sc.check(s)) {System.out.println(s);}
        }

    }

}

// Это функциональный интерфейс, т.к. он содержит только одни абстр. метод и Java понимает это соответствие, когда мы
// используем lambda выражение
    interface checkStudents {
        boolean check(Student s);
    }

// Класс который имплементит интерфейс
    class Test implements checkStudents{

        @Override
        public boolean check(Student s) {
            return s.age > 30;
        }
    }



