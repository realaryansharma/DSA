package basic.maths;

public class CheckIfTheNumberIsArmStrong {
    public boolean isArmstrong(int n) {

        int extractDigit, calculateTriple=0, saveOrg=0, count=0;

        saveOrg = n;

        //Calculate length first
        while(n>0) {
            count++;
            n /= 10;
        }

        n = saveOrg;

        while(n>0) {

            extractDigit = n % 10;

            calculateTriple += Math.pow(extractDigit, count);

            n /= 10;

        }

        if(calculateTriple == saveOrg)
            return true;
        else
            return false;

    }    
}
