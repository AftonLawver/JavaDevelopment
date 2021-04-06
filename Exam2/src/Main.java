
public class Main {

	public static void main(String[] args) {
		// Create three Retail Item objects
		
		RetailItem item1 = new RetailItem("Jacket", 12, 59.95);
		RetailItem item2 = new RetailItem("Designer Jeans", 40, 24.95);
		RetailItem item3 = new RetailItem("Shirt", 20, 24.95);
		
		// Printing out the objects values to the console
		System.out.println("            " +"Description" + "     " + "Units on Hand" + "     " + "Price");
		System.out.println("-----------------------------------------------------------");
		System.out.println("Item #1" +"      "+ item1.getDescription() + "               " + item1.getUnits() + "          " + item1.getPrice());
		System.out.println("-----------------------------------------------------------");
		System.out.println("Item #2" +"      "+ item2.getDescription() + "       " + item2.getUnits() + "          " + item2.getPrice());
		System.out.println("-----------------------------------------------------------");
		System.out.println("Item #3" +"      "+ item3.getDescription() + "                " + item3.getUnits() + "          " + item3.getPrice());

	}
}
