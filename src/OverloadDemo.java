class Overload {
    void ovlDemo() {
        System.out.println("Без параметров");
    }

    void ovlDemo(int a) {
        System.out.println("Один параметр: " + a);
    }

    int ovlDemo(int a, int b) {
        System.out.println("Два параметра : " + a + " " + b);
        return a + b;
    }

    double ovlDemo(double a, double b) {
        System.out.println("Два параметра типа double: " + a + " " + b);
        return a + b;
    }
}


public class OverloadDemo {
    public static void main(String[] args) {
        Overload ob = new Overload();
        int resI;
        double resD;

        ob.ovlDemo();
        System.out.println();

        ob.ovlDemo(2);
        System.out.println();

        resI = ob.ovlDemo(4, 6);
        System.out.println("Результат вызова ob.ovlDemo(4, 6) : " + resI);
        System.out.println();

        resD = ob.ovlDemo(1.1, 2.32);
        System.out.println("Результат вызова ob.ovlDemo(1.1, 2.32) : " + resD);


    }

}
