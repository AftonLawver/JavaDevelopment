public class BasisCircle {
    protected double RADIUS;
    protected double pi = 3.14159;

    public BasisCircle(double radius){
        this.RADIUS = radius;
    }

    public BasisCircle(){
        RADIUS = 1.0;
    }

    public double getRadius(){
        return this.RADIUS;
    }

    public void setRadius(double radius){
        this.RADIUS = radius;
    }

    public double getDiameter(){
        return this.RADIUS * 2;
    }

    public double getArea(){
        return pi * (this.RADIUS * this.RADIUS);
    }

    public double getPerimeter(){
        return 2 * pi * this.RADIUS;
    }
}

