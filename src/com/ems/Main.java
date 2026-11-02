//package com.ems;

//import java.util.List;
//
//import com.ems.dao.EmployeeDAO;
//import com.ems.model.Employee;
//
//public class Main {
//
//    public static void main(String[] args) {
//
////        Employee emp = new Employee(
////            1,
////            "aman",
////            "aman@example.com",
////            "it",
////            31000,
////            "2003-12-1"
////        );
//
//        EmployeeDAO dao = new EmployeeDAO();
//
//       //boolean result = dao.updateEmployee(emp);
//        
//        dao.getAllEmployees();
//        List<Employee> employees = dao.getAllEmployees();
//
//        for (Employee emp1 : employees) {
//
//            System.out.println("ID: " + emp1.getId());
//            System.out.println("Name: " + emp1.getName());
//            System.out.println("Email: " + emp1.getEmail());
//            System.out.println("Department: " + emp1.getDepartment());
//            System.out.println("Salary: " + emp1.getSalary());
//            System.out.println("Joining Date: " + emp1.getjoining_date());
//
//            System.out.println("-------------------------");
//        }
//       
////        if (result) {
////            System.out.println("Employee update successfully!");
////        } else {
////            System.out.println("Failed to update employee.");
////        }
//        	
//        
//        //EmployeeDAO dao1 = new EmployeeDAO();
////        boolean result1 = dao.deleteEmployee(6);
////        
////        if(result1) {
////        	System.out.println("Employee delete successfully");
////        }else{
////        	System.out.println("Employee failed to delete");
////        }
//        
//    }
//    
//
//
//}
//// the main.java contains all the running code here we execute what we have done 



	
package com.ems;
import com.ems.dao.EmployeeDAO;
import java.util.List;
import com.ems.model.Employee;
 
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EmployeeDAO dao = new EmployeeDAO();

        int choice;

        do {
        		
            System.out.println("\n====================================");
            System.out.println("     EMPLOYEE MANAGEMENT SYSTEM");
            System.out.println("====================================");

            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Search Employee By ID");
            System.out.println("4. Update Employee");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");

            System.out.println("------------------------------------");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                	
                    System.out.println("Enter Employee Details");	
                    System.out.println("Employee Name : ");
                    String name = sc.next();
                    System.out.println("Employee Email : ");
                    String email = sc.next();
                    System.out.println("Employee Department : ");
                    String department = sc.next();
                    System.out.println("Employee Salary : ");
                    Double salary = sc.nextDouble();
                    Employee emp = new Employee();   
                    emp.setName(name);
                    emp.setEmail(email);
                    emp.setDepartment(department);
                    emp.setSalary(salary);
                    boolean result = dao.addEmployee(emp);
                    if(result) {
                    System.out.println("Employee Created Successfully !!!");
                    }else {
                    	System.out.print("Employee failed too created.");
                    }
                    break;

                case 2:
                	List<Employee> employees = dao.getAllEmployees();
                    System.out.println("\nAll Employees Selected\n");
                    dao.getAllEmployees();
                    
                            for (Employee emp1 : employees) {
                    
                                System.out.println("ID: " + emp1.getId());
                                System.out.println("Name: " + emp1.getName());
                                System.out.println("Email: " + emp1.getEmail());
                                System.out.println("Department: " + emp1.getDepartment());
                                System.out.println("Salary: " + emp1.getSalary());
                                System.out.println("Joining Date: " + emp1.getjoining_date());
                    
                                System.out.println("-------------------------");
                            }
                    break;

                case 3:
                    System.out.println("\nEnter Employee ID to Search\n ");
                    int id = sc.nextInt();
                    dao.searchEmployee(id);
                    break;

                case 4:
                    System.out.println("Update Employee data");
                    System.out.print("Enter Employee ID: ");
                    int Uid = sc.nextInt();
                    System.out.println("Employee Name : ");
                    String Uname = sc.next();
                    System.out.println("Employee Email : ");
                    String Uemail = sc.next();
                    System.out.println("Employee Department : ");
                    String Udepartment = sc.next();
                    System.out.println("Employee Salary : ");
                    Double Usalary = sc.nextDouble();
                    Employee emp1 = new Employee();   
                    emp1.setId(Uid);
                    emp1.setName(Uname);
                    emp1.setEmail(Uemail);
                    emp1.setDepartment(Udepartment);
                    emp1.setSalary(Usalary);
                    boolean rs = dao.updateEmployee(emp1);
                    if(rs) {
                    System.out.println("Employee Updated Successfully !!!");
                    }else {
                    	System.out.print("Employee failed to Update.");
                    }
                    break;

                case 5:
                	System.out.println("\nEnter the Employee Id to Delete:");
                	int del = sc.nextInt();
                    
                    boolean result1 = dao.deleteEmployee(del);
                
                    if(result1) {
                    	System.out.println("Employee delete successfully");
                    }else{
                    	System.out.println("Employee failed to delete");
                    }
                    break;

                case 6:
                    System.out.println("Exiting Application...");
                    break;

                default:
                    System.out.println("Invalid Choice! Try Again.");
            }

        } while (choice != 6);

        sc.close();
    }
}










