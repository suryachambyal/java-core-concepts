package J15_Generics;

interface GenericPrinter<T> {
    void print(T value);
}

class StringPrinter implements GenericPrinter<String> {

    @Override
    public void print(String value) {
        System.out.println("Printing String: " + value);
    }
}

public class GenericsInterfaceExample {

    public static void main(String[] args) {

        StringPrinter printer = new StringPrinter();

        printer.print("Java Programming");
    }
}