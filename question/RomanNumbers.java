import java.util.Scanner;

public class RomanNumbers {
    
    public static void main(String args[]) {

        int num;
        String romanNum = "";

        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        num = input.nextInt();

        romanNum = convertNumIntoRoman(num);

        System.out.print("After conversion: ");
        System.out.print(romanNum + '\n');

    }

    static String convertNumIntoRoman(int num) {

        int[] values = {1, 5, 10, 50, 100, 500, 1000};
        String[] romanStrings = {"I", "V", "X", "L", "C", "D", "M"};
        String ans = "";

        int count = 1, findRoman = 1, bottom = 1, top = 1, countIndex = 1, sum = 0;

        while(num >= 1) {

            findRoman = num % 10;
            findRoman *= count;

            //find the ranging two elements
            for(int i = 0; i<values.length; i++) {
                if(count == values[i])
                    countIndex = i;
                if(findRoman <= values[i]) {
                    top = i;
                    bottom = i-1;
                    break;
                }
            }
              
            if (values[top]==findRoman) {
                ans=romanStrings[top] + ans;
            }
            else if (values[bottom] == findRoman) {
                ans=romanStrings[bottom] + ans;
            }
            else if((values[top]-values[countIndex]) == findRoman) {
                ans = romanStrings[countIndex] + romanStrings[top] + ans;
            }
            else {
                sum = values[bottom];
                for (int i = 0; i < 3; i++) {
                    sum += values[countIndex];
                    if (sum == findRoman) {
                        for (int j = 0; j <= i; j++) {
                            ans = romanStrings[countIndex] + ans;
                        }
                        break;
                    }
                }
                ans = romanStrings[bottom] + ans;
            }

            num = num / 10;
            count *= 10;
            sum = 0;
            
        }

        return ans;

    }

}
