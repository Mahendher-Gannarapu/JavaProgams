/*
**Find the Frequency of Each Element in an Array ( Hashmap)**
Integer[] numbers = {2, 2, 3, 4, 5, 5, 5, 3, 2, 4};
* O/p 2→ 3 , 3 → 2 , 4→ 2, 5→ 3
 */

package Assigned_Tasks.Nov_2024.Task_04112024;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCount_HashMap {
    public static void main(String[] args) {

        // Create a HashMap to store the frequencies
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        frequencyMap.put(1, 2);
        frequencyMap.put(2, 2);
        frequencyMap.put(3, 3);
        frequencyMap.put(4, 4);
        frequencyMap.put(5, 5);
        frequencyMap.put(6, 5);
        frequencyMap.put(7, 5);
        frequencyMap.put(8, 3);
        frequencyMap.put(9, 2);
        frequencyMap.put(10, 4);

        System.out.println("Original Map: " +frequencyMap);

        // Map to store the count of each frequency
        Map<Integer, Integer> frequencyOfFrequencies = new HashMap<>();

        // Calculate the frequency of each frequency value
        for (Integer frequency : frequencyMap.values()) {
            if (frequencyOfFrequencies.containsKey(frequency)) {
                // Increment the count of this frequency
                frequencyOfFrequencies.put(frequency, frequencyOfFrequencies.get(frequency) + 1);
            } else {
                // Initialize the count for this frequency
                frequencyOfFrequencies.put(frequency, 1);
            }
        }

        // Print the frequency of each frequency
        System.out.println("Frequency of each frequency: " + frequencyOfFrequencies);
    }
}


