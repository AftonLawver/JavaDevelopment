public class RoomCarpet {
    private RoomDimension dimensions;
    private double costPerFoot;

    public RoomCarpet(RoomDimension dimensions, double costPerFoot) {
        this.dimensions = new RoomDimension(dimensions);
        this.costPerFoot = costPerFoot;
    }

    public double getTotalCost() {
        return dimensions.getRoomArea() * costPerFoot;
    }

    public String toString() {
        return dimensions + "\n" + "The total carpeting needed is: " +
                dimensions.getRoomArea() + " sq. ft\n" +
                "The total price for this is: $" + this.getTotalCost();
    }
}
