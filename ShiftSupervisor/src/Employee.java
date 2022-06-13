public class Employee {

    private String name;
    private String employeeNumber;
    private String hireDate;

    public Employee(String name, String employeeNumber, String hireDate) {
        this.employeeNumber = employeeNumber;
        this.name = name;
        this.hireDate = hireDate;
    }

    public String getName() {
        return this.name;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public String getHireDate() {
        return hireDate;
    }

    
}
