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

//@WebServlet("/serv3")
public class demo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public demo() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String prn = request.getParameter("txtPRN");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:1919/universitydata", "root",
					"root");
			String query = "Select prn,subject1,subject2,subject3,subject4,subject5  from student where prn = ?";
			PreparedStatement pstm = conn.prepareStatement(query);
			pstm.setString(1, prn);
			ResultSet set = pstm.executeQuery();
			
			pw.write("<html>");
			pw.write("<body>");
			
			if(set.next())
			{
				float s1 = set.getFloat("subject1");
				float s2 = set.getFloat("subject2");
				float s3 = set.getFloat("subject3");
				float s4 = set.getFloat("subject4");
				float s5 = set.getFloat("subject5");
				
				float total = s1 + s2 + s3 + s4 + s5;

	            double percentage = total / 5.0;

	            String result = "PASS";

	            if (s1 < 35 || s2 < 35 || s3 < 35 || s4 < 35 || s5 < 35) {
	                result = "FAIL";
	            }
	            pw.write("<h2>Student Result</h2>");

	            pw.write("<table border='1' cellpadding='10'>");

	            pw.write("<tr>");
	            pw.write("<th>PRN</th>");
	            pw.write("<th>Subject1</th>");
	            pw.write("<th>Subject2</th>");
	            pw.write("<th>Subject3</th>");
	            pw.write("<th>Subject4</th>");
	            pw.write("<th>Subject5</th>");
	            pw.write("<th>Total</th>");
	            pw.write("<th>Percentage</th>");
	            pw.write("<th>Result</th>");
	            pw.write("</tr>");
	            pw.write("<tr>");
	            pw.write("<td>" + set.getString("prn") + "</td>");
	            pw.write("<td>" + s1 + "</td>");
	            pw.write("<td>" + s2 + "</td>");
	            pw.write("<td>" + s3 + "</td>");
	            pw.write("<td>" + s4 + "</td>");
	            pw.write("<td>" + s5 + "</td>");
	            pw.write("<td>" + total + "</td>");
	            pw.write("<td>" + percentage + "%</td>");
	            pw.write("<td>" + result + "</td>");
	            pw.write("</tr>");
	            pw.write("</table>");

	        } else {

	            pw.write("<h3>No Student Found</h3>");
	        }

	        pw.write("</body>");
	        pw.write("</html>");

	        conn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
