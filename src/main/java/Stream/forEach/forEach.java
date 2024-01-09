package Stream.forEach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class forEach {
    public static void main(String[] args) {
        int[] array = {9,4,1,0,6};

        // forEach возвращает void, то есть ничего, он только применяет какое-то действие к элементам
        // после него нельзя собрать коллекцию!
        Arrays.stream(array).forEach(el -> {el=el*10;
            System.out.println(el);});

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> doubledNumbers = numbers.stream()
                .map(num -> num * 2)
                .collect(Collectors.toList());
        System.out.println(doubledNumbers);

        // forEach можно использовать для вывода на экран или для применения стороннего метода
        List<Integer> multipliedByThree = new ArrayList<>();
        numbers.stream()
                .forEach(num -> multipliedByThree.add(num * 3));
        System.out.println(multipliedByThree);
    }
}
