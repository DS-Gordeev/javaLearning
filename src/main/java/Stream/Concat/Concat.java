package Stream.Concat;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Concat {
    public static void main(String[] args) {
        List<String> list = List.of("abc", "xyz", "qwerty");
        List<String> list2 = List.of("abc111", "xyz111", "qwerty111");

        Stream<String> stream1 = list.stream();
        Stream<String> stream2 = list2.stream();

        // Метод concat() объединяет два стрима в один
        List<String> listFromStreams = Stream.concat(stream1, stream2).toList();
        System.out.println(listFromStreams);
    }
}
