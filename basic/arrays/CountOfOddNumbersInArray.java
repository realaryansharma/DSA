package basic.arrays;

public class CountOfOddNumbersInArray {
    public int countOdd(int[] arr, int n) {
       
        int countOdd=0;

        for(int i=0; i<arr.length; i++) {

            if(arr[i]%2!=0)
                countOdd++;

        }

        return countOdd;

    }
}
