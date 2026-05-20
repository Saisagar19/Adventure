package project_01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class My_Connection {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Step 1: Driver Load successfully");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:1919/infoway", "root", "root");
			System.out.println("Step 2: Connection establish successfully");
			String query = "SELECT ename FROM EMP";
			System.out.println("Step 3: Query is created");
			Statement st = conn.createStatement();
			System.out.println("Step 4: Creating sql statement");
			ResultSet set = st.executeQuery(query);
			System.out.println("Step 5: Submit sql query");
			while (set.next()) {
				System.out.println("Name - > " + set.getString(1));
			}
			System.out.println("Step 6: process the data");
			st.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e1) {
			System.out.println(e1);
		} catch (Exception e1) {
			System.out.println(e1);
		}
	}
}
