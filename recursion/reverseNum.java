import java.util.Scanner;

public class reverseNum {

    public static void main(String args[]) {

        int num, reverseNum, placeValue;

        Scanner input  = new Scanner(System.in);

        System.out.print("Enter a number to reverse: ");
        num = input.nextInt();

        placeValue = maxPlaceValue(num, 1);
        System.out.println("placeValue: " + placeValue);
        reverseNum = reverseAnInteger(num, placeValue);

        System.out.println("Reverse Number: " + reverseNum);

    }

    static int reverseAnInteger(int num, int placeValue) {

        int add;

        if(num<1)
            return 0;
        
        add = (num%10) * placeValue;
        
        return add + reverseAnInteger(num/10, placeValue/10);

    }

    static int maxPlaceValue(int num, int place) {
        if(num < 10)
            return place;
        return maxPlaceValue(num / 10, place * 10);
    }
    
}
