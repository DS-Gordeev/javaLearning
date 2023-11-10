package Collection.LinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> intLinkedList = new LinkedList<>();
        intLinkedList.add(1);
        intLinkedList.add(2);
        intLinkedList.add(3);
        intLinkedList.add(4);
        intLinkedList.add(5);
        System.out.println(intLinkedList);

        // Операции на получения элемента работают медленне чем в ArrayList
        // Т.к. элемент содержит только ссылки на пред. и посл. и нужно по ссылкам идти до искомого
        // HEAD перед собой и TAIL после себя ссылаются на null
        System.out.println(intLinkedList.get(4));

        // Операции добавления .add и удаления .remove работают быстрее т.к. не нужно сдвигать весь массив
        // происходит простая перелинковка соседних элементов
        intLinkedList.add(3, 99);
        System.out.println(intLinkedList);
    }
}
