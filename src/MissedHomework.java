import java.util.Scanner;

// Homework 1: print triangle numbers
public class MissedHomework {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please, input values for triangle sides.");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println("The triangle is possible");
        } else {
            System.out.println("Please, input valid values");
        }

// Homework 2: print month and month days
        System.out.println("Please, input a month number to check the days in the range of 1-12");
        Scanner monthsScanner = new Scanner(System.in);
        int month = monthsScanner.nextInt();
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("The month " + month + " has " + 31 + " days.");
                break;
            case 2:
                System.out.println("The month " + month + " has " + 28 + " days.");
                break;
            case 4, 6, 9, 11:
                System.out.println("The month " + month + " has " + 30 + " days.");
                break;
            default:
                System.out.println("Please, input valid month number");
                break;
        }

        if (month < 1 || month > 12) {
            System.exit(-1);
        }
// Homework 3: verify whether the numbers are divided without a remainder
        int x = 12;
        int y = 2;
        int r = x / y;
        System.out.println(r * y == x);

// Homework 4: find the average.

        int a_1 = 14;
        int b_1 = 51;
        int c_1 = 32;
        int d_1 = 71;
        int e_1 = 12;
        int f_1 = 90;

        double average1 = (double) (a_1 + b_1 + c_1) / 3;
        System.out.println("Average number for a_1,b_1,c_1 is:" + " " + average1);

        double average2 = (double) (d_1 + e_1 + f_1) / 3;
        System.out.println("Average number for d_1,e_1,f_1 is:" + " " + average2);

        int average3 = (int) ((average1 + average2) / 2);
        System.out.println("Average of the two numbers:" + " " + average3);

 //Homework 5: Print the decimal part of the given number.

        double num = 4.45d;
        int newNum = (int) num;
        double finalNum = num - newNum;
        System.out.println(finalNum);

    }
}