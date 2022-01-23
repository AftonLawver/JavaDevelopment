
public class Rectangle {
	
	// Instance Variables
	int length;
	int width;
	int height;
	
	//Constructor
	public Rectangle(int length, int width, int height) {
		this.length = length;
		this.width = width;
		this.height = height;
	}
	
	public int getVolume() {
		return (length * height * width);
	}
	
	public int getSurfaceArea() {
		return(2*(length * width + length * height + width * height));
	}
	
	public boolean isCube() {
		if (length == width && length == height) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Rectangle myRectangle = new Rectangle(5,5,5);
		int volume = myRectangle.getVolume();
		System.out.println(volume);
	}

}
