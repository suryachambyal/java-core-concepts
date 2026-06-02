package J13_FunctionalProgramming.Terminal_Operations;

import java.util.Arrays;
import java.util.List;

public class CountOperation {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);

        long count = numbers.stream()
                .filter(n -> n % 2 == 0)
                .count();

        System.out.println("Even Numbers Count = " + count);
    }
}
