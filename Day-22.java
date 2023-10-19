//write a program to convert numeric String to int in Java

public class StringToIntConversion {
    public static void main(String[] args) {
        String numericString = "42"; // Replace with your numeric string

        // Using Integer.parseInt()
        try {
            int intValue = Integer.parseInt(numericString);
            System.out.println("Using Integer.parseInt(): " + intValue);
        } catch (NumberFormatException e) {
            System.out.println("Invalid numeric string for Integer.parseInt()");
        }

        // Using Integer.valueOf()
        try {
            int intValue2 = Integer.valueOf(numericString);
            System.out.println("Using Integer.valueOf(): " + intValue2);
        } catch (NumberFormatException e) {
            System.out.println("Invalid numeric string for Integer.valueOf()");
        }
    }
}
