package J13_FunctionalProgramming.Streams;

import java.util.Arrays;
import java.util.List;

public class SortedExample {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5,2,8,1,9);

        numbers.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
