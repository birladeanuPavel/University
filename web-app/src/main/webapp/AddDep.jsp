<%--
  Created by IntelliJ IDEA.
  User: Pavel
  Date: 03.05.2014
  Time: 20:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8" />
    <title>
        Add Department
    </title>
    <link rel="stylesheet" type="text/css" href="css/forms.css" />
    <script type="text/javascript" src="js/forms.js"></script>
</head>
<body>
<div id="outer">
<div id="form">

<form action="/ServletPath" method="get" onsubmit="return display()">
    <p> Id Faculty : <input type="text" name="IdFaculty" autocomplete="off"/> </p>
    <p> Name : <input type="text" name="Name" /></p>
    <p>
        <input type="submit"  value="Add"  onclick="return display()" />
        <input type="reset"  value="Reset" />
        <a href="DepartmentDb.jsp"> <input type="button" value="Return"  /></a>
    </p>

</form>
</div> <!-- results -->
</div>
</body>
</html>
