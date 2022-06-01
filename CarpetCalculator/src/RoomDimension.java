public class RoomDimension {
    private double roomLength;
    private double roomWidth;

    public RoomDimension(double roomLength, double roomWidth) {
        this.roomLength = roomLength;
        this.roomWidth = roomWidth;
    }

    public RoomDimension(RoomDimension roomDimensionObject) {
        this.roomLength = roomDimensionObject.roomLength;
        this.roomWidth = roomDimensionObject.roomWidth;
    }

    public double getRoomArea() {
        return roomLength * roomWidth;
    }

    public String toString() {
        return "The Dimensions of the room are: \n" +
                "Room width: " + roomWidth + "feet\n" +
                "Room length: " + roomLength + "feet\n";
    }
}
