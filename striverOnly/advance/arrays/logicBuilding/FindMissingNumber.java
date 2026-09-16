package advance.arrays.logicBuilding;

public class FindMissingNumber {
    public int missingNumber(int[] nums) {
        
        int sumOfElements = 0, calculatedSum;

        calculatedSum = (nums.length * (nums.length + 1)) / 2;

        for(int num:nums) {
            sumOfElements += num;
        }

        return calculatedSum - sumOfElements;

    }    
}
