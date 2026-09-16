package basic.hashing;

public class HighestOccuringElementInArray {
    public int mostFrequentElement(int[] nums) {

        // Find maximum value
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        // Frequency array
        int[] hashArray = new int[max + 1];

        // Count frequency
        for (int i = 0; i < nums.length; i++) {
            hashArray[nums[i]]++;
        }

        // Find most frequent element
        int maxFrequency = 0;
        int mostFrequent = 0;

        for (int i = 0; i < hashArray.length; i++) {

            if (hashArray[i] > maxFrequency) {
                maxFrequency = hashArray[i];
                mostFrequent = i;
            }
        }

        return mostFrequent;
    }
}
