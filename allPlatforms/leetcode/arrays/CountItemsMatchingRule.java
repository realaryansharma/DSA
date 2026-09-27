package allPlatforms.leetcode.arrays;

import java.util.List;

public class CountItemsMatchingRule {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        
        int countOfItems = 0;
        int ruleKeyIndex = 0;
        
        switch(ruleKey) {

            case "type":
                ruleKeyIndex=0;
                break;
            case "color":
                ruleKeyIndex=1;
                break;
            case "name":
                ruleKeyIndex=2;
                break;

        }

        for(List<String> item : items) {

            if(item.get(ruleKeyIndex).equals(ruleValue)) {

                countOfItems++;

            }

        }

        return countOfItems;

    }
}
