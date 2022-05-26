public class Instructor {

    private String lastName;
    private String firstName;
    private String officeNumber;

    public Instructor(String lastName, String firstName, String officeNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.officeNumber = officeNumber;
    }

    public Instructor(Instructor instructorObject) {
        this.lastName = instructorObject.lastName;
        this.firstName = instructorObject.firstName;
        this.officeNumber = instructorObject.officeNumber;
    }

    public void set(String lastName, String firstName, String officeNumber) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.officeNumber = officeNumber;
    }

    public String toString() {
        String output = "Instructor First name: " + this.firstName + "\n"+
        "Instructor Last name: " + this.lastName + "\n" +
        "Instructor Office number: " + this.officeNumber;

        return output;
    }
}
