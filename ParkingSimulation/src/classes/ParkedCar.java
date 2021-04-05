package classes;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ParkedCar {
	  //*******************************************************************************************
	  //Private Declarations
	  //*******************************************************************************************
      private String make;
	  private String model;
	  private String license_plate; // US plates are between 5-8 letters
	  private String color;
	  private int minutes_in_parking;
	  private int time_parked; // military time format hhMM for example 1920 represents time 19:20, no seconds
	  private int minutes_left; // time left of legal minutes for this car
	  private int minutes_purchased;
	  //*******************************************************************************************
	  //Public Declarations
	  //*******************************************************************************************
	  //*******************************************************************************************
	  //Private Methods
	  //*******************************************************************************************
	  private boolean isCarPlateValid() {
		// check the length
		if (this.license_plate.length() >= 5 && this.license_plate.length() <= 8 ) {
			return true;
		}
		else {
			return false;
		}
	  }
	  //*******************************************************************************************
	  //Public Methods
	  //*******************************************************************************************
	  //Constructor
	  public ParkedCar(String make, String model, String license_plate, String color, int time_parked, int dollars_inserted, int cents_inserted){
		  SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HHmm");
		  ParkingMeter parking_meter;
		  this.make = make;
		  this.model = model;
		  this.license_plate = license_plate;
		  this.color = color;
		  this.time_parked = time_parked;
		  //calculate purchased minutes
		  parking_meter = new ParkingMeter(dollars_inserted, cents_inserted);
		  this.minutes_purchased = parking_meter.getMinutes();
		  //calculate minutes in parking already
		  //using formatted date for calculations 
		  String date = simpleDateFormat.format(new Date());
		  this.minutes_in_parking = this.time_parked - Integer.parseInt(date);
		  //making sure there is no negative minutes present
		  if (this.minutes_in_parking < 0) {
			  this.minutes_in_parking *= -1;
		  }
		  //setting legal minutes left
		  minutes_left = this.minutes_purchased -  this.minutes_in_parking;
	  }
	  // Getter Make
	  public String getMake() {
	    return this.make;
	  }
	  // Setter Make
	  public void setMake(String make) {
	    this.make = make;
	  }
	  // Getter Model
	  public String getModel() {
	    return this.model;
	  }
	  // Setter Model
	  public void setModel(String model) {
	    this.model = model;
	  }
	  // Getter LicensePlate
	  public String getLicensePlate() {
	    return this.license_plate;
	  }
	  // Setter LicensePlate
	  public void setLicensePlate(String license_plate) {
	    this.license_plate = license_plate;
	    if (isCarPlateValid() == true){
	    	System.out.println("Car plate is valid");
	    }
		else {
			System.out.println("Car license is invalid. License set to invalid");
			this.license_plate = "#INVALID";
		}
	  }
	  // Getter Color
	  public String getColor() {
	    return this.color;
	  }
	  // Setter Color
	  public void setColor(String color) {
	    this.color = color;
	  }
	  // Getter MinutesInParking
	  public int getMinutesInParking() {
	    return this.minutes_in_parking;
	  }
	  // Setter MinutesInParking 
	  public void setMinutesInParking(int minutes_in_parking) {
	    this.minutes_in_parking = minutes_in_parking;
	  }
	  // Getter Time_Parked
	  public int getTimeParked() {
	    return this.time_parked;
	  }
	  // Setter Time_Parked
	  public void setTimeParked(int time_parked) {
	    this.time_parked = time_parked;
	  }
	  // Getter Time_Parked
	  public int getMinutesLeft() {
	    return this.minutes_left;
	  }
	  // Setter Time_Parked
	  public void setMinutesLeft(int minutes_left) {
	    this.minutes_left = minutes_left;
	  }
	  // Getter Time_Parked
	  public int getMinutesPurchased() {
	    return this.minutes_purchased;
	  }
	  // Setter Time_Parked
	  public void setMinutesPurchased(int minutes_purchased) {
	    this.minutes_purchased = minutes_purchased;
	  }
	  
	  public String toString(){  
	  return "Make:" + this.make + " ### " + "Model:" + this.model + " ### " + "Licence:" + 
			  this.license_plate + " ### " + "Color:" + this.color + " ### " + "Time parked:" 
			  + String.valueOf(this.time_parked) ;
	 }  
	  
}
