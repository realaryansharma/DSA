import java.util.Scanner;

public class CheckSortedArray {

    public static void main(String args[]) {

        int size, numOfElements;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements you want: ");
        size = input.nextInt();

        int[] arr = new int[size];

        System.out.println("\nEnter an array of elements");

        for(int i=0; i<size;i++) {
            System.out.print("\nEnter the "+ (i+1) + "th elememnt: ");
            arr[i] = input.nextInt();
        }

        System.out.println("=============================");


        if(size <= 1) {
            System.out.println("Array is sorted");
        }
        else {
            if(isArraySorted(arr, 0, 1, size)) {
                System.out.println("Array is sorted");
            }
            else {
                System.out.println("Array isn't sorted");
            }
        }

        System.out.println("=============================");

    }

    static boolean isArraySorted(int[] arr, int eleOne, int eleTwo, int size) {

        if(arr[eleOne] > arr[eleTwo])
            return false;

        if(eleTwo+1 == size)
            return true;
        else 
            return isArraySorted(arr, eleTwo, eleTwo+1, size);

    }

}
