package com.tangcz.javatec01.ch06.interfaces;

/**
 * @author 月汐
 * @date 2019/09/25 19:30
 */
public class Employee implements Comparable<Employee> {

    private String name;
    private double salary;

    public Employee() {
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee o) {
        return Double.compare(salary, o.salary);
    }
}
