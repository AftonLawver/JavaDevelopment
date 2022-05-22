import java.util.Random;

public class Dealer {

    private int die1Value;
    private int die2Value;

    public Dealer() {
        die1Value = 0;
        die2Value = 0;
    }

    public void rollDice() {
        Die die1 = new Die(6);
        Die die2 = new Die(6);

        die1Value = die1.getValue();
        die2Value = die2.getValue();
    }

    public String getChoOrHan() {
        int total = die1Value + die2Value;
        if (total % 2 == 0) {
            return "Even";
        }
        return "Odd";
    }

    public int getDie1Value() {
        return die1Value;
    }

    public int getDie2Value() {
        return die2Value;
    }
}
