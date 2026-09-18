package advance.hashing;

import java.util.HashMap;

public class LongestSubArrayWithSum {
    public int longestSubarray(int[] nums, int k) {

        int n = nums.length;
        int longest = 0;
        int sum = 0;

        HashMap<Integer, Integer> st = new HashMap<>();

        for (int i = 0; i < n; i++) {

            sum += nums[i];

            if (sum == k) {
                longest = Math.max(longest, i + 1);
            }

            int diff = sum - k;

            if (st.containsKey(diff)) {
                longest = Math.max(longest, i - st.get(diff));
            }

            if (!st.containsKey(sum)) {
                st.put(sum, i);
            }
        }

        return longest;
    }
}
