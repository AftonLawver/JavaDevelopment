public class Main {

    public static void main(String[] args) {
        RoomDimension myRoom = new RoomDimension(10, 10);
        RoomCarpet myCarpet = new RoomCarpet(myRoom, 1.00);
        String output = myCarpet.toString();
        System.out.println(output);
    }
}
