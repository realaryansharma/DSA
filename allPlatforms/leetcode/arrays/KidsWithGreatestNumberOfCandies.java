package allPlatforms.leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestNumberOfCandies {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        List<Boolean> booleanAnswer = new ArrayList<>();

        int max=candies[0];

        for(int i=0; i<candies.length; i++) {

            if(max < candies[i]) {
                max = candies[i];
            }

        }

        for(int i=0; i<candies.length; i++) {

            if(candies[i] + extraCandies >= max) {

                booleanAnswer.add(true);

            } else {

                booleanAnswer.add(false);

            }

        }

        return booleanAnswer;

    }
    
}
