package basic.strings;

public class ValidAnagram {
        public boolean anagramStrings(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        // Check if all character counts returned to 0
        for (int c : count) {
            if (c != 0) {
                return false;
            }
        }

        return true;

    }
}
