public class StoreSale {

    private String name;
    private String storeAddress;
    private String storeOpenTime;
    private String storeCloseTime;
    private static double discountRate;
    private Product product;

    StoreSale(String name, String storeAddress, String storeOpenTime, String storeCloseTime, Product product) {
        this.name = name;
        this.storeAddress = storeAddress;
        this.storeOpenTime = storeOpenTime;
        this.storeCloseTime = storeCloseTime;
    }

    StoreSale(String name, Product product) {
        this.name = name;
    }

    StoreSale() {

    }

    public String getName() {
        return name;
    }

    public String getStoreAddress() {
        return storeAddress;
    }

    public String getStoreOpenTime() {
        return storeOpenTime;
    }

    public String getStoreCloseTime() {
        return storeCloseTime;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setStoreAddress(String storeAddress) {
        this.storeAddress = storeAddress;
    }

    public void setStoreOpenTime(String storeOpenTime) {
        this.storeOpenTime = storeOpenTime;
    }

    public void setStoreCloseTime(String storeCloseTime) {
        this.storeCloseTime = storeCloseTime;
    }

    public double calculateDiscount(Product myProduct) {
        return (myProduct.getProductOriginalPrice() * discountRate);
    }
    public static void modifyDiscountRate(double newDiscountRate) {
        discountRate = newDiscountRate;
    }


}




