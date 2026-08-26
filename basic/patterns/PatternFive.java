package basic.patterns;

import java.util.*;

// *****
// ****
// ***
// **
// *

public class PatternFive {
    
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        int rows;

        rows = input.nextInt();

        for(int i=0; i<rows; i++) {

            for(int j=1; j<rows-i; j++) {

                System.out.print("*");
                
            }  

            System.out.println();

        }

    }

}
