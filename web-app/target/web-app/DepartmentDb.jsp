<%@ page import="com.pavel.university.entity.Department" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.pavel.university.service.DepartmentService" %>
<%@ page import="com.pavel.university.service.impl.DepartmentServiceImpl" %>
<%--
  Created by IntelliJ IDEA.
  User: Pavel
  Date: 02.05.2014
  Time: 22:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8" />
    <title>
        Department
    </title>
    <link rel="stylesheet" type="text/css" href="css/depStyle.css">
</head>
<body>
<h1 >
    University Database
</h1>
<table>
    <caption>
        Department
    </caption>
    <thead>
    <tr>
        <th> Id Department </th>
        <th> Id Faculty </th>
        <th> Name </th>
        <th> Edit</th>
        <th> Remove</th>
    </tr>
    </thead>
    <tbody>

 <%
        List<Department> arrayList = new ArrayList<Department>();
        DepartmentService departmentService = new DepartmentServiceImpl();
        Department department = new Department();
        arrayList =  departmentService.getAllDepartment();
        department = arrayList.get(1);
        %>

   <%
     for(Department dep:arrayList ){

   %>
    <tr>
        <td><%=dep.getIdDepartment()%></td>
        <td><%=dep.getFaculty().getIdFaculty()%></td>
        <td><%=dep.getName()%></td>
        <td align="center"><a href="EditDep.jsp"> <img src="images/paper-small.png" /> </a></td>
        <td align="center"><a href="RemDep.jsp"> <img src="images/scissors-small.png" /></a></td>
    </tr>
     <%
     }

   %>


    <tbody>
</table>
<form>
    <a href="AddDep.jsp"> <input type="button" value="Add department"  /></a>
    <a  href="main.html"> <input type="button" value="Go to main page " /></a>
</form>

</body>
</html>
