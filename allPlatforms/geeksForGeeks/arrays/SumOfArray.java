package allPlatforms.geeksForGeeks.arrays;

public class SumOfArray {
    public int arraySum(int arr[]) {
        // code here
        
        int max=0;
        
        for(int i=0; i<arr.length; i++) {
            
            max += arr[i];
            
        }
        
        return max;
        
    }
}
