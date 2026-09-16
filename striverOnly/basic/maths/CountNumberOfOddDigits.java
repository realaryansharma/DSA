package basic.maths;

public class CountNumberOfOddDigits {
    public int countOddDigit(int n) {

        int count, temp;

        count = 0;

        if(n==0)
            return 0;
        
        while(n>0) {

            temp = n % 10;

            if(temp%2 != 0) {
                count++;
            }

            n = n / 10;

        }

        return count;

    }
}
