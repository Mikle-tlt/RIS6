<%--
  Created by IntelliJ IDEA.
  User: misha
  Date: 26.04.2023
  Time: 12:30
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All Street</title>
</head>
<body>
<h1>Address List</h1>
<c:if test="${empty addressList}">
  <p>Nothing found!</p>
</c:if>
<table>
  <thead>
  <tr>
    <th>House</th>
    <th>Name</th>
    <th>Organization</th>
  </tr>
  </thead>
  <tbody>
  <c:forEach items="${addressList}" var="address">
    <tr>
      <td>${address.house}</td>
      <td>${address.name}</td>
      <td>${address.organization}</td>
    </tr>
  </c:forEach>
  </tbody>
</table>
<a href="/RIS6/streetByOrganization">Find streets by organization</a><br/>
<a href="/RIS6/organizationByStreet">Find organization by street</a><br/>
<a href="/RIS6/allByHouse">Find by house</a><br/>
<a href="/RIS6/allAddress">Viev all street</a>
</body>
</html>
