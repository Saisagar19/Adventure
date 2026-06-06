package com.app.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import com.app.dao.EmployeeDao;
import com.app.model.Employee;

@WebServlet("/getId")
public class GetIdData extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public GetIdData() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		int id = Integer.parseInt(request.getParameter("txtId"));
		
		try {
			Employee e1 = EmployeeDao.getEmpByID(id);
//			request.setAttribute("empDetails", e1);
			HttpSession session = request.getSession();
			session.setAttribute("empDetails", e1);
			request.getRequestDispatcher("/views/showDetails.jsp").forward(request, response);
//			out.write("<h2>Employee Details:</h2>"+ e1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
