package Collection.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AdditionalMethods {
    public static void main(String[] args) {

        String[] wordArray = {"one", "two", "three", "four"};

        // Arrays.asList - создаем список на основе массива. При изменении массива список так же будет изменяться.
        List<String> listFromArray = Arrays.asList(wordArray);
        System.out.println(listFromArray);


        // obj1.removeAll(obj2) - удаляет из первого списка все элементы второго списка (разность)
        ArrayList<String> testList = new ArrayList<>();
        testList.add("Dmitriy");
        testList.add("Ivan");
        testList.add("Petr");
        testList.add("Roman");
        testList.add("Viktor");

        ArrayList<String> testList2 = new ArrayList<>();
        testList2.add("Ivan");
        testList2.add("Petr");
        testList2.add("Andrey");

        System.out.println(testList);
        testList.removeAll(testList2);
        System.out.println(testList);

        // obj1.retainAll(obj2) - оставит в первом списке те элементы, которые есть и во втором списке (пересечение)
        ArrayList<String> testList3 = new ArrayList<>();
        testList3.add("Dmitriy");
        testList3.add("Ivan");
        testList3.add("Petr");
        testList3.add("Roman");
        testList3.add("Viktor");

        ArrayList<String> testList4 = new ArrayList<>();
        testList4.add("Ivan");
        testList4.add("Petr");
        testList4.add("Andrey");

        System.out.println(testList3);
        testList3.retainAll(testList4);
        System.out.println(testList3);

        // obj1.containsAll(obj2) - выводит true если все элементы obj2 содержатся в obj1, иначе false
        boolean result = testList.containsAll(testList2);
        System.out.println(result);

        // .subList(fromIndex, toIndex) - возвращает срез списка. индекс toIndex - не включается.
        // Полученый срез не является самостоятельным объектом - это view (представление) в основной ArrayList
        // При добавлении нового элемента в mySubList он добавится и в testList5
        ArrayList<Integer> testList5 = new ArrayList<>();
        testList5.add(1);
        testList5.add(2);
        testList5.add(3);
        testList5.add(4);
        testList5.add(5);
        System.out.println(testList5);

        List<Integer> mySubList = testList5.subList(1, 4);
        System.out.println(mySubList);

        // .toArray - преобразуем список в массив. Указываем new Integer[0] размером 0, т.е. Java сама определит размер.
        Integer[] intArray = testList5.toArray(new Integer[0]);
        System.out.println(Arrays.toString(intArray));


    }
}
