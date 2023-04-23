public class Customer implements java.io.Serializable {
    private int id;
    private String firstname, lastname, branch, email;
    public int getId() { return id; }
    public String getfName() { return firstname; }
    public String getlName() { return lastname; }
    public void setID(int id) { this.id = id; }
    public void setfName(String name) { this.firstname = name; }
    public void setlName(String name) { this.lastname = name; }
}

