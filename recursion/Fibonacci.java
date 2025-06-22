import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        int numOfDigits, ans;

        Scanner input  = new Scanner(System.in);
        
        System.out.print("Enter the index of term: ");
        numOfDigits = input.nextInt();

        ans = printFibonacci(numOfDigits);

        System.out.println(ans);
        
    }

    static int printFibonacci(int index) {

        if(index < 2) {
            return index;
        }
        return printFibonacci(index-1) + printFibonacci(index-2);

    }

}