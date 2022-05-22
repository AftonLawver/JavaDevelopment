public class Animal {

    private int numberOfLegs;
    private int numberOfEyes;
    private String type;

    public Animal(int legs, int eyes, String type) {
        this.numberOfLegs = legs;
        this.numberOfEyes = eyes;
        this.type = type;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }
}
