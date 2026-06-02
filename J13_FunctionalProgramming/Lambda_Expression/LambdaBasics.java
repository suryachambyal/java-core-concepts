package J13_FunctionalProgramming.Lambda_Expression;

interface Addition {
    int add(int a, int b);
}

public class LambdaBasics {
    public static void main(String[] args) {

        Addition obj = (a, b) -> a + b;

        System.out.println("Sum = " + obj.add(10, 20));
    }
}
