<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Result</title>
</head>
<style>
    body{
        font-family: Arial, sans-serif;
        background-color: #f2f2f2;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
        margin: 0;
    }

    form{
        background-color: white;
        padding: 25px;
        border-radius: 8px;
        box-shadow: 0px 0px 10px rgba(0,0,0,0.2);
    }

    table{
        border-collapse: collapse;
        width: 100%;
        min-width: 700px;
    }

    th{
        background-color: #4CAF50;
        color: white;
        padding: 12px;
        text-align: center;
    }

    td{
        padding: 12px;
        text-align: center;
        border: 1px solid #ddd;
    }

    tr:nth-child(even){
        background-color: #f9f9f9;
    }

    tr:hover{
        background-color: #f1f1f1;
    }

    h2{
        text-align: center;
        color: #333;
        margin-bottom: 20px;
    }
</style>
<body>
	<form action="Result.jsp" method="get">
		<table border="1">
			<tr>
				<th>PRN</th>
				<th>Subject1</th>
				<th>Subject2</th>
				<th>Subject3</th>
				<th>Subject4</th>
				<th>Subject5</th>
				<th>Percentage</th>
				<th>Result</th>
			</tr>
			<tr>
				<td>
					<%=
					request.getAttribute("prn")
					%>
				</td>
				<td>
					<%=
					request.getAttribute("sub1")
					%>
				</td>
				<td>
					<%=
					request.getAttribute("sub2")
					%>
				</td>
				<td>
					<%=
					request.getAttribute("sub3")
					%>
				</td>
				<td>
					<%=
					request.getAttribute("sub4")
					%>
				</td>
				<td>
					<%=
					request.getAttribute("sub5")
					%>
				</td>
				<td>
					<%=
					request.getAttribute("per")
					%>
				</td>
				<td>
					<%=
					request.getAttribute("res")
					%>
				</td>

			</tr>

		</table>
	</form>
</body>
</html>