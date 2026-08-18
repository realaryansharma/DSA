package basic.maths;

public class CheckForPerfectNumber {
    public boolean isPerfect(int n) {

        int ans = 1;

        if(n==1) return false;

        for(int i=2; i<=n/2; i++) {

            if(n%i==0)
                ans += i;

        }

        return (n == ans) ? true : false;

    }    
}
