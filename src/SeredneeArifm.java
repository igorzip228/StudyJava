import java.util.Scanner;

public class SeredneeArifm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] myarray = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter " + (i + 1) + " integer: ");
            int input = in.nextInt();
            myarray[i] = input;
        }
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum = sum + myarray[i];
        }
        double seredneArif = sum / 3;
        System.out.println(sum);
        System.out.println(seredneArif);

    }
}

