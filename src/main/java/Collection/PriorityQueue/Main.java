package Collection.PriorityQueue;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
       //  PriorityQueue - очередь в которой используется натуральная или определенная Comparable or Comparator сорт.
        PriorityQueue<Integer> myPriorityQueue = new PriorityQueue<>();

        myPriorityQueue.add(12);
        myPriorityQueue.add(3);
        myPriorityQueue.add(7);
        myPriorityQueue.add(1);
        myPriorityQueue.add(8);
        // 1 3 7 8 12

        System.out.println(myPriorityQueue.peek());

    }
}
