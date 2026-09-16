package basic.maths;

public class ReturnTheLargestDigitInNumber {
    public int largestDigit(int n) {

        int max = 0, extractDigit;

        while(n>0) {

            extractDigit = n % 10;

            if(max < extractDigit)
                max = extractDigit;

            n /= 10;

        }

        return max;

    }    
}
