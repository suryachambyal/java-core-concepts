package J10_Enums;

public class MonthEnum {

    enum Month {

        JANUARY("Winter"),
        FEBRUARY("Winter"),
        MARCH("Summer"),
        APRIL("Summer"),
        MAY("Summer"),
        JUNE("Summer"),
        JULY("Monsoon"),
        AUGUST("Monsoon"),
        SEPTEMBER("Monsoon"),
        OCTOBER("Autumn"),
        NOVEMBER("Autumn"),
        DECEMBER("Winter");

        // Attribute
        private final String season;

        // Constructor
        Month(String season) {
            this.season = season;
        }

        // Method
        public String getSeason() {
            return season;
        }
    }

    public static void main(String[] args) {

        // Iterating over enum values
        for (Month month : Month.values()) {
            System.out.println(month + " -> " + month.getSeason());
        }
    }
}

