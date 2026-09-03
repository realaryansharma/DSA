package advance.arrays.medium;

public class RearrangeElementsInArrayWithSign {
    public int[] rearrangeArray(int[] nums) {
        
        int negIndex=0, posIndex=0, arrLength = nums.length;
        int[] arr = new int[nums.length];

        for(int i=0; i<nums.length; i++) {

            while(posIndex < arrLength && nums[posIndex] < 0) {

                posIndex++;

            }

            while(negIndex < arrLength && nums[negIndex] > 0) {

                negIndex++;

            }

            arr[i] = nums[posIndex++];
            i++;
            arr[i] = nums[negIndex++];

        }

        return arr;

    }    
}
