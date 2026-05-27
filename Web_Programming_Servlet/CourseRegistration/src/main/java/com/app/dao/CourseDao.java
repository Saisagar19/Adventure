package com.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.app.model.Courses;
import com.app.util.DBConnection;

public class CourseDao {

	public void addCourses(Courses c) throws ClassNotFoundException, SQLException {
		String sql = "INSERT INTO courses (name, description) VALUES (?,?)";
		try (Connection conn = DBConnection.getConnection(); 
				PreparedStatement pstm = conn.prepareStatement(sql)) {

			pstm.setString(1, c.getName());
			pstm.setString(2, c.getDescription());
			pstm.executeUpdate();
		}
	}

	public List<Courses> getAllCourses() throws ClassNotFoundException, SQLException {
		List<Courses> li = new ArrayList<Courses>();
		String sql = "SELECT * FROM courses";

		try (Connection conn = DBConnection.getConnection();
				PreparedStatement pstm = conn.prepareStatement(sql);
				ResultSet s = pstm.executeQuery()) {

			while (s.next()) {
				Courses c = new Courses();
				c.setId(s.getInt("id"));
				c.setName(s.getString("name"));
				c.setDescription(s.getString("description"));
				li.add(c);
			}
		}
		return li;
	}
	public List<Courses> getAllCoursesById(int i) throws ClassNotFoundException, SQLException {
		List<Courses> li = new ArrayList<Courses>();
		String sql = "SELECT c.id, c.name,c.description FROM courses c JOIN enrollments e ON c.id = e.course_id WHERE e.student_id = ?";

		try (Connection conn = DBConnection.getConnection();
				PreparedStatement pstm = conn.prepareStatement(sql);) {
			pstm.setInt(1, i);
			ResultSet s = pstm.executeQuery();
			while (s.next()) {
				Courses c = new Courses();
				c.setId(s.getInt("id"));
				c.setName(s.getString("name"));
				c.setDescription(s.getString("description"));
				li.add(c);
			}
		}
		return li;
	}

	public void updateCourse(Courses c) throws ClassNotFoundException, SQLException {
		String sql = "UPDATE courses SET name = ? ,description = ? WHERE id = ?";
		try (Connection conn = DBConnection.getConnection(); 
				PreparedStatement pstm = conn.prepareStatement(sql)) {
			pstm.setString(1, c.getName());
			pstm.setString(2, c.getDescription());
			pstm.setInt(3, c.getId());
			pstm.executeUpdate();
		}
	}

	public void deleteCourse(int id) throws ClassNotFoundException, SQLException {
		String sql2 = "DELETE FROM enrollments WHERE course_id = ?";
		String sql = "DELETE FROM courses WHERE id = ? ";
		try (Connection conn = DBConnection.getConnection(); 
				PreparedStatement pstm = conn.prepareStatement(sql);
				PreparedStatement pstm2 = conn.prepareStatement(sql2)) {
			pstm.setInt(1, id);
			pstm.executeUpdate();
			
			pstm2.setInt(1, id);
			pstm2.executeUpdate();
		}
	}

}
