package advance.arrays.medium;

public class PascalTrialngle {
        public int pascalTriangleI(int r, int c) {

        // if(r<3) return 1;

        // int[][] pascalTriangleArr = new int[r][r];

        // pascalTriangleArr[0][0] = 1;
        // pascalTriangleArr[1][0] = 1;
        // pascalTriangleArr[1][1] = 1;

        // for(int i=3; i<=r; i++) {

        //     for(int j=0; j<r; j++) {

        //         if(j==0 || j == i-1) {
        //             pascalTriangleArr[i-1][j] = 1;
        //         } else {
        //             pascalTriangleArr[i-1][j] = pascalTriangleArr[i-2][j-1] + pascalTriangleArr[i-2][j];
        //         }

        //         if(i==r && c == j+1)
        //             return pascalTriangleArr[i-1][j];

        //     }

        // }

        // return -1;

        long res = 1;
        int n = r - 1;
        int k = c - 1;

        // Optimization: C(n, k) == C(n, n - k)
        if (k > n - k) {
            k = n - k;
        }

        for (int i = 0; i < k; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }

        return (int) res;

    }
}
