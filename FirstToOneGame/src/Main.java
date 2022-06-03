public class Main {
    public static void main(String[] args) {

        Player player1 = new Player("Afton");
        Player player2 = new Player("Alliyah");

        Die gameDie = new Die();

        int round = 1;
        while (!player1.isWinner() && !player2.isWinner()) {
            String output1 = player1.toString();
            String output2 = player2.toString();
            System.out.println(output1);
            System.out.println(output2);

            gameDie.roll();
            int value1 = gameDie.getValue();
            player1.subtractPoints(value1);
            System.out.println("Afton rolled " + value1);

            gameDie.roll();
            int value2 = gameDie.getValue();
            player2.subtractPoints(value2);
            System.out.println("Alliyah rolled " + value2);

            System.out.printf("After round %d:\n", round);
            round++;
        }
        System.out.println("\nFinal Score:");
        String output1 = player1.toString();
        String output2 = player2.toString();
        System.out.println(output1);
        System.out.println(output2);

        if (player1.isWinner()) {
            System.out.printf("Congratulations, you won %s!", player1.getName());
        }
        else {
            System.out.printf("Congratulations, you won %s!", player2.getName());
        }


    }


}
