// Write a method using varargs that finds the maximum number from a given list of integers.


package Functions.Varargs;

public class MaximumNum {
    public static void main(String[] args) {
        System.out.println(max(10, 20, 30, 5, 100, 50)); // Output: 100
        System.out.println(max(5, 9, 2, 1, 7)); // Output: 9
        System.out.println(max(42)); // Output: 42
        System.out.println(max());
    }

    public static int max(int ...nums) {
        if(nums.length == 0) {
            throw new IllegalArgumentException("At least one number is required");
        }

        int max = nums[0];

        for(int num: nums) {
            if(num > max) {
                max = num;
            }
        }

        return max;
    }
}
