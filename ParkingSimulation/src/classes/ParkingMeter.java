package classes;

public class ParkingMeter {
	//*******************************************************************************************
	//Constants
	//*******************************************************************************************
	final static int ONE_DOLLAR_VALUE_MINUTES = 30; // one hour=2$, 30min = 1$
	//*******************************************************************************************
	//Private Declarations
	//*******************************************************************************************
	private int minutes_purchased = 0; 
	//*******************************************************************************************
	//Public Declarations
	//*******************************************************************************************
	//*******************************************************************************************
	//Private Methods
	//*******************************************************************************************
	private void purchasedMinutes(int dollars, int cents) {
		//calculate minutes round them up
		int total_cash = dollars + cents;
		double minutes = total_cash * ONE_DOLLAR_VALUE_MINUTES;
		this.minutes_purchased = (int) Math.ceil(minutes);
	}
	private void purchasedMinutes(int dollars) {
		//calculate minutes
		double minutes = dollars / ONE_DOLLAR_VALUE_MINUTES;
		//round them up
		this.minutes_purchased = (int) Math.ceil(minutes);
	}
	//*******************************************************************************************
	//Constructor
	//*******************************************************************************************
	ParkingMeter(int dollars, int cents){
		this.purchasedMinutes(dollars, cents);
	}	
	//*******************************************************************************************
	//Public Methods
	//*******************************************************************************************	
	// Getter minutes_purchased
	public int getMinutes() {
	  return this.minutes_purchased;
	}
	// Setter minutes_purchased
	public void setMinutes(int minutes_purchased) {
	  this.minutes_purchased = minutes_purchased;
	}
}
