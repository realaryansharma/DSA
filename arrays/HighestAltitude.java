// 1732: Find the highest altitude
// https://leetcode.com/problems/find-the-highest-altitude/description/

public class HighestAltitude {

    public static void main(String[] args) {
        int[] gain = {-5, 1, 5, 0, -7}; // Initialize the array with given values

        HighestAltitude altitudeCalculator = new HighestAltitude();
        int answer = altitudeCalculator.largestAltitude(gain); // Call largestAltitude with gain array
        System.out.println("The highest altitude is: " + answer);
    }

    public int largestAltitude(int[] gain) {

        int max=0, curAlt=0;

        for(int i=0; i<gain.length; i++){
            curAlt += gain[i];
            max = (max<curAlt)? curAlt : max;
        }

        return max;
    }
}