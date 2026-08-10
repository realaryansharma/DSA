package patterns;

import java.util.*;

// 1
// 12
// 123
// 1234
// 12345

public class PatternThree {

    public static void main(String argsp[]) {

        Scanner input = new Scanner(System.in);
        int rows;

        rows = input.nextInt();

        for(int i=1; i<rows; i++) {

            for(int j=1; j<=i; j++) {

                System.out.print(j);

            }

            System.out.println();

        }

    }
    
}
