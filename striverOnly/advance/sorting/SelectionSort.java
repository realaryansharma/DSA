package advance.sorting;

public class SelectionSort {
    
    public int[] selectionSort(int[] nums) {

        int minIndex;

        for(int i=0; i<nums.length; i++) {

            minIndex = i;

            for(int j=i+1; j<nums.length; j++) {

                if(nums[minIndex] > nums[j]) {
                    minIndex = j;
                }

            }

            if (minIndex != i) {
                int temp = nums[i];
                nums[i] = nums[minIndex];
                nums[minIndex] = temp;
            }

        }

        return nums;

    }

}
