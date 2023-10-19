// Check if given year is leap year without using % operator
import java.util.Scanner;

public class LeapYearWithoutModulus {
    public static boolean isLeapYear(int year) {
        boolean divisibleBy4 = (year / 4) * 4 == year;
        boolean divisibleBy100 = (year / 100) * 100 == year;
        boolean divisibleBy400 = (year / 400) * 400 == year;

        return divisibleBy4 && (!divisibleBy100 || divisibleBy400);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        scanner.close();

        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
