<%--
  Created by IntelliJ IDEA.
  User: misha
  Date: 05.05.2023
  Time: 12:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Input house</title>
</head>
<body>
<form action="allByHouse" method="Post">
    <p>Input house: </p>
    <label>
        <input type="text" name="string" pattern="\d+" required>
    </label>
    <button type="submit"><p>Find</p></button>
</form>
</body>
</html>
