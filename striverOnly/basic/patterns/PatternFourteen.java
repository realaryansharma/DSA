package basic.patterns;

import java.util.*;

public class PatternFourteen {
    
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        int rows=1;

        char test = 1;

        System.out.print("Test: ");
        System.out.print(test);

        while(test!='A') {
            test = (char) rows;
            System.out.print("count" + rows + "\n");

            rows++;
        }

    }

}
