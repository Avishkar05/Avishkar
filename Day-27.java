// Find the second largest number in list without using sorting  java
import java.util.ArrayList;
import java.util.List;

public class SecondLargestWithoutSorting {
    public static int findSecondLargest(List<Integer> numbers) {
        if (numbers.size() < 2) {
            System.out.println("There is no second largest element in the list.");
            return -1;
        }

        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : numbers) {
            if (num > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = num;
            } else if (num > secondLargest && num != firstLargest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element in the list.");
            return -1;
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(15);
        numbers.add(30);
        numbers.add(25);

        int secondLargest = findSecondLargest(numbers);

        if (secondLargest != -1) {
            System.out.println("The second largest element in the list is: " + secondLargest);
        }
    }
}
