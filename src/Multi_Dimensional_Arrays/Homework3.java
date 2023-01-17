package Multi_Dimensional_Arrays;

public class Homework3 {
    public static void main(String[] args) {

        int[] oneDimensArray = {4, 1, 2, 0, 1, 2, 0, 0, 0};
        int i;
        int j = 1;
        int valueFound = 0;
        for (i = 0; i < oneDimensArray.length; ) {
            if (oneDimensArray[i] < oneDimensArray[j]) {
                valueFound++;
            }
            i++;
            j++;
            if (j == oneDimensArray.length) {
                break;
            }
        }
        System.out.println(valueFound + " values were bigger, than the previous one.");
    }
}

