package J15_Generics;

public class GenericsMethodExample {

    public static <T> T getValue(T value) {
        return value;
    }

    public static void main(String[] args) {

        String name = getValue("Surya");

        Integer age = getValue(32);

        Double height = getValue(6.0);

        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
    }
}