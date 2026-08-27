package advance.sorting;

public class BubbleSort {
    public int[] bubbleSort(int[] nums) {

        int temp;

        for(int i=1; i<=nums.length; i++) {

            for(int j=0; j<nums.length-i; j++) {
                
                if(nums[j] > nums[j+1]) {
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }

            }

        }

        return nums;

    }
}
