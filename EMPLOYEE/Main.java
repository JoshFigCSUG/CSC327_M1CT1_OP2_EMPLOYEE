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

        // Manager object
        Manager manager = new Manager("Meghan", "Califa", 11104, "HR");
        manager.employeeSummary();
        System.out.println();

        manager.setSalary(77000);
        manager.employeeSummary();
        System.out.println();

        manager.setDepartment("Prod-Ops");
        manager.employeeSummary();
        System.out.println();

    }
}
