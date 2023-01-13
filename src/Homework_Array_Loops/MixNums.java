package Homework_Array_Loops;

public class MixNums {
    public static void main(String[] args) {
        int[] mixArray = {-8, 5, -3, -7, 8, 10};
        int i;
        int n = 0;
        for (i = 0; i < mixArray.length; i++) {
            if (mixArray[i] < 0) {
                mixArray[i] *= -1;
                n++;
            }
        }
        System.out.println(n + " times the negative number has been changed");
        System.out.println("New values of mixArray " + mixArray[0] + mixArray[1] + mixArray[2] + mixArray[3] +
                mixArray[4] + mixArray[5]);
        System.out.println( "Total number of positive values " + (mixArray.length - n));
    }
}
