package J05_ListInterface;

import java.util.ArrayList;
import java.util.List;

public class FrequencyCounter {

    public static void main(String[] args) {

        List<Integer> numList = new ArrayList<>();

        numList.add(10);
        numList.add(25);
        numList.add(30);
        numList.add(45);
        numList.add(30);
        numList.add(10);
        numList.add(30);

        int target = 30;
        int frequency = 0;

        // Count frequency
        for (Integer num : numList) {
            if (num == target) {
                frequency++;
            }
        }

        System.out.println("List: " + numList);
        System.out.println("Frequency of " + target + ": " + frequency);
    }
}