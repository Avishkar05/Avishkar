// Write a program to check the number is even or odd without using modulus operator (%)
public class EvenOddWithoutModulus {
    public static boolean isEven(int number) {
        // Check the least significant bit (LSB) using a bitwise AND operation
        // If the LSB is 0, the number is even; if it's 1, the number is odd
        return (number & 1) == 0;
    }

    public static void main(String[] args) {
        int num = 17; // Replace with the number you want to check

        if (isEven(num)) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
    }
}
