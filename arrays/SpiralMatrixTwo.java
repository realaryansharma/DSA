
import java.util.Scanner;

public class SpiralMatrixTwo {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        int n;

        System.out.print("Enter the value of n: ");

        n = input.nextInt();

        int[][] ans = new int[n][n];

        ans = generateSpiralMatrix(n, ans);

        System.out.println("============================================");
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println(); // Move to the next row
        }

    }

    static int[][] generateSpiralMatrix(int n, int[][] arr) {

        int numOfEle = n * n;

        int s = 0, e = 0, boundl = 0, count = 1;

        while (count <= numOfEle) {

            System.out.println("s=" + s + " e=" + e + " count=" + count + " boundl=" + boundl + " n=" + n);
            for (int i = e; i < n; i++) {
                if (count <= numOfEle) {
                    System.out.println("For " + s + " " + i + ": " + count);
                    arr[s][i] = count++;
                    e = i;
                } else {
                    break;
                }
            }
            s++;
            System.out.println("s=" + s + " e=" + e + " count=" + count + " boundl=" + boundl + " n=" + n);
            for (int j = s; j < n; j++) {
                if (count <= numOfEle) {
                    System.out.println("For " + j + " " + e + ": " + count);
                    arr[j][e] = count++;
                    s = j;
                } else {
                    break;
                }

            }
            e--;
            System.out.println("s=" + s + " e=" + e + " count=" + count + " boundl=" + boundl + " n=" + n);
            for (int k = e; k > boundl; k--) {
                if (count <= numOfEle) {
                    System.out.println("For " + s + " " + k + ": " + count);
                    arr[s][k] = count++;
                    e--;
                } else {
                    break;
                }

            }
            System.out.println("s=" + s + " e=" + e + " count=" + count + " boundl=" + boundl + " n=" + n);
            boundl++;
            for (int l = s; l > boundl; l--) {
                if (count <= numOfEle) {
                    System.out.println("For " + l + " " + e + ": " + count);
                    arr[l][e] = count++;
                    s--;
                } else {
                    break;
                }

            }
            System.out.println("s=" + s + " e=" + e + " count=" + count + " boundl=" + boundl + " n=" + n);
            n--;
        }

        return arr;

    }

}
