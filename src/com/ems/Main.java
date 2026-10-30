package com.ems;

import java.util.List;

import com.ems.dao.EmployeeDAO;
import com.ems.model.Employee;

public class Main {

    public static void main(String[] args) {

        Employee emp = new Employee(
            1,
            "aman",
            "aman@example.com",
            "it",
            31000,
            "2003-12-1"
        );

        EmployeeDAO dao = new EmployeeDAO();

       boolean result = dao.updateEmployee(emp);
        
        dao.getAllEmployees();
        List<Employee> employees = dao.getAllEmployees();

        for (Employee emp1 : employees) {

            System.out.println("ID: " + emp1.getId());
            System.out.println("Name: " + emp1.getName());
            System.out.println("Email: " + emp1.getEmail());
            System.out.println("Department: " + emp1.getDepartment());
            System.out.println("Salary: " + emp1.getSalary());
            System.out.println("Joining Date: " + emp1.getjoining_date());

            System.out.println("-------------------------");
        }
       
        if (result) {
            System.out.println("Employee update successfully!");
        } else {
            System.out.println("Failed to update employee.");
        }
    }
}
// the main.java contains all the running code here we execute what we have done 
