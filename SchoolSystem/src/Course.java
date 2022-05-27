public class Course {

    private String courseName;
    private Instructor instructor;
    private TextBook textBook;

    public Course(String courseName, Instructor instructor, TextBook textBook) {
        this.courseName = courseName;
        this.instructor = new Instructor(instructor);
        this.textBook = new TextBook(textBook);
    }

    public String getName() {
        return courseName;
    }

    public Instructor getInstructor() {
        return new Instructor(this.instructor);
    }

    public TextBook getTextBook() {
        return new TextBook(this.textBook);
    }

    public String toString() {
        return "Course name: " + this.courseName + "\n" +
                "Instructor Information: \n" + this.instructor + "\n" +
                "TextBook Information: \n" + this.textBook;
    }
}
