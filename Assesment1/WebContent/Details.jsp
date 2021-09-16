<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	 
   
<%@page import="java.sql.DriverManager"%>  
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

<%
String clientno= request.getParameter("id");
String driver = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String database = "reg1";
String userid = "root";
String password = "root123";
try {
Class.forName(driver);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
try{
connection = DriverManager.getConnection(connectionUrl+database, userid, password);
statement=connection.createStatement();
String sql ="select * from client where clientno = '" + clientno + "'";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>

<table>
<tr>
<td>ID:</td><td><%=resultSet.getString("id") %></td>
</tr>
<tr>
<td>Client Number:</td><td><%=resultSet.getString("clientno") %></td>
</tr>
<tr>
<td>DOB:</td><td><%=resultSet.getString("dob") %></td>
</tr>
<tr>
<td>Mobile:</td><td><%=resultSet.getString("mobile") %></td>
</tr>
<tr>
<td>Address:<td><%=resultSet.getString("address") %></td>
</tr>
<tr>
<td>State</td><td><%=resultSet.getString("state") %></td>
</tr>
<tr>
<td>Initial Amount:</td><td><%=resultSet.getString("initailno") %></td>
</tr>
<tr>
<td>Name:</td><td><%=resultSet.getString("name") %></td>
</tr>
<tr>
<td>Password:</td><td><%=resultSet.getString("password") %></td>
</tr>
<tr>
<td>Age:</td><td><%=resultSet.getString("age") %></td>
</tr>
 
<tr>
<td>Nation:</td><td><%=resultSet.getString("nation") %></td>
</tr>
</table>
<%
}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
</body>
</html>