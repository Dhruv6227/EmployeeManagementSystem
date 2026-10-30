package com.ems.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ems.model.Employee;
import com.ems.util.DatabaseConnection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
public class EmployeeDAO {

    public boolean addEmployee(Employee emp) {

        String sql = "INSERT INTO employees (name, email, department, salary, joining_date) "
                   + "VALUES (?, ?, ?, ?, ?)";

        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, emp.getName());
            ps.setString(2, emp.getEmail());
            ps.setString(3, emp.getDepartment());
            ps.setDouble(4, emp.getSalary());
            ps.setString(5, emp.getjoining_date());

            int rows = ps.executeUpdate();

            return rows > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public List<Employee> getAllEmployees() {

        List<Employee> employees = new ArrayList<>();

        String sql = "SELECT * FROM employees";

        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {

                Employee emp = new Employee();

                emp.setId(rs.getInt("id"));
                emp.setName(rs.getString("name"));
                emp.setEmail(rs.getString("email"));
                emp.setDepartment(rs.getString("department"));
                emp.setSalary(rs.getDouble("salary"));
                emp.setJoining_Date(rs.getString("joining_date"));
                employees.add(emp);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return employees;
    }
    
    public boolean updateEmployee(Employee emp) {
    	String sql= "UPDATE employees SET name = ?, email= ?, department = ?, salary = ?, joining_date = ? where id = ?";
    	try(Connection con = DatabaseConnection.getConnection();
    			PreparedStatement ps = con.prepareStatement(sql)){
    			ps.setString(1, emp.getName());
    			ps.setString(2, emp.getEmail());
    			ps.setString(3, emp.getDepartment());
    			ps.setDouble(4, emp.getSalary());
    			ps.setString(5, emp.getjoining_date());
    			ps.setInt(6, emp.getId());
    			
    			int rows = ps.executeUpdate();
    			return rows >0;
    	}catch(SQLException e){
    		e.printStackTrace();
    		return false; 
    	}
    }
    

}
//Remember: DAO is responsible for communicating with the database.
//Its purpose is to handle database operations.
//We create a separate DAO class so that database queries do not clutter our main application code.