import java.util.Random;

public class Die {

    private final int SIDES = 6;
    private int value;

    public Die() {
        roll();
    }

    public void roll() {
        Random myRandom = new Random();
        value = myRandom.nextInt(SIDES) + 1;
    }

    public int getValue() {
        return value;
    }
}
