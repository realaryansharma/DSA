package basic.maths;

public class FactorialOfNumber {
    public int factorial(int n) {

        int factorialAns = 1;

        while(n>0) {

            factorialAns *= n--;

        }

        return factorialAns;

    }
}
