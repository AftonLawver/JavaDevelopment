public class Product {
    private int productNumber;
    private String brandName;
    private String productSize;
    private double productOriginalPrice;
    private double productSalePrice;

    Product(int productNumber, String brandName, String productSize,float productOriginalPrice, float productSalePrice) {
        this.productNumber = productNumber;
        this.brandName = brandName;
        this.productSize = productSize;
        this.productOriginalPrice = productOriginalPrice;
        this.productSalePrice = productSalePrice;
    }

    Product(int productNumber, double productOriginalPrice) {
        this.productNumber = productNumber;
        this.productOriginalPrice = productOriginalPrice;
    }

    Product() {

    }

    // Getters
    public int getProductNumber() {
        return productNumber;
    }

    public String getBrandName() {
        return brandName;
    }

    public String getProductSize() {
        return productSize;
    }
    public double getProductOriginalPrice() {
        return productOriginalPrice;

    }
    public double getProductSalePrice() {
        return productSalePrice;
    }

    // Setters
    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setProductSize(String productSize) {
        this.productSize = productSize;
    }

    public void setProductOriginalPrice(double productOriginalPrice) {
        this.productOriginalPrice = productOriginalPrice;
    }

    public void setProductSalePrice(double productSalePrice) {
        this.productSalePrice = productSalePrice;
    }
}




