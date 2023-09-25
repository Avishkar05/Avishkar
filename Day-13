//You are given a string of characters. Write a Java function to generate and print all possible permutations of the characters in the string. Ensure that each permutation is printed exactly once. String-abc
import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void generatePermutations(String str) {
        generatePermutationsHelper(str, 0, new ArrayList<>());
    }

    private static void generatePermutationsHelper(String str, int index, List<Character> current) {
        if (index == str.length()) {
            // If the current permutation is complete, print it
            for (char ch : current) {
                System.out.print(ch);
            }
            System.out.println();
            return;
        }

        // Try all possible characters at the current index
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if the character is already in the current permutation
            if (!current.contains(ch)) {
                current.add(ch);
                generatePermutationsHelper(str, index + 1, current);
                current.remove(current.size() - 1); // Backtrack
            }
        }
    }

    public static void main(String[] args) {
        String input = "abc";
        generatePermutations(input);
    }
}
