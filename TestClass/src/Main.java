public class Main {
    public static void main(String[] args) {
        String name = "Afton";
        String anotherName = "Afton";
        System.out.println("Are they pointing to the same object in memory? ");
        System.out.printf("Before change: %b \n", name == anotherName);
        anotherName = new String("Afton");

        System.out.printf("After change: %b \n", name == anotherName);

    }
}
