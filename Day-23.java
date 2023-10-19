// write a program to Split String in Java without Using split() method
import java.util.ArrayList;
import java.util.List;

public class StringSplitWithoutSplitMethod {
    public static List<String> splitString(String input, char delimiter) {
        List<String> parts = new ArrayList<>();
        int startIndex = 0;
        int endIndex = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == delimiter) {
                endIndex = i;
                parts.add(input.substring(startIndex, endIndex));
                startIndex = i + 1;
            }
        }

        // Add the last part after the last delimiter (or the whole string if no delimiter is found)
        parts.add(input.substring(startIndex));

        return parts;
    }

    public static void main(String[] args) {
        String input = "This is a sample string split test";
        char delimiter = ' ';

        List<String> parts = splitString(input, delimiter);

        for (String part : parts) {
            System.out.println(part);
        }
    }
}
