package pr1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Application {
    public static void main(String[] args){
        //System.out.println("hello");

        List<String> list = Arrays.asList("Кошка", "Конь", "Рыбки", "Крокодил");
        /*list.stream()
                .filter(s->s.toLowerCase().startsWith("к"))
                .sorted()
                .forEach(System.out::println);*/
        Stream<String> stream = list.stream();
        /*stream.filter(s->s.toLowerCase().startsWith("к")).forEach(System.out::println);*/

        list = stream.collect(Collectors.toList());
        System.out.println(list);

    }
}
