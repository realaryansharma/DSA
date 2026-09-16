package advance.arrays.medium;

import java.util.HashMap;

public class TwoSum {

    public int[] twoSumBrute(int[] nums, int target) {
        
        int sum = 0;

        for(int i=0; i<nums.length; i++) {

            for(int j=i+1; j<nums.length; j++) {

                sum = nums[i] + nums[j];

                if(i != j && sum == target) {
                    return new int[] {i, j};
                }

            }

        }

        return new int[] {-1, -1};

    }

    public int[] twoSumBetter(int[] nums, int target) {
        int elementToFind;
        HashMap <Integer, Integer> mp = new HashMap<>();

        for(int i=0; i<nums.length; i++) {

            elementToFind = target - nums[i];

            if(mp.containsKey(elementToFind)) {
                return new int[] {mp.get(elementToFind), i};
            }

            mp.put(nums[i], i);

        }
        return new int[] {-1, -1};
    }

}
