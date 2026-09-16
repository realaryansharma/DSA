package advance.arrays.fundamentals;

public class LargestElement {
    public int largestElement(int[] nums) {

        int max = nums[0];

        for(int i=0; i<nums.length; i++) {

            if(nums[i] > max)
                max = nums[i];

        }

        return max;

    }    
}
