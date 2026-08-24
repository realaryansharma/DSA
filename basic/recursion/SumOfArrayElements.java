package basic.recursion;

public class SumOfArrayElements {

    public int arraySum(int[] nums) {
        return helper(nums, 0);
    }

    private int helper(int[] nums, int index) {
        // Base Case: Reached beyond the last valid index
        if (index == nums.length) {
            return 0;
        }

        // Recursive Relation: Current element + sum of remaining elements
        return nums[index] + helper(nums, index + 1);
    }
    
}
