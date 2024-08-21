public class Main {
    public static void main(String[] args) {
        // Employee object
        Employee employee = new Employee("Jake", "Farm", 31566);
        employee.employeeSummary();
        System.out.println();

        employee.setSalary(58000);
        employee.employeeSummary();
        System.out.println();

        employee.setLastName("Oyikos");
        employee.employeeSummary();
        System.out.println();

    }
}
