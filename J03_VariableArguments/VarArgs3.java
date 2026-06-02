package J03_VariableArguments;

public class VarArgs3 {

    public static void main(String[] args) {

        showMarks("Surya", 100, 95, 90, 85, 80);
    }

    // Method with fixed parameter and variable arguments
    public static void showMarks(String name, int... marks) {

        System.out.print(name + "'s marks: ");

        for (int mark : marks) {
            System.out.print(mark + " ");
        }

        System.out.println();
    }
}