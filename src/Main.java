public class Main {
    public static void main(String[] args) {
        // Homework part 1:

        int c;
        int a = 3;
        int b = 2;
        c = a * a + b * b;
        System.out.println("This is the value for C" + ": " + c);

        // Homework part 2; calculate the area of a trapezoid:

        int base1 = 2;
        int base2 = 4;
        int height = 3;
        int area = ((base1 + base2) / 2) * height;
        System.out.println("This is the area of a trapezoid:" + " " + area);

        // Homework part 3:

        int Num = 789;

        int cc = Num % 10;
        Num = Num / 10;

        int bb = Num % 10;
        Num = Num / 10;

        int aa = Num % 10;

        System.out.println("First digit is: " + aa);
        System.out.println("Second digit is: " + bb);
        System.out.println("Third digit is: " + cc);
    }
}