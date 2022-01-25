import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class GraphCircle extends BasisCircle {
    private double xCoordinate;
    private double yCoordinate;

    // Constructors ------------------------
    public GraphCircle(double radius, double x, double y){
        this.RADIUS = radius;
        this.xCoordinate = x;
        this.yCoordinate = y;
    }

    public GraphCircle(){
        this.RADIUS = 1.0;
        this.xCoordinate = 0;
        this.yCoordinate = 0;
    }

    // Getter Methods ----------------------
    public double getXCoordinate() {
        return xCoordinate;
    }

    public double getYCoordinate() {
        return yCoordinate;
    }

    // Setter Methods ----------------------
    public void setXCoordinate(double xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public void setYCoordinate(double yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    // Additional Methods --------------------
    public boolean contains(double x, double y) {
        double myRadius = this.RADIUS;
        // Find the distance from center to point
        double xDistance = pow((x - this.xCoordinate),2);
        double yDistance = pow((y - this.yCoordinate),2);
        double myDistance = sqrt(xDistance + yDistance);
        // if distance from center to point is less than
        // radius return True
        // else return false
        if(myDistance < myRadius) {
            return true;
        } else{
            return false;
        }
    }
}
