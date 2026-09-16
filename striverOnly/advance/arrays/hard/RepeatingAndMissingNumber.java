package advance.arrays.hard;

import java.util.HashMap;

public class RepeatingAndMissingNumber {
        public int[] findMissingRepeatingNumbers(int[] nums) {

        int count, sum=0, expectedSum;
        HashMap <Integer, Integer> frequencyMap = new HashMap<>();

        int[] ans = new int[2];

        for(int i=0; i<nums.length; i++) {

            count = frequencyMap.getOrDefault(nums[i], 0) + 1;
            frequencyMap.put(nums[i], count);

            if(count == 2) {
                ans[0] = nums[i];
                sum -= nums[i];
            }

            sum += nums[i];

        }

        //Finding the missing element
        expectedSum = (nums.length * (nums.length+1))/2;

        ans[1] = expectedSum - sum;

        return ans;

    }
}
