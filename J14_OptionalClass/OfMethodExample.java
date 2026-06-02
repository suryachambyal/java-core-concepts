package J14_OptionalClass;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OfMethodExample {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Akshit", "Aryan", "Kavya");

        Optional<String> result = Optional.of(
                names.stream()
                        .filter(name -> name.startsWith("A"))
                        .findFirst()
                        .get()
        );

        result.ifPresent(System.out::println);
    }
}