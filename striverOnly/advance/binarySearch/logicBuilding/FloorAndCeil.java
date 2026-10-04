package advance.binarySearch.logicBuilding;

public class FloorAndCeil {
    
}
class Solution {
    public int[] getFloorAndCeil(int[] nums, int x) {

        int start=0, end=nums.length-1, mid;

        if (nums.length == 1) {
            if (nums[0] == x) {
                return new int[]{x, x};
            } else if (nums[0] > x) {
                return new int[]{-1, nums[0]};
            } else {
                return new int[]{nums[0], -1};
            }
        }

        while(start <= end) {

            mid = start + (end - start) / 2;

            if(nums[mid] == x) {

                return new int[]{x, x};
            
            } else if(nums[mid] < x) {

                start = mid + 1;

            } else {

                end = mid -1;

            }

        }

        int floor = end >= 0 ? nums[end] : -1;
        int ceil = start < nums.length ? nums[start] : -1;

        return new int[]{floor, ceil};


    }
}