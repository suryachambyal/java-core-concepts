package J15_Generics;

public class BoundedGenericsExample {

    public static <T extends Number> void printNumber(T value) {
        System.out.println("Value = " + value);
        System.out.println("Double Value = " + value.doubleValue());
        System.out.println();
    }

    public static void main(String[] args) {

        printNumber(10);

        printNumber(99.99);

        printNumber(15L);

        // printNumber("Java");            // Compile Time Error
    }
}