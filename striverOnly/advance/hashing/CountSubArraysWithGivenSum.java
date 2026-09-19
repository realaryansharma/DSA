package advance.hashing;

import java.util.HashMap;

public class CountSubArraysWithGivenSum {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        int sum = 0;

        HashMap<Integer, Integer> st = new HashMap<>();
        st.put(0, 1);

        for (int i = 0; i < n; i++) {

            sum += nums[i];

            int diff = sum - k;

            if (st.containsKey(diff)) {
                count += st.get(diff);
            }

            st.put(sum, st.getOrDefault(sum, 0) + 1);
        }

        return count;
    }    
}
