package patterns;

import java.util.*;

// 1
// 22
// 333
// 4444
// 55555

public class PatternFour {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        int rows = input.nextInt();

        for(int i=1; i<=rows; i++) {

            for(int j=1; j<=i; j++) {

                System.out.print(i);

            }

            System.out.println();

        }

    }

}
