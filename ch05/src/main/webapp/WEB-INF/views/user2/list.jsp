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
    <title>User2::List</title>
</head>
<body>
<h3>user1 목록</h3>
<a href="/ch05">처음으로</a>
<a href="/ch05/user2/register">등록하기</a>
<table border="1">
    <tr>
        <th>아이디</th>
        <th>이름</th>
        <th>생년월일</th>
        <th>주소</th>
        <th>관리</th>
    </tr>

    <c:forEach var ="user2" items="${user2DTOs}">
        <tr>
            <td>${user2.uid}</td>
            <td>${user2.name}</td>
            <td>${user2.birth}</td>
            <td>${user2.addr}</td>
            <td>
                <a href="/ch05/user2/modify?uid=${user2.uid}">수정</a>
                <a href="/ch05/user2/delete?uid=${user2.uid}">삭제</a>
            </td>
        </tr>
    </c:forEach>

</table>
</body>
</html>
