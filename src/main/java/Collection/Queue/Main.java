package Collection.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        // Queue - очередь, принцип FIFO - первый пришел, первый и ушел.
        Queue<String> myQueue = new LinkedList<>();

        // .add - добавляет элемент в конец очереди
        myQueue.add("Dmitriy");
        myQueue.add("Andrey");
        myQueue.add("Roman");
        myQueue.add("Sergey");

        System.out.println(myQueue);

        // .remove - удаляет и возвращает ПЕРВЫЙ элемент в очереди. Если элементов уже нет - вернет исключение
        System.out.println(myQueue.remove());

        // .poll - удаляет и возвращает ПЕРВЫЙ элемент в очереди. Если элементов уже нет - вернет null без исключения
        System.out.println(myQueue.poll());

        // .element - возвращает первый текущий элемент очереди. Если элементов уже нет - вернет исключение
        System.out.println(myQueue.element());

        // .peak - возвращает первый текущий элемент очереди. Если элементов уже нет - вернет null без исключения
        System.out.println(myQueue.element());

    }
}
