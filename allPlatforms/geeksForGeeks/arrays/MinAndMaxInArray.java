package allPlatforms.geeksForGeeks.arrays;

import java.util.ArrayList;

public class MinAndMaxInArray {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        int max = arr[0], min = arr[0];
        
        ArrayList<Integer> minMaxList = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++) {
            
            min = (arr[i] < min) ? arr[i] : min;
            max = (arr[i] > max) ? arr[i] : max;
            
        }
        
        minMaxList.add(min);
        minMaxList.add(max);
        
        return minMaxList;
            
    }    
}
