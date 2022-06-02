public class Main {

    public static void main(String[] args) {
        FuelGauge myFuelGauge = new FuelGauge(15);
        Odometer myOdometer = new Odometer(999998, myFuelGauge);

        int output = myOdometer.getCurrentMileage();
        System.out.println("Current mileage is: " + output);
        int currentFuel0 = myFuelGauge.getCurrentFuel();
        System.out.println("Current fuel: " + currentFuel0);

        for (int i = 1; i <= 100; i++) {
            myOdometer.incrementMileage();
        }
        int currentMileage = myOdometer.getCurrentMileage();
        System.out.println("Current mileage: " + currentMileage);
        int currentFuel = myFuelGauge.getCurrentFuel();
        System.out.println("Current fuel: " + currentFuel);

        for (int i = 1; i <= 150; i++) {
            myOdometer.incrementMileage();
        }
        int currentMileage2 = myOdometer.getCurrentMileage();
        System.out.println("Current mileage: " + currentMileage2);
        int currentFuel2 = myFuelGauge.getCurrentFuel();
        System.out.println("Current fuel: " + currentFuel2);
    }
}
