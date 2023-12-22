package Lambdas;

public class Student {
    String Name;
    char sex;
    int age;
    int course;
    double avgGrade;


    public Student(String name, char sex, int age, int course, double avgGrade) {
        Name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Students{" +
                "Name='" + Name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }
}
