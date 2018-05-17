public class LogicalOpTable {
    public static void main(String[] args) {
        boolean p, q;

        System.out.println("P\t\tQ\t\tAND\t\tOR\t\tXOR\t\tNOT");

        p = true; q = true;
        System.out.print(p + "\t" + q + "\t");
        if ((p & q)) {
            System.out.print("1\t\t");
        } else
            System.out.print("0\t\t");
        if ((p | q)) {
            System.out.print("1\t\t");
        } else
            System.out.print("0\t\t");
        if ((p ^ q)) {
            System.out.print("1\t\t");
        } else
            System.out.print("0\t\t");
        if (!p) {
            System.out.println("1\t\t");
        } else
            System.out.println("0\t\t");


        p = true; q = false;
        System.out.print(p + "\t" + q + "\t");
        if ((p & q)) {
            System.out.print("1\t\t");
        } else
            System.out.print("0\t\t");
        if ((p | q)) {
            System.out.print("1\t\t");
        } else
            System.out.print("0\t\t");
        if ((p ^ q)) {
            System.out.print("1\t\t");
        } else
            System.out.print("0\t\t");
        if (!p) {
            System.out.println("1\t\t");
        } else
            System.out.println("0\t\t");

        p = false; q = true;
        System.out.print(p + "\t" + q + "\t");
        if ((p & q)) {
            System.out.print("1\t\t");
        } else
            System.out.print("0\t\t");
        if ((p | q)) {
            System.out.print("1\t\t");
        } else
            System.out.print("0\t\t");
        if ((p ^ q)) {
            System.out.print("1\t\t");
        } else
            System.out.print("0\t\t");
        if (!p) {
            System.out.println("1\t\t");
        } else
            System.out.println("0\t\t");

        p = false; q = false;
        System.out.print(p + "\t" + q + "\t");
        if ((p & q)) {
            System.out.print("1\t\t");
        } else
            System.out.print("0\t\t");
        if ((p | q)) {
            System.out.print("1\t\t");
        } else
            System.out.print("0\t\t");
        if ((p ^ q)) {
            System.out.print("1\t\t");
        } else
            System.out.print("0\t\t");
        if (!p) {
            System.out.println("1\t\t");
        } else
            System.out.println("0\t\t");


    }
}
