import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Bag<Integer> myBag = new Bag<>(1000);
        Random rand = new Random();
        do{
            int myNumber = rand.nextInt(1000);
            myBag.add(myNumber);
        }while(!myBag.isFull());
        boolean arrayContains7 = myBag.contains(7);
        boolean arrayContains81 = myBag.contains(81);
        boolean arrayContains97 = myBag.contains(97);
        String string1 = String.format("Array contains 7: %b", arrayContains7);
        String string2 = String.format("Array contains 81: %b", arrayContains81);
        String string3 = String.format("Array contains 97: %b", arrayContains97);
        System.out.println(string1 + "\n" + string2 + "\n" + string3);

        // Try to add the number 24 to the full array
        boolean didItAdd = myBag.add(24);
        System.out.println(didItAdd);

        myBag.doubleBagSize();
        boolean tryAddAgain = myBag.add(24);
        System.out.println(tryAddAgain);

        // Remove 5 random elements from the array
        int number1 = myBag.removeRandom();
        int number2 = myBag.removeRandom();
        int number3 = myBag.removeRandom();
        int number4 = myBag.removeRandom();
        int number5 = myBag.removeRandom();

        System.out.println("Numbers removed from the array: ");
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(number4);
        System.out.println(number5);
    }
}
