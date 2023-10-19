/*Given an array containing N+1 integers, where the integers are in the range from 1 to N, and there is exactly one duplicate element in the array. Write a Java function to efficiently find and return the duplicate element array = [1, 3, 4, 2, 2}*/
public class FindDuplicate {
    public static int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

        // Phase 1: Find the intersection point in the cycle
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        // Phase 2: Find the entrance to the cycle
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};
        int duplicate = findDuplicate(nums);

        System.out.println("Duplicate element in the array is: " + duplicate);
    }
}
