// Arrays Video-2
// Given a string containing lower case english alphabets, what is the most occuring character

public class MostFrequentCharacter {

    public static void main(String[] args) {
        String input = "chpchapchidikabaapchidiyamargyisabkopaapzzzzzzzzzz";

        MostFrequentCharacter obj = new MostFrequentCharacter();
        int answer = obj.findHighestFreq(input) + 97;

        System.out.println("");
        System.out.print("Answer: ");
        System.out.println((char)answer);
    }

    private int findHighestFreq(String input) {

        int[] alphaArray = new int[26];
        int maxFreqChar = 0;
        int asciiOfMaxFreq = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            int ascii = (int) ch - 97;
            
            alphaArray[ascii]++;
            System.out.println(ascii);
            
            if (alphaArray[ascii] > maxFreqChar) {
                maxFreqChar = alphaArray[ascii];
                asciiOfMaxFreq = ascii;
            }
        }

        return asciiOfMaxFreq;
    }

}
