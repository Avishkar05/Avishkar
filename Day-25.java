// Write a program to find length of string without using length function
public class StringLengthWithoutLengthMethod {
    public static int getStringLength(String input) {
        int length = 0;
        char[] characters = input.toCharArray();

        for (char character : characters) {
            length++;
        }

        return length;
    }

    public static void main(String[] args) {
        String input = "This is a sample string";
        int length = getStringLength(input);

        System.out.println("Length of the string: " + length);
    }
}
