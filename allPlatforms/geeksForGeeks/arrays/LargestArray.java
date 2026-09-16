package allPlatforms.geeksForGeeks.arrays;

public class LargestArray {
    public static int largest(int[] arr) {
        // code here
        
        int max = arr[0];
        
        for(int i=0; i<arr.length; i++) {
            
            max = (arr[i] > max) ? arr[i] : max;
            
        }
        
        return max;
        
    }
}
