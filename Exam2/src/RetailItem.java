
public class RetailItem {
	//*******************************************************************************************
	//Private Declarations
	//*******************************************************************************************
	private String description;
	private int unitsOnHand;
	private double price;
	//Constructor
	public RetailItem(String descriptionOfProduct, int units, double pricePerUnit) {
		description = descriptionOfProduct;
		unitsOnHand = units;
		price = pricePerUnit;
	}
	//*******************************************************************************************
	//Public Methods
	//*******************************************************************************************
	// Mutator Methods
	public void setDescription(String descriptor) {
		description = descriptor;
	}
	
	public void setUnits(int units) {
		unitsOnHand = units;
	}
	
	public void setPrice(double priceOfItem) {
		price = priceOfItem;
	}
	
	// Accessor Methods
	public String getDescription() {
		return description;
	}
	
	public int getUnits() {
		return unitsOnHand;
	}
	
	public double getPrice() {
		return price;
	}
	
	
}


