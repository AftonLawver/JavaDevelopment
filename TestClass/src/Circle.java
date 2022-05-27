public class Circle {
    private double radius;

    public Circle(double r)
    {
        radius = r;
    }
    public double getArea()
    {
        return Math.PI * radius * radius;
    }
    public double getRadius()
    {
        return radius;
    }

    public String toString() {
        return "Circle radius: " + getRadius() +
                "\n" + "Circle area: " + getArea();
    }

    public boolean equals(Circle circleObject) {
        if (getArea() == circleObject.getArea() && radius == circleObject.getRadius()) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean greaterThan(Circle circleObject) {
        if (getArea() > circleObject.getArea()) {
            return true;
        }
        else {
            return false;
        }
    }
}
