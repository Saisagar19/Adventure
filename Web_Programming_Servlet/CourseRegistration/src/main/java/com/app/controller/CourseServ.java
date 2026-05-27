package com.app.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.app.model.Courses;
import com.app.util.DBConnection;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/CourseServ")
public class CourseServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CourseServ() {
        super();
   
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sql = "SELECT * FROM Courses";
		
		try {
			Connection conn = DBConnection.getConnection();
			PreparedStatement pstm = conn.prepareStatement(sql);
			ResultSet set = pstm.executeQuery();
			
			List<Courses> course = new ArrayList<Courses>();
			while(set.next())
			{
				Courses c =new Courses();
				c.setId(set.getInt("id"));
				c.setName(set.getString("name"));
				c.setDescription(set.getString("description"));;
				course.add(c);
			}
			request.setAttribute("courses", course);
			request.getRequestDispatcher("courses.jsp").forward(request, response);
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
