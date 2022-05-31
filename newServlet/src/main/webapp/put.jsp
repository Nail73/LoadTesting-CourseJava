<%@page import="ru.appline.logic.Model" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <title>Edit user</title>
</head>
<body>
<h3>Изменение данных пользователя</h3>
<form method="post" action="put">
    <label>ID:
        <input type="text" name="id"><br/>
    </label>
    <label>Имя:
        <input type="text" name="name"><br/>
    </label>
    <label>Фамилия:
        <input type="text" name="surname"><br/>
    </label>
    <label>Зарплата:
        <input type="text" name="salary"><br/>
    </label>
    <button type="submit">Редактировать
    </button>
</form>
<a href="index.jsp">
    Домой
</a>
</body>
</html>
