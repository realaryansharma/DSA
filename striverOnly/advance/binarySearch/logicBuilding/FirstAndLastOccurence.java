package advance.binarySearch.logicBuilding;

public class FirstAndLastOccurence {
    
}

class Solution {
    public int[] searchRange(int[] nums, int target) {
    
        int isFound = 0, start = 0, end = nums.length-1, mid=0;

        while(start <= end) {

            mid = start + (end-start)/2;

            if(nums[mid] == target) {
                isFound = 1;
                break;
            }
            else if(nums[mid] < target) {
                start = mid+1;                
            }
            else {
                end = mid-1;
            }

        }

        if(isFound == 0) {

            return new int[] {-1, -1};

        } else {
            
            start = mid;
            end = mid;

            while(start > 0 && nums[start-1] == target) {

                start--;

            }

            while(end < nums.length-1 && nums[end+1] == target) {

                end++;

            }
        }

        return new int[]{start, end};

    }
}
