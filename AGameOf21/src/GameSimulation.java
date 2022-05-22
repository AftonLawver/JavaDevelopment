import java.util.Objects;
import java.util.Scanner;

public class GameSimulation {

    public static void main(String[] args) {
        Die die1 = new Die();
        Die die2 = new Die();
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String playerName = keyboard.nextLine();

        Player user = new Player(playerName);
        Player computer = new Player("Computer");

        System.out.printf("Welcome to A Game of 21, %s!\n", playerName);
        computer.addPoints(die1.getValue(), die2.getValue());
        die1.roll();
        die2.roll();
        user.addPoints(die1.getValue(), die2.getValue());
        boolean play;
        String playGame;
        System.out.printf("Your score right now is: %d\n", user.getScore());
        System.out.println("Would you like to roll the dice? (Y or N) ");
        playGame = keyboard.nextLine();
        if (Objects.equals(playGame, "Y") || Objects.equals(playGame, "y")) {
            play = true;
        }
        else {
            play = false;
        }

        while (play && user.getScore() <= 21) {
            die1.roll();
            die2.roll();
            computer.addPoints(die1.getValue(), die2.getValue());
            die1.roll();
            die2.roll();
            user.addPoints(die1.getValue(), die2.getValue());

            System.out.printf("Your score right now is: %d\n", user.getScore());
            if (user.getScore() > 21) {
                System.out.println("You went over 21.");
                break;
            }
            System.out.println("Would you like to roll the dice? (Y or N) ");
            playGame = keyboard.nextLine();
            if (Objects.equals(playGame, "Y") || Objects.equals(playGame, "y")) {
                play = true;
            }
            else {
                play = false;
            }
        }
        System.out.printf("%s, your score is: %d\n", user.getName(), user.getScore());
        System.out.printf("%s, your score is: %d\n", computer.getName(), computer.getScore());
        if (computer.getScore() > 21 && user.getScore() > 21) {
            System.out.println("Both players went over 21. No winner.");
        }
        else if (computer.getScore() > 21 && user.getScore() <= 21) {
            System.out.println("You won, congrats!");
        }
        else if (user.getScore() > 21 && computer.getScore() <= 21) {
            System.out.println("You lost, sorry!");
        }
        else {
            if (user.getScore() > computer.getScore()) {
                System.out.println("You won, congrats!");
            }
            else {
                System.out.println("You lost, sorry!");
            }
        }


    }
}
