package advance.arrays.fundamentals;

public class MaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {
        
        int consecutiveOnesCount = 0, maxConsecutiveCount = 0;

        for(int num:nums) {

            if(num==1) {
                consecutiveOnesCount++;
                if(maxConsecutiveCount < consecutiveOnesCount) {
                    maxConsecutiveCount = consecutiveOnesCount;
                }

            }
            else {
                consecutiveOnesCount = 0;
            }


        }

        return maxConsecutiveCount;

    }

}
