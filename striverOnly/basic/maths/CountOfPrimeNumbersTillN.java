package basic.maths;

public class CountOfPrimeNumbersTillN {
    public int primeUptoN(int n) {

        int countPrimes=0, count, isPrime;

        for(int i=2; i<=n; i++) {

            count = 2;
            isPrime = 1;

            while(count<=i/2) {

                if(i%count==0) {

                    isPrime = 0;
                    break;

                }

                count++;

            }        

            if(isPrime == 1)
                countPrimes++;  

     
        }

        return countPrimes;

    }    
}
