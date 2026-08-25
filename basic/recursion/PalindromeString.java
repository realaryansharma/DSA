package basic.recursion;

public class PalindromeString {
    
    public boolean palindromeCheck(String s) {
        //your code goes here

        return palindromeCheckHelper(0, s);


    }

    boolean palindromeCheckHelper(int index, String s) {

        if(index > s.length() / 2)
            return true;

        if(s.charAt(index) != s.charAt((s.length()-1) - index))
            return false;

        return palindromeCheckHelper(index+1, s);

    }
}
