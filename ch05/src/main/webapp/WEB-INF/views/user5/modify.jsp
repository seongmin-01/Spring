<%--
  Created by IntelliJ IDEA.
  User: lotte06
  Date: 2025-03-12
  Time: 오전 9:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>user1 수정</h3>
<a href="/ch05">처음으로</a>
<a href="/ch05/user1/list">목록이동</a>

<form action="/ch05/user1/modify" method="post">
    <table border="1">
        <tr>
            <td>아이디</td>
            <td><input type="text" name="uid" placeholder="아이디 입력" readonly value="${user1DTO.uid}"></td>
        </tr>
        <tr>
            <td>이름</td>
            <td><input type="text" name="name" placeholder="이름 입력" value="${user1DTO.name}"></td>
        </tr>
        <tr>
            <td>휴대폰</td>
            <td><input type="text" name="hp" placeholder="휴대폰 입력" value="${user1DTO.hp}"></td>
        </tr>
        <tr>
            <td>나이</td>
            <td><input type="number" name="age" placeholder="나이 입력" value="${user1DTO.age}"></td>
        </tr>
        <tr>
            <td colspan="2" align="right">
                <input type="submit" value="수정하기">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
