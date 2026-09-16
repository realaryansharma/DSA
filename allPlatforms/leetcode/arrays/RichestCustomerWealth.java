package allPlatforms.leetcode.arrays;

public class RichestCustomerWealth {

    //1672: Richest Customer Wealth
    public int maximumWealth(int[][] accounts) {

        int maxSum = accounts[0][0], sum=0;

        for(int i=0; i<accounts.length; i++) {

            sum = 0;

            for(int j=0; j<accounts[i].length; j++) {

                sum += accounts[i][j];

            }

            if(sum > maxSum)
                maxSum = sum;

        }

        return maxSum;

    }
}
