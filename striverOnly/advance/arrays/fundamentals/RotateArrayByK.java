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
//Array Rotation Optimised approach
//This is brute force, you can make an optimised approach
//based on the elements you want to rotate, that is one partition of array the other is the pending array
//reverse both partitions consider them two individual array
//Once you have two reversed partitions, treat them as a single array and then reverse it. BOOM! O(n) and array rotation is done