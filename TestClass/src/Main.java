public class Main {
    public static void main(String[] args) {
        Stock myStock = new Stock("AAPL", 12.50);

        Stock myNewStock = new Stock("AAPL", 12.50);

        boolean equal = myStock.equals(myNewStock);
        System.out.println(equal);

    }
}
