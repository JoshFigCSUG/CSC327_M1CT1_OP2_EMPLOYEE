public class Manager extends Employee {
    
    private String department;

    // Constructor
    public Manager(String firstName, String lastName, int employeeID, String department) {
        super(firstName, lastName, employeeID); // Pass parameters to the superclass constructor
        this.department = department;
    }

    // Setter for the department field
    public void setDepartment(String department) {
        this.department = department;
    }

}
