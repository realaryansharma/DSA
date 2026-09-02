package advance.arrays.fundamentals;

public class RotateArrayByK {
    public void rotateArray(int[] nums, int k) {
        
        int temp;

        for(int i=0; i<k; i++) {

            temp = nums[0];

            for(int j=1; j<nums.length; j++) {

                nums[j-1] = nums[j];

            }

            nums[nums.length - 1] = temp;

        }
        
    }    
}
