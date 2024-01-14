package Stream.Sorted;

public class StudentsToSort {

        String Name;
        char sex;
        int age;
        int course;
        double avgGrade;


        public StudentsToSort(String name, char sex, int age, int course, double avgGrade) {
            Name = name;
            this.sex = sex;
            this.age = age;
            this.course = course;
            this.avgGrade = avgGrade;
        }

        @Override
        public String toString() {
            return "StudentsToSort{" +
                    "Name='" + Name + '\'' +
                    ", sex=" + sex +
                    ", age=" + age +
                    ", course=" + course +
                    ", avgGrade=" + avgGrade +
                    '}';
        }

    public String getName() {
        return Name;
    }

    public char getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public int getCourse() {
        return course;
    }

}


