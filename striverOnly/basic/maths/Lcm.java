package basic.maths;
public class Lcm {
    public int LCM(int n1, int n2) {

        int largestInt = Math.max(n1, n2), answerfound = 0, smallestInt = Math.min(n1, n2), count=1;

        while(answerfound==0) {

            

            if((largestInt*count) % smallestInt == 0) {

                answerfound = largestInt*count;

            }

            count++;

        }

        return answerfound;


    }
}
