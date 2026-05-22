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

@WebServlet("/serv1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Servlet1() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();

		String userName = request.getParameter("txtUserName");
		String pass = request.getParameter("txtPassword");

		if (userName.equals("admin") && pass.equals("admin123")) {
			request.getRequestDispatcher("StudMarks.html").forward(request, response);
		} 
		else{
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:1919/universitydata", "root",
						"root");
				String Query = "Select * from Student Where username = ? AND pwd = ?";
				PreparedStatement pstm = conn.prepareStatement(Query);
				pstm.setString(1, userName);
				pstm.setString(2, pass);
				ResultSet res = pstm.executeQuery();

				if(res.next())
				{
					request.getRequestDispatcher("checkRes.html").forward(request, response);
//					response.sendRedirect("checkRes.html");
				}
				else
				{
//					response.sendRedirect("login.html?error=1");
					pw.write("<h2>Not a valid prn</h2>");
					
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
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
