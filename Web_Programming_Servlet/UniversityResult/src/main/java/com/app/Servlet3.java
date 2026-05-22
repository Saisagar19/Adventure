package com.app;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;

@WebServlet("/serv3")
public class Servlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Servlet3() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();

//		String userName = request.getParameter("txtUserName");
//		String Pass = request.getParameter("txtPassword");
		String prnNO = request.getParameter("txtPRN");
//		if (userName.equals("admin") && Pass.equals("admin123")) {
//			request.getRequestDispatcher("StudMarks.html").forward(request, response);
//		}

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:1919/universitydata", "root", "root");
			String Query = "Select * from Student Where prn = ?";
			PreparedStatement pstm = conn.prepareStatement(Query);
			pstm.setString(1, prnNO);
//			pstm.setString(2, Pass);
			ResultSet set = pstm.executeQuery();
			boolean found = false;
			while (set.next()) {
				found = true;
				String prn = set.getString(1);
				float sub1 = set.getFloat(4);
				float sub2 = set.getFloat(5);
				float sub3 = set.getFloat(6);
				float sub4 = set.getFloat(7);
				float sub5 = set.getFloat(8);

				float total = sub1 + sub2 + sub3 + sub4 + sub5;
				double percentage = (total / 5.0);
				String res = "PASS";
				if (sub1 < 35 || sub2 < 35 || sub3 < 35 || sub4 < 35 || sub5 < 35) {
					res = "FAIL";
				} 
				
				request.setAttribute("prn", prn);
				request.setAttribute("sub1", sub1);
				request.setAttribute("sub2", sub2);
				request.setAttribute("sub3", sub3);
				request.setAttribute("sub4", sub4);
				request.setAttribute("sub5", sub5);
				request.setAttribute("per", percentage);
				request.setAttribute("res", res);
				
				request.getRequestDispatcher("Result.jsp").forward(request, response);
				
			}
			if(found == false)
			{
				 pw.write("<h2>No Student Found</h2>");
			}
			conn.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
