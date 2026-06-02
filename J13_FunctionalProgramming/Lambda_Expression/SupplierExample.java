package J13_FunctionalProgramming.Lambda_Expression;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {

        Supplier<Double> randomValue = () -> (Math.ceil(Math.random() * 10));

        System.out.println(randomValue.get());
    }
}
