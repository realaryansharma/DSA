package allPlatforms.leetcode.arrays;

public class CellsWithOddValuesInMatrix {
    
}
class Solution {
    public int oddCells(int m, int n, int[][] indices) {

        int[][] matrix = new int[m][n];
        int countOddNumbers = 0;

        for (int i = 0; i < indices.length; i++) {

            int fixedRowIndex = indices[i][0];
            int fixedColumnIndex = indices[i][1];

            // Increment entire row
            for (int j = 0; j < n; j++) {
                matrix[fixedRowIndex][j]++;
            }

            // Increment entire column
            for (int k = 0; k < m; k++) {
                matrix[k][fixedColumnIndex]++;
            }
        }

        // Count odd values
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (matrix[i][j] % 2 != 0) {
                    countOddNumbers++;
                }
            }
        }

        return countOddNumbers;
    }
}