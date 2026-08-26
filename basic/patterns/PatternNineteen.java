package basic.patterns;

public class PatternNineteen {

        public void pattern19(int n) {
        // 1st Half: Top half (shrinking stars, growing spaces)
        for (int i = 0; i < n; i++) {
            // Stars: n-i
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            // Spaces: 2*i
            for (int k = 1; k <= 2 * i; k++) {
                System.out.print(" ");
            }
            // Stars: n-i
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2nd Half: Bottom half (growing stars, shrinking spaces)
        for (int i = 1; i <= n; i++) {
            // Stars: i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Spaces: 2 * (n - i)
            for (int k = 1; k <= 2 * (n - i); k++) {
                System.out.print(" ");
            }
            // Stars: i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
