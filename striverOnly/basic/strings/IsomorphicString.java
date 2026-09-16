package basic.strings;

public class IsomorphicString {
    class Solution {
    public boolean isomorphicString(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] map = new char[256];
        boolean[] visited = new boolean[256];

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            // Case 1: charS has already been mapped before
            if (map[charS] != 0) {
                if (map[charS] != charT) {
                    return false;
                }
            } 
            // Case 2: charS is seen for the first time
            else {
                // If charT is already taken by another character
                if (visited[charT]) {
                    return false;
                }
                
                // Establish new mapping
                map[charS] = charT;
                visited[charT] = true;
            }
        }

        return true;
    }
}
}
