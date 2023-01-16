package Multi_Dimensional_Arrays;

public class Homework2 {
    public static void main(String[] args) {
        int[][] newArray = {{3,4}, {10, 4,5,8,9, 5}, {12, 4}, {12, 22}};
        int i;
        int j = 1;
        int biggerArray = 0;
        for (i = 0; i < newArray.length; ) {
            if (newArray[i].length > newArray[j].length) {
                biggerArray = i;
                j++;
            } else {
                biggerArray = j;
                i++;
            }

            if (j == 4) {
                break;
            }

        }
        System.out.println("The biggest Array is " + biggerArray);
    }
}
