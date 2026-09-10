package advance.arrays.medium;

public class MaxSubArraySum {
    
    public int maxSubArray(int[] nums) {
        
        int sum, maxSum = nums[0];

        for(int i=0; i<nums.length; i++) {

            sum = 0;

            for(int j=i; j<nums.length; j++) {

                sum += nums[j];

                if(maxSum < sum) {
                    maxSum = sum;
                }

            }

        }

        return maxSum;

    }

}
