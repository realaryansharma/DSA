package advance.arrays.fundamentals;

public class RotateArrayByOne {
    public void rotateArrayByOne(int[] nums) {
        
        int temp, rotate =1;

        for(int i=0; i<rotate; i++) {

            temp = nums[0];

            for(int j=1; j<nums.length; j++) {

                nums[j-1] = nums[j];

            }

            nums[nums.length - 1] = temp;

        }
        
    }    
}
