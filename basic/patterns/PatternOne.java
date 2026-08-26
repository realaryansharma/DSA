package basic.patterns;

import java.util.*;

public class PatternOne {

  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    int rows;

    rows = input.nextInt();

    for(int i=1; i<=rows; i++) {

        for(int j=1; j<=rows; j++) {

            System.out.print("*");

        }

        System.out.println();

    }

  }

}