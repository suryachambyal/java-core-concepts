package J15_Generics;

public class GenericsClassExample<T> {

    private T value;

    public GenericsClassExample(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public static void main(String[] args) {

        // String Example
        GenericsClassExample<String> name =
                new GenericsClassExample<>("Surya Chambyal");

        // Integer Example
        GenericsClassExample<Integer> age =
                new GenericsClassExample<>(32);

        // Double Example
        GenericsClassExample<Double> height =
                new GenericsClassExample<>(6.0);

        // Boolean Example
        GenericsClassExample<Boolean> isJavaDeveloper =
                new GenericsClassExample<>(true);

        System.out.println("Name = " + name.getValue());
        System.out.println("Age = " + age.getValue());
        System.out.println("Height = " + height.getValue());
        System.out.println("Java Developer = " + isJavaDeveloper.getValue());
    }
}