public class ArrayDemo {
    public static void main(String[] args) {
        int rides[][] = new int[7][];
        rides[0] = new int[10];
        rides[1] = new int[10];
        rides[2] = new int[10];
        rides[3] = new int[10];
        rides[4] = new int[10];
        rides[5] = new int[10];
        rides[6] = new int[2];
        rides[7] = new int[2];

        int i, j;

        for (i = 0; i < 5; i++)
            for (j = 0; j < 10; j++)
                rides[i][j] = i + j + 10;
        for (i = 5; i < 7; i++)
            for (j = 0; j < 2; j++)
                rides[i][j] = i + j + 10;

        System.out.println("Количество пассажиров, перевезенных каждым рейсом, в будние дни недели: ");
        for (i = 0; i < 5; i++)
            for (j = 0; j < 10; j++)
                System.out.println(rides[i][j] + " ");
        System.out.println();

        System.out.println("Количество пассажиров, перевезенных каждым рейсом, в выходные дни недели: ");
        for (i = 5; i < 7; i++)
            for (j = 0; j < 2; j++)
                System.out.println(rides[i][j] + " ");
        System.out.println();

    }

}


