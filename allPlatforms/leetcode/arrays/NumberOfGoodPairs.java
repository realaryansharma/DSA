package allPlatforms.leetcode.arrays;

import java.util.HashMap;

public class NumberOfGoodPairs {
    public int numIdenticalPairs(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int goodPairs = 0;

        for (int i = 0; i < nums.length; i++) {

            goodPairs += map.getOrDefault(nums[i], 0);

            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        return goodPairs;
    }
}
