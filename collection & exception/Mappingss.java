package Collectionss;

import java.util.HashMap;
import java.util.Map;

public class Mappingss {

    public static void main(String[] args) {
        // Create a HashMap to store student names and their corresponding scores
        Map<String, Integer> studentScores = new HashMap<>();

        // Add key-value pairs to the HashMap
        studentScores.put("Alice", 85);
        studentScores.put("Bob", 92);
        studentScores.put("Charlie", 78);
        studentScores.put("Diana", 90);
        studentScores.put("Edward", 88);

        // Retrieve and display the score of a specific student
        String studentName = "Bob";
        Integer score = studentScores.get(studentName);
        if (score != null) {
            System.out.println(studentName + "'s score: " + score);
        } else {
            System.out.println("Score for " + studentName + " not found.");
        }

        // Display all student names and their scores
        System.out.println("\nAll student scores:");
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println("Student: " + entry.getKey() + ", Score: " + entry.getValue());
        }

        // Remove a student's entry from the map
        studentScores.remove("Charlie");

        // Display the map size after removal
        System.out.println("\nMap size after removal: " + studentScores.size());

        // Check if a specific student exists in the map
        String searchName = "Diana";
        if (studentScores.containsKey(searchName)) {
            System.out.println(searchName + " is in the map with a score of " + studentScores.get(searchName));
        } else {
            System.out.println(searchName + " is not in the map.");
        }

        // Iterate over the keys and display each key-value pair
        System.out.println("\nIterating over the keys:");
        for (String key : studentScores.keySet()) {
            System.out.println("Student: " + key + ", Score: " + studentScores.get(key));
        }
    }
}
