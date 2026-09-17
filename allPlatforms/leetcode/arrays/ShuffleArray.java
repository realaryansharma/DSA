package allPlatforms.leetcode.arrays;

public class ShuffleArray {
    public int[] shuffle(int[] nums, int n) {
        
        int[] result = new int[nums.length];
        int start = 0;

        for(int i=0; i<n; i++) {

            result[start++] = nums[i];
            result[start++] = nums[i + n];

        }

        return result;

    }    
}
