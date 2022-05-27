public class Main {

    public static void main(String[] args) {
        Instructor myInstructor = new Instructor("Jones", "Sadik", "A209");

        TextBook myTextBook = new TextBook("Starting out with Java","Gaddis", "Pearson");

        Course myCourse = new Course("Intro to Java", myInstructor, myTextBook);

        System.out.println(myCourse);
    }
}
