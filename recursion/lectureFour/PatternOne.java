import java.util.Scanner;

public class PatternOne {

    public static void main(String args[]) {

        int count;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the triangle: ");
        count = input.nextInt();

        printTrianglePattern(count);

    }
    
    static void printPatternColumns(int cols) {
        if(cols != 0) {
            System.out.print("* ");
            printPatternColumns(cols - 1);                
        }
    }

    static void printTrianglePattern(int rows) {
        if (rows != 0) {
            printPatternColumns(rows);
            System.out.print("\n");
            printTrianglePattern(rows - 1);
        }
    }
}
