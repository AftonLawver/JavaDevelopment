import java.util.Scanner;
public class ChoHan {

    public static void main(String[] args) {
        final int MAX_ROUNDS = 5;
        String player1Name;
        String player2Name;

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter the first player's name: ");
        player1Name = myScanner.nextLine();
        System.out.println("Enter the second player's name: ");
        player2Name = myScanner.nextLine();

        Dealer dealer = new Dealer();

        Player player1 = new Player(player1Name);
        Player player2 = new Player(player2Name);

        for (int round = 0; round < MAX_ROUNDS; round++) {
            System.out.println("-------------------------");
            System.out.printf("Now playing round %d.\n", round + 1);

            dealer.rollDice();
            player1.makeGuess();
            player2.makeGuess();

            roundResults(dealer, player1, player2);
        }
        displayWinner(player1, player2);
    }

    public static void checkGuess(Player player, Dealer dealer) {
        final int POINTS_TO_ADD = 1;
        String guess = player.getGuess();
        String evenOddResult = dealer.getChoOrHan();

        System.out.printf("The player %s guessed %s.\n", player.getName(), player.getGuess());
        if (guess.equalsIgnoreCase(evenOddResult)) {
            player.addPoints(POINTS_TO_ADD);
            System.out.printf("Awarding point to %s.\n", player.getName());
        }
    }

    public static void displayWinner(Player player1, Player player2) {
        System.out.println("------------------------");
        System.out.println("Game over. Here are the results:");
        System.out.printf("%s: %d point(s).\n",player1.getName(), player1.getPoints());
        System.out.printf("%s: %d point(s).\n",player2.getName(), player2.getPoints());

        if (player1.getPoints() > player2.getPoints()) {
            System.out.printf("%s is the grand winner!", player1.getName());
        }
        else if (player2.getPoints() > player1.getPoints()) {
            System.out.printf("%s is the grand winner!", player2.getName());
        }
        else {
            System.out.println("Both players are tied!");
        }
    }

    public static void roundResults(Dealer dealer, Player player1, Player player2) {
        System.out.printf("The dealer rolled %d and %d.\n", dealer.getDie1Value(), dealer.getDie2Value());
        System.out.printf("Result: %s.\n", dealer.getChoOrHan());

        checkGuess(player1, dealer);
        checkGuess(player2, dealer);
    }
}
