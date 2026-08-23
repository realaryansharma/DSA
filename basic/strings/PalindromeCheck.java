package basic.strings;

public class PalindromeCheck {
    public boolean palindromeCheck(String s) {
        //your code goes here

        int start=0, end=s.length() - 1;

        while(start<end) {

            if(s.charAt(start) != s.charAt(end))
                return false;

            start++;
            end--;

        }

        return true;

    }
}
