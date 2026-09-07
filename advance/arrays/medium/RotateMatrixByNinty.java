package advance.arrays.medium;

public class RotateMatrixByNinty {
    public void rotateMatrix(int[][] matrix) {
        
        int len = matrix.length - 1, depth, temp;

        depth = matrix.length / 2;

        for(int i=0; i<depth; i++) {

            for (int j = 0; j < len - 2 * i; j++) {

                temp = matrix[i][j+i];

                matrix[i][j+i] = matrix[len-i-j][i];
                matrix[len-i-j][i] = matrix[len-i][len-i-j];
                matrix[len-i][len-i-j] = matrix[j+i][len-i];
                matrix[j+i][len-i] = temp;


            }

        }        

    }
}
