<%--
  Created by IntelliJ IDEA.
  User: lotte06
  Date: 2025-03-12
  Time: 오전 9:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>User1::List</title>
</head>
<body>
<h3>user1 목록</h3>
<a href="/ch05">처음으로</a>
<a href="/ch05/user1/register">등록하기</a>
<table border="1">
    <tr>
        <th>아이디</th>
        <th>이름</th>
        <th>휴대폰</th>
        <th>나이</th>
        <th>관리</th>
    </tr>

    <c:forEach var ="user1" items="${user1DTOs}">
        <tr>
            <td>${user1.uid}</td>
            <td>${user1.name}</td>
            <td>${user1.hp}</td>
            <td>${user1.age}</td>
            <td>
                <a href="/ch05/user1/modify?uid=${user1.uid}">수정</a>
                <a href="/ch05/user1/delete?uid=${user1.uid}">삭제</a>
            </td>
        </tr>
    </c:forEach>

</table>
</body>
</html>
