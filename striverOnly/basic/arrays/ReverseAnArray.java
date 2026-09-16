package basic.arrays;

public class ReverseAnArray {
    public void reverse(int[] arr, int n) {

        int leftPointer, rightPointer, temp;

        leftPointer = 0;
        rightPointer = arr.length - 1;

        while(leftPointer < rightPointer) {

            temp = arr[rightPointer];
            arr[rightPointer--] = arr[leftPointer];
            arr[leftPointer++] = temp;

        }

    }    
}
