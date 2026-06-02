package J03_VariableArguments;

public class ConcatenateStrings {

    // Method accepting variable number of strings
    public static String concatenate(String... words) {

        StringBuilder result = new StringBuilder();

        for (String word : words) {
            result.append(word).append(" ");
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {

        String result = concatenate("Java", "Variable", "Arguments", "Example");

        System.out.println("Concatenated String: " + result);
    }
}