public class Odometer {
    private int currentMileage;
    private int initialMileage;
    private FuelGauge fuelGauge;
    public final int milesPerGallon = 24;
    public final int MAXIMUM_MILEAGE = 999999;


    public Odometer(int currentMileage, FuelGauge fuelGauge) {
        this.currentMileage = currentMileage;
        this.initialMileage = currentMileage;
        this.fuelGauge = fuelGauge;
    }

    public int getCurrentMileage() {
        return this.currentMileage;
    }

    public void incrementMileage() {
        if (this.currentMileage < MAXIMUM_MILEAGE) {
            this.currentMileage ++;
        }
        else {
            this.currentMileage = 0;
        }
        int driven = this.currentMileage - this.initialMileage;
        if (driven % this.milesPerGallon == 0) {
            this.fuelGauge.subtractFuel();
        }
    }






}
