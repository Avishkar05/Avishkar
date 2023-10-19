//Write a Java program that converts integers into Roman numerals. The program should take an integer as input and return its Roman numeral representation.
import java.util.HashMap;

public class IntegerToRoman {
    public static String intToRoman(int num) {
        if (num <= 0 || num > 3999) {
            return "Invalid input";
        }

        // Define symbols and their corresponding values
        HashMap<Integer, String> romanSymbols = new HashMap<>();
        romanSymbols.put(1, "I");
        romanSymbols.put(4, "IV");
        romanSymbols.put(5, "V");
        romanSymbols.put(9, "IX");
        romanSymbols.put(10, "X");
        romanSymbols.put(40, "XL");
        romanSymbols.put(50, "L");
        romanSymbols.put(90, "XC");
        romanSymbols.put(100, "C");
        romanSymbols.put(400, "CD");
        romanSymbols.put(500, "D");
        romanSymbols.put(900, "CM");
        romanSymbols.put(1000, "M");

        // Create a StringBuilder to build the Roman numeral
        StringBuilder romanNumeral = new StringBuilder();

        // Start with the largest values and subtract their corresponding symbols
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        for (int value : values) {
            while (num >= value) {
                romanNumeral.append(romanSymbols.get(value));
                num -= value;
            }
        }

        return romanNumeral.toString();
    }

    public static void main(String[] args) {
        int num = 1984; // Replace with your desired integer
        String romanNumeral = intToRoman(num);
        System.out.println("Roman numeral for " + num + " is: " + romanNumeral);
    }
}
