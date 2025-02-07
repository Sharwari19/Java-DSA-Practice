// Write a method using varargs that calculates the average of a given list of numbers

package Functions.Varargs;

public class AverageOfNumbers {
    public static void main(String[] args) {
        System.out.println(average(10, 20, 30, 40, 50)); // Output: 30.0
        System.out.println(average(5, 15)); // Output: 10.0
        System.out.println(average(100)); // Output: 100.0
    }

    public static double average(int ...nums) {
        double average = 0;
        int numCount = nums.length;

        if(numCount == 0) {
            return 0.0;
        }

        int sum = 0;

        for(int num : nums) {
            sum += num;
        }

        average = sum / numCount;

        return average;
    }
}
