import java.util.Scanner;

public class SumOfSimple {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter int: ");
        int input = in.nextInt();
        sumOfSimple(input);
    }


    public static void sumOfSimple(int input) {
        int sum = 0;
        for (int i = 1; i < input; i++) {
            int n = 0;
            for (int k = 1; k <= i; k++) {
                if (i % k == 0) {
                    n++;
                }
            }
            if (n == 2)

                sum = sum + i;
        }
        System.out.println(sum);
    }
}
