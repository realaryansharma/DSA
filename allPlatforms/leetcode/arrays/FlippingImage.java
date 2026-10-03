package allPlatforms.leetcode.arrays;

public class FlippingImage {
    
}
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {

        int len = image.length, start, end, temp;

        for(int i=0; i<len; i++) {

            start = 0;
            end = len-1;

            while(start<=end) {

                temp = image[i][start];
                image[i][start] = replaceReverse(image[i][end]);
                image[i][end] = replaceReverse(temp);

                start++;
                end--;

            }

        }

        return image;

    }

    public int replaceReverse(int num) {

        if(num == 0)
            return 1;
        else
            return 0;

    }

}