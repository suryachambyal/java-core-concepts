package J13_FunctionalProgramming.Lambda_Expression;

@FunctionalInterface
interface Greeting {
    void sayHello();
}

public class FunctionalInterfaceExample {
    public static void main(String[] args) {

        Greeting g = () -> System.out.println("Hello from Functional Interface");

        g.sayHello();
    }
}
