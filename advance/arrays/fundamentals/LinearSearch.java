package advance.arrays.fundamentals;

public class LinearSearch {
    public int linearSearch(int nums[], int target) {
		//Your code goes here

        int i=0;

        while(i < nums.length && nums[i] != target) {
            i++;
        }

        return (nums.length == i) ? -1 : i;

    }
}
