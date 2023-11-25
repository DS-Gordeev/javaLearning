package Collection.HashSet;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        // Set - хранит только уникальные значения. В его основе лежит HashMap, где key - это значение Set,
        // а value - константа-заглушка.
        Set<String> nameSet = new HashSet<>();

        nameSet.add("Dmitriy");
        nameSet.add("Roman");
        nameSet.add("Andrey");
        nameSet.add("Viktor");

        System.out.println(nameSet);

        System.out.println("\n// БАЗОВЫЕ МЕТОДЫ HashSet.............\n");

        // .add(), .remove(), .size(), .isEmpty(), .contains(value)

        System.out.println("\n// МЕТОДЫ ДЛЯ МНОЖЕСТВ.............\n");

        // union (.addAll()) - объединение двух множеств, повторяющиеся элементы будут включены только один раз
        HashSet<Integer> intSet1 = new HashSet<>();

        intSet1.add(2);
        intSet1.add(8);
        intSet1.add(3);
        intSet1.add(5);
        intSet1.add(1);

        HashSet<Integer> intSet2 = new HashSet<>();

        intSet2.add(4);
        intSet2.add(8);
        intSet2.add(5);
        intSet2.add(3);
        intSet2.add(7);

        HashSet<Integer> union = new HashSet<>(intSet1);
        union.addAll(intSet2);
        System.out.println(union);

        // intersectoin (.retainAll()) - пересечение двух множеств. Будет содержать значения, которые есть и там и там

        HashSet<Integer> intersectoin = new HashSet<>(intSet1);
        intersectoin.retainAll(intSet2);
        System.out.println(intersectoin);

        // subtraction (.removeAll()) - вычетание двух множеств. Удалит из первого все элементы которые есть и во втором

        HashSet<Integer> subtraction = new HashSet<>(intSet1);
        subtraction.removeAll(intSet2);
        System.out.println(subtraction);

    }
}
