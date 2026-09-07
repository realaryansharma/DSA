package advance.arrays.medium;

public class PascalTriangleTwo {
    public int[] pascalTriangleII(int r) {
        int[] answerRow = new int[r];
        answerRow[0] = 1;

        long prev = 1;

        for (int c = 1; c < r; c++) {
            // next_val = prev * (r - c) / c
            long curr = prev * (r - c) / c;
            answerRow[c] = (int) curr;
            prev = curr;
        }

        return answerRow;
    }
}
