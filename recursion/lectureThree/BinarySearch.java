import java.util.Scanner;

public class BinarySearch {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int arrLen = input.nextInt();
        int[] arr = new int[arrLen];

        System.out.println("Enter " + arrLen + " sorted elements:");
        for (int i = 0; i < arrLen; i++) {
            arr[i] = input.nextInt();
        }

        System.out.print("Enter the element to search: ");
        int search = input.nextInt();

        int index = binarySearch(arr, 0, arrLen - 1, search);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found.");
        }

        input.close(); // close Scanner to avoid resource leak warning
    }

    public static int binarySearch(int[] arr, int s, int e, int search) {
        if (s > e) return -1;

        int mid = s / 2 + e / 2;

        if (arr[mid] == search) {
            return mid;
        } else if (arr[mid] < search) {
            return binarySearch(arr, mid + 1, e, search);
        } else {
            return binarySearch(arr, s, mid - 1, search);
        }
    }
}