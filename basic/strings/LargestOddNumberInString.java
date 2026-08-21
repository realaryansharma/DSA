package basic.strings;

public class LargestOddNumberInString {
    public String largeOddNum(String s) {
        //your code goes here
        long checkNum, max=-1;

        if(s.equals("0"))
            return "";

        //multi loop 0 to length-1
        //loop i to length -1, get substring and check if odd, then update max number if needed

        for(int i=0; i<s.length(); i++) {

            for(int j=i+1; j<=s.length(); j++) {

                checkNum = Integer.parseInt(s.substring(i, j));

                if(checkNum%2 != 0 && checkNum > max) {
                    max = checkNum;
                }

            }

        }

        return String.valueOf(max);

    }
}
