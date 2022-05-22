public class CellPhone {

    private String manufact;
    private int model;
    private double retailPrice;

    public CellPhone(String manufacturer, int modelNumber, double price) {
        this.manufact = manufacturer;
        this.model = modelNumber;
        this.retailPrice = price;
    }

    public void setManufact(String manufacturer) {
        this.manufact = manufacturer;
    }

    public void setModel(int modelNumber) {
        this.model = modelNumber;
    }

    public void setRetailPrice(double price) {
        this.retailPrice = price;
    }

    public String getManufact() {
        return manufact;
    }

    public int getModel() {
        return model;
    }

    public double getRetailPrice() {
        return retailPrice;
    }
}
