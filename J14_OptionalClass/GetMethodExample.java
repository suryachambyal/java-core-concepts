package J14_OptionalClass;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class GetMethodExample {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Blake", "Alex", "Trevor");

        Optional<String> result = names.stream()
                .filter(name -> name.startsWith("A"))
                .findFirst();

        System.out.println(result.get());
    }
}
