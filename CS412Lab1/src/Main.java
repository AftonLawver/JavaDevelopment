public class Main {
    public static void main(String[] args)
    {
        System.out.println("Product 1 Original price: $19.99");
        System.out.println("Product 2 Original price: $29.99\n");
        StoreSale store1 = new StoreSale();
        StoreSale store2 = new StoreSale();
        System.out.println("Store 1 ---------");
        StoreSale.modifyDiscountRate(0.10);
        store1.calculateDiscount();
        System.out.println("\n");

        System.out.println("Store 2 ---------");
        StoreSale.modifyDiscountRate(0.05);
        store2.calculateDiscount();
        System.out.println("\n");

        StoreSale.modifyDiscountRate(0.12);
        System.out.println("After setting discount rate to 12%\n");
        System.out.println("Store 1 ---------");
        store1.calculateDiscount();
        System.out.println("\n");

        System.out.println("Store 2 ---------");
        store2.calculateDiscount();










    }
}