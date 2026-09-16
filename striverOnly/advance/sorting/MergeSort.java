package advance.sorting;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {
        public int[] mergeSort(int[] nums) {

        mergeSortHelper(0, nums.length - 1, nums);

        return nums;
    }

    void mergeSortHelper(int start, int end, int[] nums) {

        if (start >= end)
            return;

        int mid = start + (end - start) / 2;

        mergeSortHelper(start, mid, nums);
        mergeSortHelper(mid + 1, end, nums);

        mergeTheArrays(start, end, mid, nums);
    }

    public void mergeTheArrays(int start, int end, int mid, int[] nums) {

        List<Integer> temp = new ArrayList<>();

        int left = start;
        int right = mid + 1;

        // Compare elements from both sorted halves
        while (left <= mid && right <= end) {

            if (nums[left] <= nums[right]) {
                temp.add(nums[left]);
                left++;
            } 
            else {
                temp.add(nums[right]);
                right++;
            }
        }

        // Remaining elements of left half
        while (left <= mid) {
            temp.add(nums[left]);
            left++;
        }

        // Remaining elements of right half
        while (right <= end) {
            temp.add(nums[right]);
            right++;
        }

        // Copy sorted elements back into nums
        for (int i = start; i <= end; i++) {
            nums[i] = temp.get(i - start);
        }
    }
}
