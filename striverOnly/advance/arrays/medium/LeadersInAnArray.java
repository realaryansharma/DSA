package advance.arrays.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeadersInAnArray {
    public List<Integer> leaders(int[] nums) {
        List<Integer> leadersList = new ArrayList<>();
        int max = Integer.MIN_VALUE;

        // Traverse backwards from right to left
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] > max) {
                leadersList.add(nums[i]);
                max = nums[i];
            }
        }

        // The leaders were collected in reverse order, so reverse to restore left-to-right order
        Collections.reverse(leadersList);

        return leadersList;
    }    
}
