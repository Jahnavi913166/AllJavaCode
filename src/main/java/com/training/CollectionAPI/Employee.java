package com.training.CollectionAPI;

import java.util.Objects;

public class Employee implements Comparable<Employee> {
    private int empId;
    private String empName;
    private long salary;
    private String jobRole;

    Employee(int empId, String name, long sal, String jobRole) {
        this.empId = empId;
        this.empName = name;
        this.salary = sal;
        this.jobRole = jobRole;
    }


    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getJobRole() {
        return jobRole;
    }

    public void setJobRole(String jobRole) {
        this.jobRole = jobRole;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empId == employee.empId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", salary=" + salary +
                ", jobRole='" + jobRole + '\'' +
                '}';
    }

    //now override comparable interface method to compare objects
    //compareTo->it compare only one member at a time (u can compare with id,u can compare with name)
    //sorting objects based on id
    /*
    @Override
    public int compareTo(Employee emp) {
        return this.empId - emp.empId; (for int '-')
    }
    */
    //sorting objects based on employee name
    @Override
    public int compareTo(Employee emp) {
        return this.empName.compareTo(emp.empName); //(for string we use currobj.compareTo(givenobj))
    }


}
