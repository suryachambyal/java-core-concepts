package J15_Generics;

import java.util.ArrayList;

public class BeforeGenerics {

    public static void main(String[] args) {
        ArrayList names = new ArrayList<>();

        names.add("Adam");
        names.add(10);
        names.add(true);
        
        System.out.println(names);

        String name1 = (String) names.get(0);

        System.out.println(name1);

        String name2 = (String) names.get(1);

        System.out.println(name2);
    }
    
}
