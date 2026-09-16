package basic.maths;

public class ReverseNumber {
    public int reverseNumber(int n) {

        int extractDigit, reversed;

        reversed = 0;

        while(n>0) {

            extractDigit = n % 10;
            reversed = reversed * 10 + extractDigit;            
            n /= 10;

        }

        return reversed;

    }    
}
