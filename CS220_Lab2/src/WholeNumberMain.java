import java.util.Scanner;

public class WholeNumberMain {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please provide a number: ");
        int value = myScanner.nextInt();

        WholeNumber myWholeNumber = new WholeNumber(value);
        int myNumber = myWholeNumber.getValue();
        System.out.printf("Original number: %d%n", myNumber);

        System.out.print("Do you want to change the number?: ");
        String changeNumber = myScanner.next();
        if (changeNumber.equalsIgnoreCase("yes")) {
            System.out.print("Please provide a number: ");
            int changeNumberTo = myScanner.nextInt();
            myWholeNumber.setValue(changeNumberTo);
        }

        int myNewNumber = myWholeNumber.getValue();
        System.out.printf("New number: %d%n", myNewNumber);

        boolean isPrime = myWholeNumber.isPrime();
        System.out.printf("Is number prime? : %b%n", isPrime);

        boolean isEven = myWholeNumber.isEven();
        System.out.printf("Is number even? : %b%n", isEven);

        boolean isOdd = myWholeNumber.isOdd();
        System.out.printf("Is number odd?: %b%n", isOdd);

        int squaredValue = myWholeNumber.getSquaredValue();
        System.out.printf("Squared value: %d%n", squaredValue);

        double sqrtValue = myWholeNumber.getSquareRootValue();
        System.out.printf("Square root value: %f%n", sqrtValue);

        System.out.print("Check if number is divisible by: ");
        int divisibleBy = myScanner.nextInt();
        boolean isDivisibleBy = myWholeNumber.isDivisibleByInput(divisibleBy);
        System.out.printf("Is %d divisible by %d: %b%n", myWholeNumber.getValue(), divisibleBy, isDivisibleBy);

        System.out.print("Check if number is equals: ");
        int equalsNumber = myScanner.nextInt();
        boolean equals = myWholeNumber.equalsInput(equalsNumber);
        System.out.printf("Does %d equal %d: %b%n", myWholeNumber.getValue(), equalsNumber, equals);

        boolean isPerfectSquare = myWholeNumber.isPerfectSquare();
        System.out.printf("Is number a perfect square?: %b%n", isPerfectSquare);








    }
}
