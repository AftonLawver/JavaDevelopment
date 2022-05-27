public class Main {
    public static void main(String[] args) {
        Circle myCircle = new Circle(1);
        Circle mySecondCircle = new Circle(15);

        boolean output = myCircle.greaterThan(mySecondCircle);
        System.out.println(output);
    }
}
