package lectureOne;
import java.util.Scanner;

public class SumOfDigits {
 
    public static void main(String[] args) {

        int ans, num;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        num = input.nextInt();

        ans = findSumOfDigits(num);

        System.out.println("Answer: " + ans);

    }

    static int findSumOfDigits(int input) {

        int num;
        
        if(input < 1)
            return 0;

        num = input / 10;
        input = input % 10;

        return input + findSumOfDigits(num);

    }

}
