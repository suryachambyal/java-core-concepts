package J14_OptionalClass;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OfNullableMethodExample {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Ram", "Shyam", "Mohan");

        Optional<String> result = Optional.ofNullable(
                names.stream()
                        .filter(name -> name.startsWith("Z"))
                        .findFirst()
                        .orElse(null)
        );

        result.ifPresent(System.out::println);
    }
}
