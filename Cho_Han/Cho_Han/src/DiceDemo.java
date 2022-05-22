public class DiceDemo {

    public static void main(String[] args) {
        Die myDie = new Die(12);
        System.out.println(myDie.getValue());

        for (int i = 0; i < 10; i++) {
            myDie.roll();
            System.out.println(myDie.getValue());
        }

    }
}
