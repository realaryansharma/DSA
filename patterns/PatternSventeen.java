package patterns;

public class PatternSventeen {
        public void pattern17(int n) {

        int charStart = 65;
        int starRange;

        char printTheChar;

        for(int i=1; i<=n; i++) {

            charStart = 65;            
            starRange = (2*i)-1;

            for(int j=1; j<= n-i; j++) {
                System.out.print(" ");
            }

            for(int j=1; j<=starRange; j++) {

                printTheChar = (char) charStart;

                if(j<=starRange/2) {
                    System.out.print(printTheChar);
                    charStart++;
                } else {
                    System.out.print(printTheChar);
                    --charStart;
                }

            }

            System.out.println();

        }


    }
}
