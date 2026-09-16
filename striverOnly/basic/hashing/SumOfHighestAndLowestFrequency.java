package basic.hashing;

public class SumOfHighestAndLowestFrequency {
        int findMaxElement(int[] nums) {

        int max = -1;

        for(int i=0; i<nums.length; i++) {

            if(max < nums[i])
                max = nums[i];

        }

        return max;

    }

    public int sumHighestAndLowestFrequency(int[] nums) {
      
        int maxElement, maxFrequency, minFrequency, maxFrequencyElement=0, minFrequencyElement=0;

        maxFrequency = -1;
        minFrequency = Integer.MAX_VALUE;

        maxElement = findMaxElement(nums);

        int[] freqArray = new int[maxElement+1];

        for(int i=0; i<nums.length; i++) {

            freqArray[nums[i]]++;

        }

        for(int i=0; i<freqArray.length; i++) {

            if(freqArray[i] > 0) {

                if(freqArray[i] > maxFrequency) {
                    maxFrequency = freqArray[i];
                }

                if(freqArray[i] < minFrequency) {
                    minFrequency = freqArray[i];
                }
            }
        }

        return maxFrequency + minFrequency;

    }
}
