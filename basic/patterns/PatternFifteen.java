package basic.patterns;

public class PatternFifteen {
        public void pattern15(int n) {

        int startChar = 65;
        char printChar;

        for(int i=1; i<=n; i++) {

            startChar = 65;

            for(int j=n; j>=i; j--) {

                printChar = (char) startChar++;
                System.out.print(printChar);

            }

            System.out.println();

        }

    }
}
