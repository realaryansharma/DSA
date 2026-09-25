package allPlatforms.leetcode.arrays;

public class CheckIfPangagram {
    public boolean checkIfPangram(String sentence) {
        
        int indexExtracter = 97;

        int[] freqArr = new int[26];

        for(int i=0; i<sentence.length(); i++) {

            freqArr[(int)sentence.charAt(i) - indexExtracter]++;

        }

        for(int num: freqArr) {
            if(num<1)
                return false;
        }

        return true;
    }
}
