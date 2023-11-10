package Collection.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);
        System.out.println(intList);

        Iterator<Integer> myIterator = intList.iterator();

        while(myIterator.hasNext()) {
            System.out.println(myIterator.next());
        }

        Iterator<Integer> myIterator2 = intList.iterator();

        // В итераторе можно удалять объект, при этом изменится основной список
        while(myIterator2.hasNext()) {
            if(myIterator2.next() == 3) {
                myIterator2.remove();
            }
        }
        System.out.println(intList);
    }
}
