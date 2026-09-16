package selfTesting;

public class TestMergeSort {
    
    public static void main(String args[]) {

        //Dummy array
        int[] inputArr = {4, 5, 2, 1, 3};

        mergeSort(0, inputArr.length-1, inputArr);
        
    }

    public static void mergeSort(int start, int end, int[] inputArr) {

        //The basic algo to perform merge sort is, divide and conquer
        //The intution is that it is easy to merge two sorted arrays
        //How can we create sorted arrays and merge? for sorting a single array?
        //Well if we break down all the elements in the array again and again, recursively, until only a single element is left, which is obviously sorted
        //And then merge it with other single elments, and so on, we can solve this problem
        //Intution says: breakdown down array into two sections until an atomic value is reached is: log n
        //And then merging those n values again and again at each level of the tree is: n
        //Hence, this sorting takes n log n time

        if(start >= end)
            return;

        int mid = start + (end - start) / 2;

        mergeSort(start, mid, inputArr);
        mergeSort(mid+1, end, inputArr);

        mergeSortHelper(start, mid, end, inputArr);

    }

    public static void mergeSortHelper(int start, int mid, int end, int[] inputArr) {

        int startCpy = start, endCpy = end, midCpy = mid, midForEnd = mid+1, index=0;

        int[] tempArr= new int[end-start+1];

        while(startCpy <= midCpy && midForEnd <= endCpy) {

            if(inputArr[startCpy] <= inputArr[midForEnd]) {
                tempArr[index++] = inputArr[startCpy++];
            } else {
                tempArr[index++] = inputArr[midForEnd++];
            }   

        }

        while(startCpy <= mid) {
            tempArr[index++] = inputArr[startCpy++];
        }
        
        while(midForEnd <= end) {
            tempArr[index++] = inputArr[midForEnd++];
        }

        for(int i=0; i<tempArr.length; i++) {

            inputArr[i+start] = tempArr[i];

        }


    }

}
