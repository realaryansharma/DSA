package patterns;

import java.util.*;

// 12345
// 1234
// 123
// 12
// 1

public class PatternSix {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        int rows;

        rows = input.nextInt();

        for(int i=0; i<rows; i++) {
            for(int j=1; j<=rows-i; j++) {

                System.out.print(j);

            }

            System.out.println();

        }

    }
    
}
