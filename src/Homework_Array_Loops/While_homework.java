package Homework_Array_Loops;

import java.util.Scanner;

public class While_homework {
    public static void main(String[] args) {
        char[] charArray = {'a', 'g', 'd', 'b', 'x', 'j' };
        Scanner charScanner = new Scanner(System.in);
        char inputtedChar = charScanner.next().charAt(0);

        int i = 0;
        while (i < charArray.length) {
            if (inputtedChar == charArray[i]) {
                System.out.println("Your inputted char has been found at index " + i);
                break;
            }
            i++;

            if (i == charArray.length) {
                System.out.println("not found");
            }
        }
    }

}















