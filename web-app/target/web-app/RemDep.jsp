<%--
  Created by IntelliJ IDEA.
  User: Pavel
  Date: 03.05.2014
  Time: 23:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8" />
    <title>
        Remove Department
    </title>
    <link rel="stylesheet" type="text/css" href="css/forms.css" />
    <script type="text/javascript" src="js/forms.js"></script>
</head>
<body>

<div id="outer">
    <div id="form">
        <h1>
            Remove Department
        </h1>

        <form  action="/RemoveDepartmentServlet" id="f1" method="get">
            <p> Name : <input type="text" name="Name" /> </p>
            <p>
                <input type="submit"  value="Remove" />
                <input type="reset"  value="Reset" />
                <a href="DepartmentDb.jsp"> <input type="button" value="Return"  /></a>
            </p>

        </form>



    </div> <!-- form -->
</div> <!-- outer -->
</body>
</html>
