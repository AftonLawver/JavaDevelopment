public class Main {
    public static void main(String[] args)
    {
        Product product1 = new Product(1, 19.99);
        Product product2 = new Product(2, 29.99);
        StoreSale store1 = new StoreSale();
        StoreSale store2 = new StoreSale();
        store1.modifyDiscountRate(0.10);
        store2.modifyDiscountRate(0.05);
        System.out.println("Sale Price of product 1");
        product1.setProductSalePrice(product1.getProductOriginalPrice() - store1.calculateDiscount(product1));
        System.out.println(product1.getProductSalePrice());
        System.out.println("Sale Price of product 2");
        product2.setProductSalePrice(product2.getProductOriginalPrice() - store2.calculateDiscount(product2));
        System.out.println(product2.getProductSalePrice());
    }
}