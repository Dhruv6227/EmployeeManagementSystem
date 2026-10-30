package com.ems.model;
//The word model refers to classes that represent entities or objects in your application.
//Employee ID, Name, Email, Department, Salary

public class Employee {

    private int id;
    private String name;
    private String email;
    private String department;
    private double salary;
    private String joining_date;

    public Employee(int id, String name, String email,
                    String department, double salary, String joining_date) {

        this.id = id;
        this.name = name;
        this.email = email;
        this.department = department;
        this.salary = salary;
        this.joining_date = joining_date;
    }
 
    public Employee() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }
    public String getjoining_date() {
    	return joining_date;
    }

	public void setId(int id) {
		this.id=id;
			
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public void setJoining_Date(String joining_date){
		this.joining_date = joining_date; 
	}
}


