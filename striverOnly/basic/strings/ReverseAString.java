package basic.strings;

import java.util.List;

public class ReverseAString {
    public void reverseString(List<Character> s) {
        //your code goes here

        int start = 0, end = s.size()-1;
        char temp;

        while(start < end) {

            temp = s.get(start);
            s.set(start, s.get(end));
            s.set(end, temp);

            start++;
            end--;

        }

    }    
}
