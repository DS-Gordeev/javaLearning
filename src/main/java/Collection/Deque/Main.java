package Collection.Deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        /* Deque - это интерфейс. Double ended queue - двунаправленная очередь.
           Реализуется классами LinkedList и ArrayDeque.
           Можно использовать элементы с обоих концов FIFO и LIFO.
         */

        Deque<Integer> myDeque = new ArrayDeque<>();

        // .addFirst() и addLast() добавляют элементы в начало или конец очереди. Выбросит исключение если нет места
        // .offerFirst() и offerLast() добавляют элементы в начало или конец очереди. Не выбрасывает исключения
        myDeque.addFirst(3);
        myDeque.addFirst(5);
        System.out.println(myDeque);

        myDeque.addLast(23);
        myDeque.addLast(0);
        System.out.println(myDeque);

        // .removeFirst() и removeLast() - удаляет элемент с начала или конца очереди. Выбросит исключение если пустой
        // .pollFirst() и pollLast() - удаляет элемент с начала или конца очереди. Не выбрасывает исключения
        myDeque.removeFirst();
        myDeque.removeLast();
        System.out.println(myDeque);
        myDeque.pollFirst();
        myDeque.pollLast();
        System.out.println(myDeque);

        // .getFirst() и getLast() - получаем элемент с начала или конца очереди. Выбросит исключение если пустой
        // .peekFirst() и peekLast() - удаляет элемент с начала или конца очереди. Не выбрасывает исключения
        System.out.println(myDeque.peekFirst());




    }
}
