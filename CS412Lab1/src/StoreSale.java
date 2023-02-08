public class StoreSale {

    private String name;
    private String storeAddress;
    private String storeOpenTime;
    private String storeCloseTime;
    private static double discountRate;

    private Product product1;
    private Product product2;

    StoreSale(String name, String storeAddress, String storeOpenTime, String storeCloseTime, Product product) {
        this.name = name;
        this.storeAddress = storeAddress;
        this.storeOpenTime = storeOpenTime;
        this.storeCloseTime = storeCloseTime;
    }

    StoreSale() {
        this.product1 = new Product(19.99);
        this.product2 = new Product(29.99);
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

    public void calculateDiscount() {
        product1.setProductSalePrice(product1.getProductOriginalPrice() - (product1.getProductOriginalPrice() * discountRate));
        product2.setProductSalePrice(product2.getProductOriginalPrice() - (product2.getProductOriginalPrice() * discountRate));
        System.out.println("Product 1: " + product1.getProductSalePrice());
        System.out.println("Product 2: " + product2.getProductSalePrice());
    }
    public static void modifyDiscountRate(double newDiscountRate) {
        StoreSale.discountRate = newDiscountRate;
    }


}




