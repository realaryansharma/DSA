package allPlatforms.hackerRank.arrays;

import java.util.List;

public class ReverseArray {
    public static List<Integer> reverseArray(List<Integer> a) {
    // Write your code here
        int len = a.size() -1;
        int start=0, end=len, temp;
        
        while(start<end) {
            temp = a.get(start);
            a.set(start, a.get(end));
            a.set(end, temp);
            start++;
            end--;
        }
        
        return a;

    }
}
