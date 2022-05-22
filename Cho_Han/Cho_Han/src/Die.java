import java.util.Random;

public class Die {
    private int sides;
    private int value;

    public Die(int numSides) {
        this.sides = numSides;
        roll();
    }

    public void roll() {
        Random myRandom = new Random();
        value = myRandom.nextInt(sides) + 1;
    }

    public int getSides() {
        return sides;
    }

    public int getValue() {
        return value;
    }
}
