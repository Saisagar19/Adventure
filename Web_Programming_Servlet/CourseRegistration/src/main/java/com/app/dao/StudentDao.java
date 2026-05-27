package com.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.app.model.Courses;
import com.app.model.Student;
import com.app.util.DBConnection;

public class StudentDao {

	public boolean registerStudent(Student student) throws SQLException, ClassNotFoundException {
		String sqlQuery = "INSERT INTO student (firstname,lastname,email,age,_password) VALUES(?,?,?,?,?)";
		try (Connection conn = DBConnection.getConnection(); 
				PreparedStatement pstm = conn.prepareStatement(sqlQuery)) {
			pstm.setString(1, student.getFirstName());
			pstm.setString(2, student.getLastName());
			pstm.setString(3, student.getEmail());
			pstm.setInt(4, student.getAge());
			pstm.setString(5, student.getPassword());

			return pstm.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public Student getAllCoursesById(int i) throws ClassNotFoundException, SQLException {
		String sql = "SELECT id,firstname,lastname,age,email FROM student Where id = ?";
		Student c = null;
		try (Connection conn = DBConnection.getConnection();
				PreparedStatement pstm = conn.prepareStatement(sql);
				){
			pstm.setInt(1, i);
			ResultSet s = pstm.executeQuery();
			if(s.next()) {
				c = new Student();
				c.setId(s.getInt("id"));
				c.setFirstName(s.getString("firstname"));
				c.setLastName(s.getString("lastname"));
				c.setAge(s.getInt("age"));
				c.setEmail(s.getString("email"));
			}
		}
		return c;
	}

	public Student login(String email, String password) throws SQLException, ClassNotFoundException {
		String sqlQuery = "SELECT * FROM student WHERE email = ? AND _password = ?";
		try (Connection conn = DBConnection.getConnection(); 
				PreparedStatement pstm = conn.prepareStatement(sqlQuery)) {
			pstm.setString(1, email);
			pstm.setString(2, password);
			ResultSet rs = pstm.executeQuery();

			if (rs.next()) {
				Student st = new Student(rs.getInt("id"), rs.getString("firstname"), rs.getString("lastname"),
						rs.getString("email"),rs.getString("_password"),rs.getInt("age"));
				return st;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
