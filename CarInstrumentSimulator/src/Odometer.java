public class Odometer {
    private int currentMileage;

    public Odometer(int currentMileage) {
        this.currentMileage = currentMileage;
    }

    public int getCurrentMileage() {
        return this.currentMileage;
    }

    public void incrementMileage(int miles) {
        for (int i = 0; i <= miles; i++) {
            this.currentMileage += 1;
            if (this.currentMileage == 999999) {
                this.currentMileage = 0;
            }
        }
    }






}
