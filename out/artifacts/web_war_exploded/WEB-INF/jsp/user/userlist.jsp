<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/11/6 0006
  Time: 下午 2:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户明细表查询</title>
</head>
<body>
<table width="100%" border="1">
    <tr>
        <th>id</th>
        <th>username</th>
        <th>sex</th>
        <th>address</th>

    </tr>

    <c:forEach var="user" items="${requestScope.userlist}">
    <tr>
        <td>${user.id}</td>
        <td>${user.username}</td>
        <td>${user.sex}</td>
        <td>${user.address}</td>


    </tr>
    </c:forEach>

</body>
</html>
