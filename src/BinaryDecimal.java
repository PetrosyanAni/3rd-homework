public class BinaryDecimal {
    public static void main(String[] args) {
        int power = 1;
        int c = 1;
        int f = 0;//last index
        int arr[] = {1, 0, 1, 1, 0, 0, 1};
        for (int j = arr.length - 2; j >= 0; j--, power++) {
            for (int i = 0, num = 2; i < power ; num = num * 2, i++) {
                c = num;
            }
            f = f + (arr[j] * c);
        }
        f += arr[arr.length - 1] * 1;
        System.out.println("final decimal number " + f);
    }
}
