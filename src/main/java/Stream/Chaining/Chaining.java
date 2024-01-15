package Stream.Chaining;

import java.util.List;

public class Chaining {
    public static void main(String[] args) {

        List<Integer> list = List.of(1,3,5,6,9,12,45,81,0);

        // В цепочке вызовов бывают intermediate (lazy) и terminal (eager) методы.
        // Первые принимают стрим и возвращают стрим их может быть БОЛЕЕ одного, но ои не будут исполнены, пока не
        // будет вызван заключительный (финальный) терминальный метод. Сам терминальный метод не возвращает поток.
        int result = list.stream().filter(el -> el % 2  == 0)
                .map(el -> {
                    if (el % 3 == 0) {el = el / 3;}
                    return el;
                })
                .reduce(Integer::sum).get();

        System.out.println(result);
    }
}
