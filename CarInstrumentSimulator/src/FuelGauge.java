public class FuelGauge {
    private int currentFuel;

    public FuelGauge(int currentFuel) {
        this.currentFuel = currentFuel;
    }

    public int getCurrentFuel() {
        return this.currentFuel;
    }

    public void addFuel(int gallons) {

    }

    public void subtractFuel() {
        this.currentFuel -= 1;
    }
}
