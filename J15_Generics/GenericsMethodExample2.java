package J15_Generics;

public class GenericsMethodExample2 {
    public static <T> void showType(T value) {
        System.out.println("Value = " + value);
        System.out.println("Type = " + value.getClass().getSimpleName());
        System.out.println();
    }

    public static void main(String[] args) {
        showType("Java Programming");
        showType(101);
        showType(99.99);
        showType(true);
    }
}
