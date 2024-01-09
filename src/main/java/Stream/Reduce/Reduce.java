package Stream.Reduce;

import java.util.ArrayList;
import java.util.List;

public class Reduce {

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(5);
        myList.add(1);
        myList.add(6);
        myList.add(9);
        myList.add(3);

        // reduce возвращает всегда один элемент. Удобно для перемножения, суммирования, нахождения min, max
        // Возвращает Optional обертку и для получения из нее значения нужно использовать метод .get()
        // В данном случае accum принимает первое значение списка и перемножается со вторым и так далее накапливая accum
        int result = myList.stream().reduce((accum, element) -> accum * element).get();
        System.out.println(result);

        // Можно указать identity - начальное значение для accum, тогда .get() не нужно использовать
        int result2 = myList.stream().reduce(0, Integer::sum);
        System.out.println(result2);

    }
}
