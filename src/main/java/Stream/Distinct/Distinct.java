package Stream.Distinct;

import java.util.List;

public class Distinct {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,1,2,3,0);

        // Метод distinct() возвращает стрим уникальных элементов
        List<Integer> result = list.stream().distinct().toList();
        System.out.println(result);

    }
}
