package basic.patterns;

import java.util.Scanner;

public class PatternEleven {

    public static void main(String args[]) {


        Scanner input = new Scanner(System.in);

        int n;

        n = input.nextInt();

        int start;

        for(int i=1; i<=n; i++) {

            start = i % 2;

            for(int j=1; j<=i; j++) {

                System.out.print(start + " ");
                start = 1-start;

            }

            System.out.println();

        } 
    }
    
}
