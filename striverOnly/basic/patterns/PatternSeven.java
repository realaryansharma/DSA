package basic.patterns;

import java.util.*;

public class PatternSeven {
    
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        int rows;

        rows = input.nextInt();

        for(int i=1; i<=rows; i++) {

            for(int j=1; j<=rows-i; j++) {

                System.out.print(" ");

            }

            for(int j=1; j<=(2*i)-1; j++) {

                System.out.print("*");

            }

            System.out.println();

        }


    }

}
