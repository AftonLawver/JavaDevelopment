import java.util.Scanner;
public class Player {
    private String name;
    private String guess;
    private int points;

    public Player(String playerName) {
        this.name = playerName;
        guess = "";
        points = 0;
    }

    public void makeGuess() {
        Scanner myScanner = new Scanner(System.in);
        do {
            System.out.println("Make a guess, " + name +" (Even or Odd): ");
            guess = myScanner.next();
        }
        while (!guess.equalsIgnoreCase("Even") && !guess.equalsIgnoreCase("Odd"));
    }

    public void addPoints(int newPoints) {
        this.points = this.points + newPoints;
    }

    public String getName() {
        return name;
    }

    public String getGuess() {
        return guess;
    }

    public int getPoints() {
        return points;
    }
}
