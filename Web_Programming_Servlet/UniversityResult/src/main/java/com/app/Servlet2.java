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
import java.sql.SQLException;

@WebServlet("/serv2")
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Servlet2() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();

		String prn = request.getParameter("txtPRN");
		String sub1 = request.getParameter("txtSub1");
		String sub2 = request.getParameter("txtSub2");
		String sub3 = request.getParameter("txtSub3");
		String sub4 = request.getParameter("txtSub4");
		String sub5 = request.getParameter("txtSub5");
		
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:1919/universitydata", "root",
					"root");
			String query = "UPDATE student SET subject1 = ?,subject2 = ?,subject3 = ?,subject4 = ?,subject5 = ? WHERE prn = ?";
//			String Query = "INSERT INTO student VALUES()";
			PreparedStatement pstm = conn.prepareStatement(query);
			pstm.setFloat(1, Float.parseFloat(sub1));
			pstm.setFloat(2, Float.parseFloat(sub2));
			pstm.setFloat(3, Float.parseFloat(sub3));
			pstm.setFloat(4, Float.parseFloat(sub4));
			pstm.setFloat(5, Float.parseFloat(sub5));
			pstm.setString(6, prn);
			int res = pstm.executeUpdate();
			
			if(res > 0)
			{
				pw.write("Record updated");
			}
			else
			{
				pw.write("Record is not updated");
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
