package basic.maths;

import java.util.ArrayList;

public class DivisorOfNumber {
    public int[] divisors(int n) {

        ArrayList <Integer> ans = new ArrayList<>();

        ans.add(1);

        for(int i=2; i<=n/2; i++) {
 
            if(n%i==0)
                ans.add(i);

        }

        if(n!=1)
            ans.add(n);

        int[] result = new int[ans.size()];

        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }

        return result;

    }
}