<%@page import="ru.appline.logic.Model" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <title>Add</title>
</head>
<body>
<h3>Новый пользователь</h3>
</form>
<form method="post" action="add">
    <label>Имя:
        <input type="text" name="name"><br/>
    </label>
    <label>Фамилия:
        <input type="text" name="surname"><br/>
    </label>
    <label>Зарплата:
        <input type="text" name="salary"><br/>
    </label>
    <button type="submit">Создать
    </button>
</form>
<a href="index.jsp">
    Домой
</a>
</body>
</html>
