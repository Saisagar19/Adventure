package com.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.app.model.Employee;

public class EmployeeDao {

	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:1919/practice", "root", "root");
			return conn;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	public static Employee getEmpByID(int id) throws SQLException {
		Connection conn = getConnection();
		Statement st = conn.createStatement();
		String query = "SELECT * FROM emp WHERE ID = " + id;
		ResultSet set = st.executeQuery(query);

		Employee e = new Employee();
		if (set.next()) {
//			System.out.println("Id " + set.getInt("id") + " Name: " + set.getString("firstname") + " Lastname : "
//					+ set.getString("lastname") + " salary:" + set.getString("salary"));
			e.setId(set.getInt("id"));
			e.setFirstName(set.getString("firstName"));
			e.setLastName(set.getString("lastName"));
			e.setSalary(set.getInt("salary"));
			return e;
		} else {
			System.out.println("No data found");
			return null;
		}

	}

}
