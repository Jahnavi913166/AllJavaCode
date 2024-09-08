package com.RevisionSection.Classes;

//Imagine you're building a system for different types of employees in a company.
//Each employee type (e.g., full-time, part-time, contract) has some common properties
abstract class EmployeeData {
    private int employeeId;
    private String name;

    EmployeeData(int employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }
    //calculateSalary()
    //printEmployeeDetails()

    // Abstract method to be implemented by subclasses
    public abstract double calculateSalary();

    //non-abstract method
    public void printEmployeeDetails() {
        System.out.println("EmployeeId: " + getEmployeeId());
        System.out.println("EmployeeName: " + getName());
        System.out.println("Employee Salary $: " + calculateSalary());
    }

}

class FullTimeEmployee extends EmployeeData {
    private double annualSalary;

    FullTimeEmployee(int employeeId, String name, double annualSalary) {
        super(employeeId, name);//parent call
        this.annualSalary = annualSalary;
    }

    @Override
    public double calculateSalary() {
        //Monthly salary
        //annualSalary/12
        return annualSalary / 12;//Monthly salary
    }


}

class PartTimeEmployee extends EmployeeData {
    private double hoursRate;
    private int hourWorked;

    PartTimeEmployee(int employeeId, String name, double hoursRate, int hourWorked) {
        super(employeeId, name);//parent call
        this.hoursRate = hoursRate;
        this.hourWorked = hourWorked;
    }

    @Override
    public double calculateSalary() {
        return hoursRate * hourWorked;
    }


}

class ContractEmployee extends EmployeeData {
    private double contractAmount;

    ContractEmployee(int employeeId, String name, double contractAmount) {
        super(employeeId, name);//parent call
        this.contractAmount = contractAmount;
    }

    @Override
    public double calculateSalary() {
        return contractAmount;
    }
}


public class AbstractClass_CompanyPayRoll {
    public static void main(String[] args) {
        EmployeeData fullTime = new FullTimeEmployee(101, "Jaya Soni", 420000);
        //System.out.println("Monthly salary: " + fullTime.calculateSalary());
        fullTime.printEmployeeDetails();
        System.out.println();

        EmployeeData partTime = new PartTimeEmployee(102, "Ajay Soni", 5000, 5);
        //System.out.println("hours salary: " + partTime.calculateSalary());
        partTime.printEmployeeDetails();
        System.out.println();

        EmployeeData contract = new ContractEmployee(103, "Neha", 150000);
        //System.out.println("contract salary: " + contract.calculateSalary());
        contract.printEmployeeDetails();



I i;
    }

}
