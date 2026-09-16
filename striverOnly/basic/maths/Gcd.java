package basic.maths;

public class Gcd {
    int minNum(int num1, int num2) {

        return (num1<num2) ? num1 : num2;        

    }

    public int GCD(int n1, int n2) {


        int getMin, ans = 1;

        if(n1==n2)
            return n1;

        getMin = minNum(n1, n2);

        for(int i=2; i<=getMin; i++) {
            if((n1%i==0) && (n2%i==0)) {
                if(ans < i)
                    ans = i;
            }
        }

        return ans;

    }
}
