package basic.patterns;

public class PatternEighteen {
        public void pattern18(int n) {

        char printChar;
        int charStart = 64;

        for(int i=n; i>=1; i--) {

            for(int j=i; j<=n; j++) {

                printChar = (char)(charStart + j);

                System.out.print(printChar + " ");

            }

            System.out.println();

        }

    }
}
