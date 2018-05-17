public class MatrixPrint {
    public static void main(String[] args) {
        int i, n, m = 1;
        int size = 5;
        for (i = 0; i < size; i++) {
            for (n = 0; n < size; n++) {
                if (i == n || n == (4 - i)) {
                    System.out.print("  *");
                } else {
                    System.out.format("%3d", m);
                }
                m++;
            }
            System.out.println();
        }
    }
}
