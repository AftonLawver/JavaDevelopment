package classes;

public class ParkingTicket {
	//*******************************************************************************************
	//Constants
	//*******************************************************************************************
	final int ONE_HOUR_IN_MINUTES = 60;
	//*******************************************************************************************
	//Private Declarations
	//*******************************************************************************************
	private int fine;
	//*******************************************************************************************
	//Private Declarations
	//*******************************************************************************************
	//*******************************************************************************************
	//Public Methods
	//*******************************************************************************************
	//Constructor
	ParkingTicket(ParkedCar car, PolliceOfficer police_officer, int illegal_minutes_parked) {
		//reporting ticket information, car, and officer
		this.reportMake(car);
		this.reportModel(car);
		this.reportLicensePlate(car);
		this.reportBadge(police_officer);
		this.reportName(police_officer);
		if(illegal_minutes_parked<=60 && illegal_minutes_parked>=0 ) {
			this.fine = 175;
		}
		else if(illegal_minutes_parked>60) {
			this.fine = 175 + (illegal_minutes_parked / ONE_HOUR_IN_MINUTES) * 25;
		}
		else {
			//there is no over parked minutes
			this.fine = 0;
		}
	}
	//Getter fine
	public int getFine() {
	    return this.fine;
	}
	// Setter fine
	public void setFine(int fine) {
		this.fine = fine;
	}
	
	public String reportMake(ParkedCar car) {
		System.out.println("Car Make:" + car.getMake());
		return "Car Make:" + car.getMake();
	}
	public String reportModel(ParkedCar car) {
		System.out.println("Car Model:" + car.getModel());
		return "Car Model:" + car.getModel();
	}
	public String reportLicensePlate(ParkedCar car) {
		System.out.println("Car Licence Plate:" + car.getLicensePlate());
		return "Car Licence Plate:" + car.getLicensePlate();
	}
	public String reportBadge(PolliceOfficer pollice) {
		System.out.println("Pollice Officer badge number:" + pollice.getBadgeNumber());
		return "Car Model:" + pollice.getBadgeNumber();
	}
	public String reportName(PolliceOfficer pollice) {
		System.out.println("Pollice Officer name:" + pollice.getName());
		return "Car Licence Plate:" + pollice.getName();
	}
}
