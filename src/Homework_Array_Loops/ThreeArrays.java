package Homework_Array_Loops;
public class ThreeArrays {
    public static void main(String[] args) {
        int[] arr1 = {4, 5, 8, 6, 1, 2};
        int[] arr2 = {6, 7, 9, 8, 9, 6};
        int[] arr3 = new int[arr1.length];

        int i;
        for (i = 0; i < arr1.length; i++) {
            if ((arr1[i] % 2 != 0) && (arr2[i] % 2 != 0)) {
                arr3[i] = arr1[i];
            } else if ((arr1[i] % 2 == 0) && (arr2[i] % 2 == 0))
                arr3[i] = arr2[i];
            else arr3[i] = 0;
        }

     for (i=0; i<arr3.length;i++){
         System.out.print(arr3[i] + " ");

     }
    }
}

