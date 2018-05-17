class Factorial {
    int factR (int n) {
        int result;

        if (n == 1) return 1;
        result = factR(n-1) * n;
        return result;
    }

    int facrI(int n) {
        int t, result;

        result = 1;
        for (t = 1; t <= n; t++) result *= t;
        return result;
    }
}

public class Recursion {
    public static void main(String[] args) {
        Factorial f = new Factorial();

        System.out.println("Вычисление рекурсивным методом");
 //       System.out.println("Факториал 3 равер " + f.factR(3));
        System.out.println("Факториал 4 равер " + f.factR(4));
//        System.out.println("Факториал 5 равер " + f.factR(5));
 //       System.out.println();
//
//        System.out.println("Вычисление интеративным методом");
//        System.out.println("Факториал 3 равер " + f.facrI(3));
//        System.out.println("Факториал 4 равер " + f.facrI(4));
//        System.out.println("Факториал 5 равер " + f.facrI(5));
    }
}
