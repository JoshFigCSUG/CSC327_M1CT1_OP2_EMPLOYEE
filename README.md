# CSC372_M1CT1_OP2_EMPLOYEE
 CSC372_M1CT1_OP2_EMPLOYEE Inheritance example program
## Employee Class
This Java class represents a basic employee entity, storing core attributes like name, ID, and salary. 
It serves as a foundation for building more specialized employee types through inheritance.

## Manager Class
This Java class represents a Manager, a specialized type of Employee with an additional attribute to store their department.

### Inheritance
The Manager class extends the Employee class, inheriting all its fields (firstName, lastName, employeeID, salary) 
and methods (getters, setters, employeeSummary).

## Main.java - Unit Testing for Employee and Manager Classes
This Java code provides basic unit tests to verify the functionality of the Employee and Manager classes. 
It demonstrates how to create objects, set attributes, and utilize the employeeSummary() method for both classes.

### Functionality Tested
#### Employee Class
Creation of Employee objects.
Setting and getting employee attributes (salary, last name).
Output of employee summary using employeeSummary().
#### Manager Class
Creation of Manager objects (inheriting from Employee).
Setting and getting manager-specific attributes (salary, department).
Output of manager summary using the overridden employeeSummary() method (includes department information).
#### How to Run
Make sure you have the Employee.java and Manager.java classes defined and compiled in your project.
Compile and run this Main.java file using a Java compiler/IDE.
### Output
The code will produce output similar to the following:

Employee Summary:
First Name: Jake
Last Name: Farm
Employee ID: 31566
Salary: 0.0

Employee Summary:
First Name: Jake
Last Name: Farm
Employee ID: 31566
Salary: 58000.0

Employee Summary:
First Name: Jake
Last Name: Oyikos
Employee ID: 31566
Salary: 58000.0

Employee Summary:
First Name: Meghan
Last Name: Califa
Employee ID: 11104
Salary: 0.0
Department: HR

Employee Summary:
First Name: Meghan
Last Name: Califa
Employee ID: 11104
Salary: 77000.0
Department: HR

Employee Summary:
First Name: Meghan
Last Name: Califa
Employee ID: 11104
Salary: 77000.0
Department: Prod-Ops
