package classes;

public class PolliceOfficer {
	//*******************************************************************************************
	//Constants
	//*******************************************************************************************
	//*******************************************************************************************
	//Private Declarations
	//*******************************************************************************************
	private String badgeNumber;
	private String name;
	//*******************************************************************************************
	//Public Declarations
	//*******************************************************************************************
	//*******************************************************************************************
	//Private Methods
	//*******************************************************************************************
	//*******************************************************************************************
	//Public Methods
	//*******************************************************************************************
	//Constructor
	public PolliceOfficer(String badgeNumber, String name){
		this.badgeNumber = badgeNumber;
		this.name = name;
	}
	
	// Getter Badge
	public String getBadgeNumber() {
	  return this.badgeNumber;
	}
	// Setter Badge
	public void setBadgeNumber(String badgeNumber) {
	  this.badgeNumber = badgeNumber;
	}
	// Getter Name
	public String getName() {
	  return this.name;
	}
	// Setter Name
	public void setName(String name) {
	  this.name = name;
	}
	//Returns 
	public int issueParkingTicket(ParkedCar car) {
		//generating parking ticket
		ParkingTicket parking_ticket;
		int ticket_in_dollars = 0;
		int minutes_overparked = car.getMinutesLeft(); 
		// Examine how many minutes are left (if any)
		// minutes overparked will be negative
		if (minutes_overparked <= 0) {
			parking_ticket = new ParkingTicket(car, this, (-1)*minutes_overparked);
		}
		else
		{
			// -1 means there is no minutes overparked
			parking_ticket = new ParkingTicket(car, this, -1);
		}
		ticket_in_dollars = parking_ticket.getFine();
		return ticket_in_dollars;
	}
	
}
