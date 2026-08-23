package basic.strings;

public class RotateString {
    public boolean rotateString(String s, String goal) {
        //your code goes here

        if(s.length() != goal.length())
            return false;

        String allCombinationsOfString = s + s;

        for(int i=0; i<s.length(); i++) {

            if(allCombinationsOfString.substring(i, i + s.length()).equals(goal)) {
                return true;
            }

        }

        return false;


}
}
