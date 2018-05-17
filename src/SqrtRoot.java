public class SqrtRoot {
    public static void main(String[] args) {

        Vehicle minovan = new Vehicle(7,16, 21);
        Vehicle sportcar = new Vehicle(2,14,12);

        double gallons;
        int dist = 252;

        gallons = minovan.fuelneeded(dist);
        System.out.println("Для преодоления " + dist + " миль фургону понадобится " + gallons + " топлива");

        gallons = sportcar.fuelneeded(dist);
        System.out.println("Для преодоления " + dist + " миль спорткару понадобится " + gallons + " топлива");

    }


    static class Vehicle {
        int passengers;
        int fuelcup;
        int mpg;

        Vehicle(int p, int f, int m){
            passengers = p;
            fuelcup = f;
            mpg = m;
        }

        double fuelneeded (int miles) {
            return (double) miles / mpg;
        }
    }
}
