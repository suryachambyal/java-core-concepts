package J10_Enums;

public class EnumMethods {

    // Enum declaration
    enum Weekday {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }

    public static void main(String[] args) {

        // 1. Accessing enum constant
        Weekday today = Weekday.MONDAY;
        System.out.println("Today is: " + today);

        // 2. values() - get all enum constants
        System.out.println("\nAll weekdays:");
        for (Weekday day : Weekday.values()) {
            System.out.println(day);
        }

        // 3. valueOf() - convert String to enum
        Weekday dayFromString = Weekday.valueOf("FRIDAY");
        System.out.println("\nvalueOf(\"FRIDAY\"): " + dayFromString);

        // 4. ordinal() - position of enum constant
        System.out.println("\nOrdinal of MONDAY: " + Weekday.MONDAY.ordinal());
        System.out.println("Ordinal of SUNDAY: " + Weekday.SUNDAY.ordinal());

        // 5. Using enum in switch statement
        System.out.println("\nSwitch example:");
        switch (today) {
            case MONDAY:
                System.out.println("Start of the work week");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Midweek day");
        }

        // 6. Comparing enums using ==
        Weekday anotherDay = Weekday.MONDAY;
        System.out.println("\nComparison using == : " + (today == anotherDay));
    }

}
