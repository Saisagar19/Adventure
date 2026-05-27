package com.app.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.app.dao.CourseDao;
import com.app.dao.StudentDao;
import com.app.model.Courses;
import com.app.model.Student;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/viewServ")
public class viewServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public viewServ() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession(false);
		if(session == null || session.getAttribute("loginStudent") == null)
		{
			response.sendRedirect("index.jsp");
			return;
		}
		
		Student sId = (Student) session.getAttribute("loginStudent");
		int id = sId.getId();
		
		try {
			Student student = new StudentDao().getAllCoursesById(id);
			List<Courses> course = new CourseDao().getAllCoursesById(id);

			request.setAttribute("student", student);
			request.setAttribute("courses", course);

			request.getRequestDispatcher("viewData.jsp").forward(request, response);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
