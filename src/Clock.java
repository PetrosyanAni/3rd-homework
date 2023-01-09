import java.util.Scanner;
public class Clock {
    public static void main(String[] args){
        Scanner minutesScanner = new Scanner(System.in);
        int arrowDigit = minutesScanner.nextInt();;
        int minute = arrowDigit * 5;
        System.out.println(minute);
    }
}
