package J14_OptionalClass;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class IfPresentMethodExample {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Frank", "Stephen", "Brandon");

        Optional<String> result = names.stream()
                .filter(name -> name.startsWith("S"))
                .findFirst();

        result.ifPresent(System.out::println);
    }
}
