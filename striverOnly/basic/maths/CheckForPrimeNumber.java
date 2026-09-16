package basic.maths;

public class CheckForPrimeNumber {
    public boolean isPrime(int n) {
        //your code goes here

        int count = 2, isPrime = 1;

        if(n==1)
            return false;

        while(count<=n/2) {

            if(n%count==0) {

                isPrime = 0;
                break;

            }

            count++;

        }        

        if(isPrime == 1)
            return true;
        else
            return false;

    }    
}
