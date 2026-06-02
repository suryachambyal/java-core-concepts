package J14_OptionalClass;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OrElseGetMethodExample {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("William", "David", "Charles");

        Optional<String> result = names.stream()
                .filter(name -> name.startsWith("Z"))
                .findFirst();

        System.out.println(result.orElseGet(() -> "Generated Name"));
    }
}
