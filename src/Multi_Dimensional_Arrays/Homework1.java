package Multi_Dimensional_Arrays;
public class Homework1 {
    public static void main(String[] args) {
        int[][] integers = {{3, 5, 7}, {10, 2, 9}, {12, 45, 4}, {12, 22, 55}};
        int i;
        int j;
        for (i = 0; i < integers.length; i++) {
            for (j = 0; j < integers[i].length; j++) {

                System.out.println("first element:" + integers[i][j] + " ");
                System.out.println("last element:" + integers[i][integers[1].length - 1] + " ");
                break;
            }
            System.out.println();
        }
    }
}