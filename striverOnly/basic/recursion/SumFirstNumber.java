package basic.recursion;

public class SumFirstNumber {
    
    public int NnumbersSum(int N) {
        //your code goes here
        if(N<1)
            return 0;
        
        return N+NnumbersSum(N-1);

    }

}
