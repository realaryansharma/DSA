package basic.maths;

public class Palindrome {
    public boolean isPalindrome(int n) {

        int extractDigit, reversed, saveOrg;

        saveOrg = n;
        reversed = 0;

        while(n>0) {

            extractDigit = n % 10;
            reversed = reversed * 10 + extractDigit;            
            n /= 10;

        }

        if(saveOrg == reversed)
            return true;
        else
            return false;

    }    
}
