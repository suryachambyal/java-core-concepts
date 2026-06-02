package J14_OptionalClass;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class IsPresentMethodExample {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Steve", "Mark", "Bill");

        Optional<String> result = names.stream()
                .filter(name -> name.startsWith("S"))
                .findFirst();

        System.out.println(result.isPresent());
    }
}