class Solution {    
    public String largeOddNum(String s) {
        int end = s.length() - 1;

        // 1. Find the rightmost odd digit
        while (end >= 0 && (s.charAt(end) - '0') % 2 == 0) {
            end--;
        }

        // If no odd digit exists in the entire string
        if (end < 0) {
            return "";
        }

        // 2. Skip leading zeros
        int start = 0;
        while (start <= end && s.charAt(start) == '0') {
            start++;
        }

        return s.substring(start, end + 1);
    }
}