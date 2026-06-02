package J13_FunctionalProgramming.Terminal_Operations;

import java.util.Arrays;
import java.util.List;

public class ForEachOperation {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Adam", "Bob", "Charlie");

        names.stream()
                .forEach(System.out::println);
    }
}
