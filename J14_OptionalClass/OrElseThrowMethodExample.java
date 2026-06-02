package J14_OptionalClass;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OrElseThrowMethodExample {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Joseph", "Thomas", "Paul");

        Optional<String> result = names.stream()
                .filter(name -> name.startsWith("Z"))
                .findFirst();

        System.out.println(result.orElseThrow(() ->
                new RuntimeException("Value Not Found")));
    }
}
