package J03_VariableArguments;

public class VarArgs {

    public static void main(String[] args) {

        System.out.println("Sum = " + sum(10));
        System.out.println("Sum = " + sum(10, 20));
        System.out.println("Sum = " + sum(10, 20, 30));
        System.out.println("Sum = " + sum(10, 20, 30, 40));
        System.out.println("Sum = " + sum(10, 20, 30, 40, 50));
    }

    // Method accepting variable number of arguments
    public static int sum(int... numbers) {

        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        return sum;
    }
}