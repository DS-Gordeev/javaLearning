package Collection.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> myMap = new HashMap<>();

        // .put - добавляет данные в map. Ключ должен быть уникальным. Ключ и значение могут быть null
        myMap.put(1000, "Dmitriy Gordeev");
        myMap.put(5601, "Ivan Sidorov");
        myMap.put(4410, "Artem Petrov");
        myMap.put(3216, "Sergey Lykianov");
        myMap.put(8176, "Fedor Ignatov");
        myMap.put(1000, "Vasilisa Gordeeva");
        myMap.put(null, null);
        System.out.println(myMap);

        // .putIfAbsent - добавляет данные в map, если такой ключ отсутствует в map (в успешном случае возвращает null)
        // Если ключ присутствует в map, то возвращает значение этого ключа.
        myMap.putIfAbsent(8177, "Fedor Ignatov");
        System.out.println(myMap);

        // .get - возвращает значение по указанному ключу. Если такого ключа нет возвращает null
        System.out.println(myMap.get(1000));
        System.out.println(myMap.get(1001));

        // .getOrDefault - возвращает значение по указанному ключу. Если такого ключа нет, то возвращает указанное значение
        System.out.println(myMap.getOrDefault(4410, "Такого ключа нет"));
        System.out.println(myMap.getOrDefault(4411, "Такого ключа нет"));

        // .remove - удаляет пару ключ\значение по указанному ключу
        myMap.remove(5601);
        System.out.println(myMap);

        // .containsValue - возвращает true если в map содержится значение, иначе false
        System.out.println(myMap.containsValue("Sergey Lykianov"));

        // .containsKey - возвращает true если в map содержится ключ, иначе false
        System.out.println(myMap.containsKey(7777));

        // .keySet - возвращает множество ключей map
        System.out.println(myMap.keySet());

        // .values - возвращает все значений map
        System.out.println(myMap.values());

        // .entrySet -

    }
}
