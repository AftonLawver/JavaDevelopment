public class FuelGauge {
    private int currentFuel;
    public static int MAXIMUM_GALLONS = 15;

    public FuelGauge(int currentFuel) {
        if (currentFuel <= MAXIMUM_GALLONS) {
            this.currentFuel = currentFuel;
        }
        else {
            this.currentFuel = MAXIMUM_GALLONS;
        }
    }

    public FuelGauge(FuelGauge fuelGaugeObject) {
        this.currentFuel = fuelGaugeObject.currentFuel;
    }

    public int getCurrentFuel() {
        return this.currentFuel;
    }

    public void addFuel(int gallons) {
        if (this.currentFuel < MAXIMUM_GALLONS) {
            this.currentFuel += 1;
        }
        else {
            System.out.println("Fuel Overflowing!");
        }
    }

    public void subtractFuel() {
        if (this.currentFuel > 0) {
            this.currentFuel -= 1;
        }
        else {
            System.out.println("Fuel tank empty!");
        }

    }
}
