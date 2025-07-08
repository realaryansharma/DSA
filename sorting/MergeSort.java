
import java.util.Scanner;

public class MergeSort {

    public static void main(String[] args) {

        int size;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        size = input.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter the " + i + " element: ");
            arr[i] = input.nextInt();
        }

        mergeSortUsingRecursion(arr, 0, arr.length - 1);

        System.out.println("=================================");

        for(int i=0; i<size; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    static void mergeSortUsingRecursion(int[] arr, int start, int end) {

        int mid = (start + end) / 2;
        if (start >= end) return;  // base case
        mergeSortUsingRecursion(arr, start, mid);
        mergeSortUsingRecursion(arr, mid + 1, end);

        mergeTwoArrays(arr, start, mid, end);

    }

    static void mergeTwoArrays(int[] arr, int start, int mid, int end) {

        int pointerOne = start, pointerTwo = mid + 1, swap, size = end - start + 1;

        int[] temp = new int[size];

        int count = 0;

        //Merge Array in temp
        for (int i = start; i <= end; i++) {

            if (pointerOne > mid) {
                temp[count] = arr[pointerTwo];
                pointerTwo++;
            } else if (pointerTwo > end) {
                temp[count] = arr[pointerOne];
                pointerOne++;
            } else {

                if (arr[pointerOne] > arr[pointerTwo]) {
                    temp[count] = arr[pointerTwo];
                    pointerTwo++;
                } else if (arr[pointerTwo] > arr[pointerOne]) {
                    temp[count] = arr[pointerOne];
                    pointerOne++;
                } else {
                    temp[count] = arr[pointerOne++];
                }

            }
            count++;
        }

        //Update Array
        count = 0;
        for (int i = start; i <= end; i++) {
            arr[i] = temp[count];
            count++;
        }

    }

}
