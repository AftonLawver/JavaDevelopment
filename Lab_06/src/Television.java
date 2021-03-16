/*
 * The purpose of this class is to model a television
 * Afton Lawver 03.16.2021
 */
public class Television {
	
	private final String MANUFACTURER;
	private final int SCREEN_SIZE;
	private boolean powerOn;
	private int channel;
	private int volume;

// Constructor called Television
// Runs every time an object of class Television is created. 
// Purpose is to set the variables to a default (set by us)
// when ever an object is created. 
// Initializes the state of the object created.  
public Television(String mfbrand, int screensize) {
		MANUFACTURER = mfbrand;
		SCREEN_SIZE = screensize;
		powerOn = false;
		volume = 20;
		channel = 2;
		
}

// Accessor methods (getters)
/**
 * This method returns the current value of the volume.
 * @return returns the volume of the tv as an integer. 
 */
public int getVolume() {
	return volume;
}
/**
 * This method returns the current channel that the tv is on.
 * @return returns the channel that the tv is on as an integer.
 */
public int getChannel() {
	return channel;
}
/**
 * This method gets the manufacturer.
 * @return returns the manufacturer brand as a string.
 */
public String getManufacturer() {
	return MANUFACTURER;
}
/**
 * This method gets the screen size of the tv.
 * @return returns the screen size as an integer.
 */
public int getScreenSize() {
	return SCREEN_SIZE;
}

// Mutator methods (setters)
/**
 * This method sets the channel to whatever channel the user wants
 * @param chan takes an integer that the user wants to change the channel to
 */
public void setChannel(int chan) {
	channel = chan;
}
/**
 * This method changes the power to on if it is off
 * or off if it is on.
 */
public void power() {
	powerOn = !powerOn;
}
/**
 * This method increases the current volume by 1.
 */
public void increaseVolume() {
	volume += 1;
} 
/**
 * This method decreases the volume by 1. 
 */
public void decreaseVolume() {
	volume -= 1;
}


}

