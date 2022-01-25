public class Main {
    public static void main(String[] args) {
        GraphCircle c = new GraphCircle(2.5, 2,0);
        boolean contains = c.contains(4,0);
        System.out.println(contains);
    }
}
