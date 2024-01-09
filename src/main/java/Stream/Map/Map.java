package Stream.Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map {
    public static void main(String[] args) {

        // Stream - это последовательность элементов, которая поддерживает последовательные и параллельные операции
        List<String> wordList = new ArrayList<>();
        wordList.add("privet");
        wordList.add("kak dela");
        wordList.add("OK");
        wordList.add("poka");

        // Заменим строки на значение их длинны при помощи стандартного цикла for
//        for(int i = 0; i < wordList.size(); i++) {
//            wordList.set(i, String.valueOf(wordList.get(i).length()));
//        }
//        System.out.println(wordList);

        // Делаем то же самое при помощи стрима. Метод map() возвр. уже НОВЫЙ стрим, который нужно собрать в коллекцию.
        // Делается это при помощи collect(Collectors.toList()) или .toList(), но тогда список будет Immutable
        List<Integer> intList = wordList.stream().map(el -> el.length()).collect(Collectors.toList());

        System.out.println(intList);
        // Важно! Сам stream() не меняет исходную коллекцию
        System.out.println(wordList);

        // Применим Stream для массива Arrays.stream(array)
        int[] array = {3, 32, 18, 0, 4};

       array = Arrays.stream(array).map(el -> {
            if(el % 3 == 0) {
                el = el / 3;
            }
            return el;
        }).toArray();

        System.out.println(Arrays.toString(array));

    }
}
