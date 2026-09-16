package advance.arrays.hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MajorityElementThree {
    public List<Integer> majorityElementTwo(int[] nums) {
        
        int threshold = (nums.length/3) + 1;
        HashMap <Integer, Integer> frequencyMap = new HashMap<>();

        List<Integer> answer = new ArrayList<>();

        for(int i=0; i<nums.length; i++) {

            int count = frequencyMap.getOrDefault(nums[i], 0) + 1;
            frequencyMap.put(nums[i], count);

            if (count == threshold) {
                answer.add(nums[i]);
            }

        }

        return answer;

    }
}

//Moores voting algorithm can help you solve this with O(1) extra space