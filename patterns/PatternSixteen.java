package patterns;

public class PatternSixteen {

    public void pattern16(int n) {

        int startChar = 65;
        char printChar;

        for(int i=1; i<=n; i++) {            

            for(int j=1; j<=i; j++) {

                printChar = (char) startChar;
                System.out.print(printChar);

            }

            System.out.println();

            startChar++;

        }

    }
    
}
