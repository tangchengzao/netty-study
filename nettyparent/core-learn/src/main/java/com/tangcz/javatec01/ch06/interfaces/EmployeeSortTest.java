package com.tangcz.javatec01.ch06.interfaces;

import java.util.Arrays;

/**
 * @author 月汐
 * @date 2019/09/25 19:29
 */
public class EmployeeSortTest {

    public static void main(String[] args) {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Harry", 35000);
        staff[1] = new Employee("Harry1", 55000);
        staff[2] = new Employee("Harry2", 35000);

        Arrays.sort(staff);

        for (Employee employee : staff) {
            System.out.println("name = " + employee.getName() + ", salary = " + employee.getSalary());
        }
    }

}
