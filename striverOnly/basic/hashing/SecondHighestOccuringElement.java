package basic.hashing;

public class SecondHighestOccuringElement {
        public int findElementInArray(int nums[]) {

        int max = 0;

        for(int i = 0; i < nums.length; i++) {
            if(max < nums[i])
                max = nums[i];
        }

        return max;
    }

    public int secondMostFrequentElement(int[] nums) {

        int maxElement = findElementInArray(nums);

        int[] frequencyArr = new int[maxElement + 1];

        // Count frequencies
        for(int i = 0; i < nums.length; i++) {
            frequencyArr[nums[i]]++;
        }

        int maxFreq = -1;
        int secondMax = -1;

        // Find maximum and second maximum frequency
        for(int i = 0; i < frequencyArr.length; i++) {

            if(frequencyArr[i] > maxFreq) {

                secondMax = maxFreq;
                maxFreq = frequencyArr[i];

            }
            else if(frequencyArr[i] < maxFreq &&
                    frequencyArr[i] > secondMax) {

                secondMax = frequencyArr[i];
            }
        }

        // No second most frequent element
        if(secondMax <= 0)
            return -1;

        // Find smallest element with second maximum frequency
        for(int i = 0; i < frequencyArr.length; i++) {

            if(frequencyArr[i] == secondMax)
                return i;
        }

        return -1;
    }
}
