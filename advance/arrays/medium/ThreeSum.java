package advance.arrays.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> tripletList = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {

            // Skip duplicate fixed elements
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int start = i + 1;
            int end = nums.length - 1;

            while (start < end) {

                int sum = nums[i] + nums[start] + nums[end];

                if (sum == 0) {

                    tripletList.add(
                        Arrays.asList(nums[i], nums[start], nums[end])
                    );

                    start++;
                    end--;

                    // Skip duplicate left values
                    while (start < end && nums[start] == nums[start - 1]) {
                        start++;
                    }

                    // Skip duplicate right values
                    while (start < end && nums[end] == nums[end + 1]) {
                        end--;
                    }

                } else if (sum > 0) {
                    end--;

                } else {
                    start++;
                }
            }
        }

        return tripletList;
    }

}
