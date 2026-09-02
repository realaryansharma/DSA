package advance.arrays.logicBuilding;

public class MoveZeroesToEnd {
    public void moveZeroes(int[] nums) {
        
        int placementIndex = 0;

        for(int i=0; i<nums.length; i++) {

            if(nums[i] != 0) {

                if(i != placementIndex) {
                    nums[placementIndex] = nums[i];
                    nums[i] = 0;
                }

                placementIndex++;

            }

        }

    }
}
