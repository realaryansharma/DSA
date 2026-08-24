package basic.recursion;

import java.util.ArrayList;

public class ReverseString {
    public ArrayList<Character> reverseString(ArrayList<Character> s) {
        // your code goes here

        return reverseArrayList(0, s);
    }

    ArrayList<Character> reverseArrayList(int index, ArrayList<Character> s) {

        if (index >= s.size() / 2) {
            return s;
        }

        char temp;

        temp = s.get(index);

        s.set(index, s.get((s.size() - 1) - index));

        s.set((s.size() - 1) - index, temp);

        return reverseArrayList(index + 1, s);
    }
}
