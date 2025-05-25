public class ImplementStackUsingLinkedList {

    public static void main(String[] args) {
        int[] gain = {-5, 1, 5, 0, -7}; // Initialize the array with given values

        ImplementStackUsingLinkedList altitudeCalculator = new ImplementStackUsingLinkedList();
        int answer = altitudeCalculator.largestAltitude(gain); // Call largestAltitude with gain array
        System.out.println("The highest altitude is: " + answer);
    }

    private int largestAltitude(int[] gain) {

        int max=0, curAlt=0;

        for(int i=0; i<gain.length; i++){
            curAlt += gain[i];
            max = (max<curAlt)? curAlt : max;
        }

        return max;
    }
}