package J09_MapInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountriesCapitals {

    public static void main(String[] args) {
        Map<String, String> countries = new HashMap<>();

        countries.put("United States", "Washington DC");
        countries.put("Russia", "Moscow");
        countries.put("China", "Beijing");
        countries.put("Bharat", "New Delhi");
        countries.put("South Korea", "Seoul");
        countries.put("United Kingdom", "London");
        countries.put("France", "Paris");
        countries.put("Japan", "Tokyo");
        countries.put("Turkiye", "Ankara");
        countries.put("Italy", "Rome");

        Scanner scn = new Scanner(System.in);
        
        System.out.print("Enter the country name: ");
        String country = scn.nextLine();
        
        if (countries.containsKey(country)) {
            System.out.print("Capital of " + country + " is: " + countries.get(country));
        } else {
            System.out.print("Sorry, this country is not listed in our database.");
        }
        scn.close();
    }

}
