package Stream.Sorted;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted {
    public static void main(String[] args) {
        StudentsToSort st1 = new StudentsToSort("Ivan", 'm', 23, 3, 8.6);
        StudentsToSort st2 = new StudentsToSort("Artem", 'm', 27, 4, 7.3);
        StudentsToSort st3 = new StudentsToSort("Olga", 'f', 19, 1, 9.3);
        StudentsToSort st4 = new StudentsToSort("David", 'm', 31, 4, 8.6);
        StudentsToSort st5 = new StudentsToSort("Sasha", 'f', 33, 5, 8.2);

        List<StudentsToSort> studentsList = new ArrayList<>();
        studentsList.add(st1);
        studentsList.add(st2);
        studentsList.add(st3);
        studentsList.add(st4);
        studentsList.add(st5);


        // sorted() возвращает отсортированную коллекцию, но если JAVA не знает как сортировать, то нужно передать
        // Comparable в sorted()
        studentsList = studentsList.stream().sorted(Comparator.comparing(StudentsToSort::getAge).reversed()).collect(Collectors.toList());
        System.out.println(studentsList);

        // Для сортировки в обратном порядке передаем компоратор
        List<Integer> myIntList = List.of(1,3,6,-2,76,-44,0,33);
        myIntList = myIntList.stream().sorted((a, b) -> b.compareTo(a)).collect(Collectors.toList());
        System.out.println(myIntList);

    }
}
