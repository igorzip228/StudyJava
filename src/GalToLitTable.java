class GalToLitTable {
    public static void main(String[] args) {
        double duym, meters;
        int counter = 0;

        // 1 m = 39,37d 1f = 12 d 1 m = 39.37/12 d

        for (meters = 1; meters <= 12 * 12; meters++) {
            duym = 39.37 * meters;
            System.out.println(meters + " метрам соответствует " + duym + " дюймов.");
            counter++;
            if (counter == 12) {
                System.out.println();
                counter = 0;
            }
        }

    }
}
