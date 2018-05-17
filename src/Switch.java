class Switch {
    public static void main(String[] args) {
//        1) double f[]; double[]f;
//        2) int[]f = {1,2,3,4,5};

        double i[] = new double[10];
        double sum = 0;
        for (int k = 1; k < i.length; k++) {
            i[k] = (double) ((k + 2) * 2);
            System.out.println(i[k]);
            sum += i[k];
        }
        double sa = sum / 10;
        System.out.println("среднее :" + sa);
    }
}